/**
 * 첨부파일 공통 모듈
 */
var KitechAttach = null;

var KitechAttach = (function(Rn) {
	
	'use strict';
	  
	var james = { // internal name of library
		
		/**
		 * Variable Area
		 */
		  uploadMap: {}
		, uploadObj: []
		, saveCallback: undefined
		
		/**
		 * Initialize function - indicates if our library is present
		 */
		, init: function() {
			var bar = '====================================================';
			var about = {
				  Subject : 'Kitech Attach File Component Library'
				, Version : 2.11
				, Author : 'James'
				, Created : '2022-03-02'
				, Updated : '2022-03-02'
			};
			this.log(bar);
			Object.keys(about).map(function (key) {
				KitechAttach.log( '['+ key +': '+ about[key] +']');
			});
			this.log(bar);
			
			// 이벤트 헨들러 매핑
			window.RAONKUPLOAD_CreationComplete = this.event.creationComplate;
			window.RAONKUPLOAD_AfterAddAllFile = this.event.afterAddAllFile;
			window.RAONKUPLOAD_AfterAddFile = this.event.afterAddFile;
			window.RAONKUPLOAD_BeforeDeleteFile = this.event.beforeDeleteFile;
			window.RAONKUPLOAD_BeforeUpload = this.event.beforeUpload;
			window.RAONKUPLOAD_UploadComplete = this.event.uploadComplete;
			window.RAONKUPLOAD_CustomAction = this.event.customAction;
			window.RAONKUPLOAD_UploadingCancel = this.event.uploadingCancel;
			window.RAONKUPLOAD_OnError = this.event.onError;
			this.log('init(): 이벤트 헨들러 매핑 완료!!');
		}
		
		, destroy: function() {
			KitechAttach.uploadMap = {};
			KitechAttach.uploadObj = [];
			KitechAttach.saveCallback = undefined;
		}
	
		/**
		 * 업로드 컴포넌트 생성 여부 반환
		 */
		, isCreated: function(uploadId){
			return 0 < this.uploadObj.length && KitechAttach.uploadObj.some( function(upload){ 
				return upload.uploadId.ID === uploadId; 
			});
		}

		
		/**
		 * 업로드 여부 갱신
		 */
		, setUploaded: function(uploadId, isSync){
			this.uploadMap[uploadId].is_sync = isSync;
		}
		
		/**
		 * 업로드 여부 반환
		 */
		, isUploaded: function(uploadId){
			return this.uploadMap[uploadId].is_sync;
		}
		
		/**
		 * 모든 컴포넌트 업로드 여부 반환
		 */
		, isUploadedComplete: function(){
			return Object.keys(KitechAttach.uploadMap).every( function(uploadId){
				return KitechAttach.isUploaded(uploadId);
			});
		}
		
		
		/**
		 * 첨부파일 컴포넌트 생성
		 */
		, create: function(uploadId, obj){
			if (null ===  uploadId || undefined ===  uploadId || null ===  obj || undefined ===  obj){
				alert('파라미터 누락으로 인해 첨부파일 컴포넌트 생성에 실패하였습니다.');
				return;
			}
			obj.fileKey= obj.fileKey.trim();
			if (4 > obj.fileKey.length){
				alert('파라미터(첨부파일 번호) 오류로 인해 첨부파일 컴포넌트 생성에 실패하였습니다.');
				return;
			}

			if (obj.allowExtension && obj.limitExtension){
				alert('[allowExtension], [limitExtension] 파라미터는 상호 배타적 관계입니다.');
				return;
			}

			// 이중맵으로 컴포넌트ID 와 파라미터객체(첨부파일 번호, 모드 등)를 매핑한다.			
			obj.is_sync = true; 
			this.uploadMap[uploadId] = obj;
			
			var param = {
				  Id: uploadId
				, UploadHolder: uploadId
				, SkinName: 'blue'
				, StatusBar: '0'
				// 컴포넌트 표시여부 기본값은 true
				, InitVisible:  undefined === obj.isVisible || obj.isVisible ? true : false	
				, Width: eval(uploadId).getStyle('width')
				, Height: eval(uploadId).getStyle('height')
				, ButtonBarEdit: 'download,add,remove,remove_all'
				, ButtonBarView: 'open,download,download_all'
				, RootPath: '/cm/ext/raonkupload/'
			};

			// 파일 제한 설정
			if (obj.allowExtension) { 
				param.ExtensionAllowOrLimit = '1';
				param.ExtensionArr = obj.allowExtension;
			} else if(obj.limitExtension){
				param.ExtensionAllowOrLimit = '0';
				param.ExtensionArr = obj.limitExtension;
			}
			
			// 파일 제한 설정
			if (obj.maxOneFileSize) {
				param.MaxOneFileSize = maxOneFileSize;
			} else if(obj.maxTotalCount){
				param.MaxTotalFileCount = maxTotalCount;
			}
			
			if (obj.isShowHeaderBar) param.HeaderBar = '1';
			if (obj.customWebFileColor) param.CustomWebFileColor = '#ffc0cb';
			
			// 컴포넌트 생성
			this.uploadObj.push({ uploadId: new RAONKUpload(param)});

			// 로깅 출력
			this.log( 'create(): 첨부파일 컴포넌트 생성 완료!!');
		}

		/**
		 * 이미 생성된 컴포넌트에 첨부파일 데이터 세팅
		 */
		, setData: function(uploadId, fileKey){
			if (null ===  uploadId || undefined ===  uploadId || null ===  fileKey || undefined ===  fileKey){
				alert('파라미터 누락으로 인해 첨부파일 컴포넌트 생성에 실패하였습니다.');
				return;
			}
			fileKey = fileKey.trim();
			if (undefined === fileKey || 4 > fileKey.length){
				alert('파라미터(첨부파일 번호) 오류로 인해 첨부파일 번호 생성에 실패하였습니다.');
				return;
			}

			// 이중맵으로 컴포넌트ID 와 파라미터객체(첨부파일 번호, 모드 등)를 매핑한다.
			this.uploadMap[uploadId].fileKey = fileKey;

			if (4 == fileKey.length){
				KitechAttach.biz.generateKey( uploadId, fileKey);
			} else {
				KitechAttach.biz.setAttachFiles( uploadId, fileKey, this.uploadMap[uploadId].target);
			}
		}

		/**
		 * 첨부파일 전송 및 콜백 메소드 호출
		 */
		, transport: function(saveCallback){
			// 저장용 업무 메소드
			if (undefined === saveCallback || 'function' !== typeof saveCallback){
				alert("업무데이터 저장시 사용될 콜백 함수를 지정하여야 합니다!!");
				return;
			}
			
			// 전체 업로드 컴포넌트가 무결하지 않을 때 전체 전송 후 업무 저장을 위해 callback 의 레퍼런스를 저장
			this.saveCallback = saveCallback;
			
			if (KitechAttach.isUploadedComplete()){
				// 전체 업로드 컴포넌트가 무결하다면 즉시 업무 페이지 저장
				
				(this.saveCallback)(Object.keys(this.uploadMap).reduce( function(acc, uploadId){ 
				// (this.saveCallback)(this.uploadMap.key.reduce( function(acc, uploadId){ 
					// var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
					var dataArray = Rn.GetListInfo('array', uploadId);
					if (dataArray.webFile){
						dataArray.webFile.some( function(data, index){
							acc[uploadId.substring(uploadId.lastIndexOf("_upload")+1)] = KitechAttach.util.makeAttachFileNo(data.uploadPath);
							return 0 === index;
						});
					}	
					console.log(acc);
					return acc;
				}, {}));
			} else {
				KitechAttach.action.transferAll();
//				this.uploadMap.key.forEach( function(uploadId){
//					if (false === KitechAttach.isUploaded(uploadId)){
//						KitechAttach.action.transfer(uploadId);
//					}
//				});
			}
		}
		
		/**
		 * 전체 컴포넌트의 모든 파일을 삭제
		 */
		, deleteAll: function(param){
			var arrayDel = [];
			if ('function' === typeof param) {
				var removeCallback = param;
				Object.keys(this.uploadMap).forEach( function(uploadId){
					// this.uploadMap.key.forEach( function(uploadId){
					// var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
					var dataArray = Rn.GetListInfo('array', uploadId);
					if (dataArray.webFile){
						arrayDel = arrayDel.concat(dataArray.webFile);
					}					
				});
			} else {
				arrayDel = arrayDel.concat(param);
			}

			if (arrayDel && 0 < arrayDel.length && arrayDel[0] != null){
				var arrayObj = [];
				arrayDel.forEach( function(del) {
					var attachFileNo = KitechAttach.util.makeAttachFileNo(del.uploadPath);
					arrayObj.push({attach_file_no: attachFileNo, seq: del.uniqKey, fileKey: del.uploadPath, which: del.customValue});
				});
				KitechAttach.biz.deleteFiles(arrayObj, removeCallback);
			} else {
				// 삭제할 첨부파일이 없다면 콜백함수만 호출
				(removeCallback)();
			}
		}
		
		/**
		 * 특정 컴포넌트의 파일정보를 백터로 반환
		 */
		, getAttachFiles: function(uploadId){
			//var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
			var dataArray = Rn.GetListInfo('array', uploadId);
			var vec = [];
			if (dataArray && dataArray.mergeFile){
				dataArray.mergeFile.forEach( function(data){
					var doc = {};
					doc.attach_file_no = KitechAttach.util.makeAttachFileNo(data.uploadPath);
					doc.seq = KitechAttach.util.makeAttachFileNoSeq(data.uploadPath);
					doc.file_nm = data.originalName;
					doc.extens_nm = data.originalName.substring( data.originalName.lastIndexOf('.')+1);
					doc.size = data.size;
					vec.push(doc);
				});
			}
			return vec;
		}
		
		, log: function(str){
			if (window.console && window.console.log) {
				window.console.log( str);
			}
			if (WebSquare && WebSquare.logger) {
				WebSquare.logger.printLog( str);
			}						
		}  // page directives or sub libraries
		
		/**
		 * 유틸리티 패키지
		 */
		, util: {
			rpad: function(label, space, digit){
			    if (!label || !space || label.length >= digit) return label;
			    for (var i = 0; i < ((digit - label.length) / space.length); i++) label += space;
			    return label;
			}
			
			// array
			, newArrayToString: function(arrayNew) {
			
				var str = '-- 업로드 파일 정보 시작 '+ new Date().toISOString().slice(0,19).replace(/T/g, ' ') +' --\n';
				str += this.rpad('RealFileName', ' ', 20) + ' : {0}\n';
				str += this.rpad('ServerFileName', ' ', 20) + ' : {1}\n';
				str += this.rpad('IsLargeFile', ' ', 20) + ' : {2}\n';
				str += this.rpad('Size', ' ', 20) + ' : {3}\n';
				str += this.rpad('UploadPath', ' ', 20) + ' : {4}\n';
				str += this.rpad('LogicalPath', ' ', 20) + ' : {5}\n';
				str += this.rpad('fileExtention', ' ', 20) + ' : {6}\n';
				str += this.rpad('LocalPath', ' ', 20) + ' : {7}\n';
				str += this.rpad('CustomValue', ' ', 20) + ' : {8}\n';
				str += this.rpad('ResponseCustomValue', ' ', 20) + ' : {9}\n';
				str += this.rpad('Order', ' ', 20) + ' : {10}\n';
				str += '-- 업로드 파일 정보 끝 --\n';
				
				str = str.replace('{0}', arrayNew.map(function(element){ return element.originalName; }).join(','));
				str = str.replace('{1}', arrayNew.map(function(element){ return element.uploadName; }).join(','));
				str = str.replace('{2}', arrayNew.map(function(element){ return element.isLargeFile; }).join(','));
				str = str.replace('{3}', arrayNew.map(function(element){ return element.size; }).join(','));
				str = str.replace('{4}', arrayNew.map(function(element){ return element.uploadPath; }).join(','));
				str = str.replace('{5}', arrayNew.map(function(element){ return element.logicalPath; }).join(','));
				str = str.replace('{6}', arrayNew.map(function(element){ return element.fileExtension; }).join(','));
				str = str.replace('{7}', arrayNew.map(function(element){ return element.localPath; }).join(','));
				str = str.replace('{8}', arrayNew.map(function(element){ return element.customValue; }).join(','));
				str = str.replace('{9}', arrayNew.map(function(element){ return element.responseCustomValue; }).join(','));
				str = str.replace('{10}', arrayNew.map(function(element){ return element.order; }).join(','));

				KitechAttach.log(str);	
			}
			
			, delArrayToString: function(arrayDel) {
			
				var str = '-- 삭제된 파일 정보 --\n';
				str += this.rpad('Key', ' ', 8) + ' : {0}\n';
				str += this.rpad('FileName', ' ', 8) + ' : {1}\n';
				str += this.rpad('Size', ' ', 8) + ' : {2}\n\n';
				str += '-- 삭제된 파일 정보 끝 --\n';
				
				str = str.replace('{0}', arrayDel.map(function(element){ return element.uniqKey; }).join(','));
				str = str.replace('{1}', arrayDel.map(function(element){ return element.originalName; }).join(','));
				str = str.replace('{2}', arrayDel.map(function(element){ return element.size; }).join(','));
			
				KitechAttach.log(str);
			}
			
			, makeAttachFileNo: function(path){
				return path.substr(path.lastIndexOf('/')+1, 13);
			}
			
			, makeAttachFileNoSeq: function(path){
				return path.substr(path.length-2);
			}
		}

		/**
		 * Raon 콜백 이벤트를 랩핑한 패키지
		 */
		, event: {
			
			/**
			 * 컴포넌트 생성 완료 후 콜백
			 */
			creationComplate: function(uploadId){
				KitechAttach.log( '업로드 생성 완료 데이터 조회 후 세팅: ' + uploadId);
				KitechAttach.action.setUploadMode(KitechAttach.uploadMap[uploadId].mode, uploadId);

				var fileKey = KitechAttach.uploadMap[uploadId].fileKey;
				// 유효한 fileKey 라면 데이터 조회 후 컴포넌트 세팅
				if (undefined === fileKey || '' === fileKey || 4 > fileKey.length){
					alert("첨부파일 컴포넌트 생성시 파라미터 오류!");
					return;
				}

				if (4 == fileKey.length){
					KitechAttach.biz.generateKey( uploadId, fileKey);
				} else {
					KitechAttach.biz.setAttachFiles( uploadId, fileKey, KitechAttach.uploadMap[uploadId].target);
				}
			}
			
			/**
			 * 파일 전체 추가 완료 후 콜백
			 */
			, afterAddAllFile: function(uploadId) {
				KitechAttach.log('파일전체추가 완료: ' + uploadId);
			}

			/**
			 * 파일 추가 완료 후 콜백
			 */
			, afterAddFile: function(uploadId) {
				var dataMap = KitechAttach.uploadMap[uploadId];
				KitechAttach.setUploaded(uploadId, false);	// 업로드 무결성 제거
				KitechAttach.log('파일추가 완료(afterAddFile): ' + uploadId + ', attach_file_no 설정: ' + dataMap.fileKey);
				// RAONKUPLOAD.AddFormData('attachFileNo', dataMap.fileKey);
				Rn.AddFormData('attachFileNo', dataMap.fileKey);
				// RAONKUPLOAD.SetFileCustomValue("-1", dataMap.get('fileKey'), uploadId);
			}

			/**
			 * 파일 제거 전 콜백
			 */
			, beforeDeleteFile: function(uploadId) {
				KitechAttach.log('파일제거 시작(beforeDeleteFile):  ' + uploadId);
				KitechAttach.setUploaded(uploadId, false);	// 업로드 무결성 제거
			}
			
			/**
			 * 파일 전송 전 콜백 파일 변경이 있는 경우에만 수행 됨
			 */
			, beforeUpload: function(uploadId) {
				
				KitechAttach.log('업로드 시작(beforeUpload): ' + uploadId);
				debugger;
				var dataMap = KitechAttach.uploadMap[uploadId];
				// RAONKUPLOAD.AddFormData('target', KitechAttach.uploadMap[uploadId].target);
				Rn.AddFormData('target', KitechAttach.uploadMap[uploadId].target);
				
				
				// var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
				var dataArray = Rn.GetListInfo('array', uploadId);
				var arrayNew = dataArray.newFile;
				var arrayDel = dataArray.deleteFile;
				
				if (arrayNew){
					// 추가된 파일이 있으므로 핸들러에서 자동 처리(삭제 처리 후 신규 파일 저장)
					if (arrayDel) {
						// 핸들러에서 삭제시 동시성 문제가 발생하여 공통 비즈니스 단으로 이관
//						RAONKUPLOAD.AddFormData('removeFiles', arrayDel.map(function(element){
//							return KitechAttach.util.makeAttachFileNoSeq(element.uploadPath); 
//						}).join(','), uploadId);
					}
				} else {
					// 추가된 파일이 없으므로 수동 처리(Ajax 삭제 로직 추가)
					if (arrayDel) {
			 			KitechAttach.deleteAll(arrayDel);
			 		}
				}
			}

			/**
			 * 파일 전송 완료 콜백 - K Upload는 array, json, xml, text delimit 방식으로 결과값을
			 * 제공함, array로 처리
			 */
			, uploadComplete: function(uploadId) {
				// 파일에 대한 정보 중 업로드가 완료된 파일의 정보(업로드 된 파일경로,업로드 된 파일명)는
				// uploadComplete 이벤트 안에서만 추출 가능
				KitechAttach.log('업로드 완료 : ' + uploadId);
				KitechAttach.setUploaded(uploadId, true);
				
				//var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
				var dataArray = Rn.GetListInfo('array', uploadId);
				
				// 전송전 새롭게 추가된 파일, 전송후에는 전송된 파일
				var arrayNew = dataArray.newFile;
				if (arrayNew) KitechAttach.util.newArrayToString(arrayNew);
				
				// 삭제된 파일
				var arrayDel = dataArray.deleteFile;
				if (arrayDel) {
					KitechAttach.util.delArrayToString(arrayDel);
					// 삭제 처리.
					KitechAttach.deleteAll(arrayDel);
				}
				
				// 컴포넌트 상의 모든 파일
				var arrayWeb = dataArray.webFile;
				if (arrayWeb) KitechAttach.util.newArrayToString(arrayWeb);

				// 모든 컴포넌트의 싱크가 참이고,
				if (KitechAttach.isUploadedComplete()){
					// 마지막 컴포넌트인 경우에만 업무파트 콜백 함수 실행
					if (uploadId == Object.keys(KitechAttach.uploadMap)[Object.keys(KitechAttach.uploadMap).length -1]){
					// if (uploadId == KitechAttach.uploadMap.key[KitechAttach.uploadMap.keys().length - 1]){
						(KitechAttach.saveCallback)(Object.keys(KitechAttach.uploadMap).reduce( function(acc, uploadId){ 
						// (KitechAttach.saveCallback)(KitechAttach.uploadMap.key.reduce( function(acc, uploadId){
							// 신규 등록 시 newFile 로 존재, 부분 삭제 시 webFile 에 존재하므로 아래와 같이 처리

							// var dataArray = RAONKUPLOAD.GetListInfo('array', uploadId);
							var dataArray = Rn.GetListInfo('array', uploadId);
							if (dataArray.newFile){
								dataArray.newFile.some( function(data, index){
									acc[uploadId.substring(uploadId.lastIndexOf("_upload")+1)] = KitechAttach.util.makeAttachFileNo(data.uploadPath);
									return 0 === index;
								});
							}				 
							if (dataArray.webFile && '' != acc[uploadId]){
								dataArray.webFile.some( function(data, index){
									acc[uploadId.substring(uploadId.lastIndexOf("_upload")+1)] = KitechAttach.util.makeAttachFileNo(data.uploadPath);
									return 0 === index;
								});
							}
							console.log(acc);
							return acc;
						}, {}));
					}
				}
			}

			/**
			 * 취소 이벤트 콜백
			 */ 
			, uploadingCancel: function(uploadID, paramObj) {
				KitechAttach.log('전송 취소 이벤트 : ' + uploadId);
				if (paramObj.arrUploadedFileList != null && paramObj.arrUploadedFileList != '') {
					KitechAttach.log('업로드 된 파일 리스트');
					var uploadedFileLen = paramObj.arrUploadedFileList.length;
					for (var i = 0; i < uploadedFileLen; i++) {
						KitechAttach.log(paramObj.arrUploadedFileList[i].uploadName + ', ' + paramObj.arrUploadedFileList[i].uploadPath);
					}
				}
			}
			
			/**
			 * 에러 발생 콜백
			 */
			, onError: function(uploadId, paramObj) {
				KitechAttach.log('Error : ' + paramObj.strCode + ', ' + paramObj.strMessage + ', ' + uploadId);	
				if (paramObj.arrUploadedFileList != null && paramObj.arrUploadedFileList != '') {
					KitechAttach.log('업로드 된 파일 리스트');
					var uploadedFileLen = paramObj.arrUploadedFileList.length;
					for (var i = 0; i < uploadedFileLen; i++) {
						KitechAttach.log(paramObj.arrUploadedFileList[i].uploadName + ', ' + paramObj.arrUploadedFileList[i].uploadPath);
					}
				}
				alert('오류['+ paramObj.strCode +']: '+ paramObj.strMessage);
			}
			
			/**
			 * 커스텀 버튼 클릭 이벤트 핸들러
			 */
			, customAction: function(uploadId, command) {
			if (command == 'custom_button_action1') {    
					KitechAttach.log('파일을 삭제하였습니다.' + uploadId);
				} else if (command == 'custom_button_action2') {
					KitechAttach.log('커스텀버튼을 클릭하였습니다.' + uploadId);
				}
			}
		} // james.event
		
		/**
		 * Raon 액션 메소드를 랩핑한 패키지
		 */					
		, action: {
			/** 파일추가 */
			  openDialog: function(uploadId){
				Rn.OpenFileDialog(uploadId);
			}
			
			/** 전송시작 */
			, transfer: function(uploadId){
				Rn.Transfer(uploadId);
			}
			
			/** 전체전송시작 */
			, transferAll: function(){
				Rn.MultiTransfer();
			}					
			
			/** 모든 파일삭제 */
			, deleteAllFile: function(uploadId){
				Rn.DeleteAllFile(uploadId);
			}
			
			/** 선택한 파일삭제 */
			, deleteSelectedFile: function(uploadId){
				Rn.DeleteSelectedFile(uploadId);
			}
			
			/** 선택한 파일 다운로드 */
			, downloadFile: function(uploadId){
				Rn.DownloadFile(uploadId);
			}

			/** 모든파일 다운로드 */
			, downloadAllFile: function(uploadId){
				Rn.DownloadAllFile(uploadId);
			}

			/** 전체 파일개수 */
			, getTotalFileCount: function(uploadId){
				return Rn.GetTotalFileCount(uploadId);
			}

			/** 전체 파일크기(Bytes) */
			, getTotalFileSize: function(uploadId){
				return Rn.GetTotalFileSize(uploadId);
			}

			/**
			 * 업로드 모드 변경
			 * 
			 * @param mode: edit / view / open / download
			 */
			, setUploadMode: function(mode, uploadId){
				Rn.SetUploadMode(mode, uploadId);
			}

			/** 업로드 보이기 */
			, show: function(uploadId){		
				if (KitechAttach.isCreated(uploadId)) {
					Rn.Show(uploadId);
				}
			}

			/** 업로드 숨기기 */
			, hide: function(uploadId){
				if (KitechAttach.isCreated(uploadId)){
					Rn.Hidden(uploadId);
				}
			}
			
			/** 업로드 초기화 */
			, reset: function(uploadId){
				Rn.ResetUpload(uploadId);
			}
			
			
			/** 업로드 제거 */
			, destroy: function(uploadId){
				Rn.Destroy(uploadId);
			}
			
		} // james.action
		
		/**
		 * Kitech 비지니스 패키지
		 */					
		, biz: {

			/**
			 * 지재권 포털 서비스에서 업로드시 용량이 공통테이블에 바이트 단위로 들어가므로 아래와 같이 분기한다.
			 */	
			getFormatSizeByFileSize: function(fileSize) {
				if (-1 < fileSize.indexOf('M')){
					return WebSquare.util.parseFloat( fileSize.replace(/[^0-9|.]/g, ''), 0) * 1024 * 1024;
				} else if (-1 < fileSize.indexOf('K')){
					return WebSquare.util.parseFloat( fileSize.replace(/[^0-9|.]/g, ''), 0) * 1024;
				} else {
					return WebSquare.util.parseFloat( fileSize, 0);
				}
			}

			/**
			 * docid로 첨부파일 키 생성
			 * 키생성 동시성 문제로 인해 sync 처리
			 */
			, generateKey: function(uploadId, docId){
				
				var action = 'SvcGetNumbering';
				var param = '{"numbering": "ATTACH", "prefix": "'+ docId +'"}';				
				WebSquare.net.ajax({
					  action : `/${action}.pwkjson`
					, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
					, mode : 'asynchronous'
					, mediatype : 'application/json'
					, method : 'post'
					, success : function(s){
						console.log('첨부파일 조회 완료!!', s.responseJSON);

						var fileKey = s.responseJSON.elData.gen_no_seq;
						if ("" == fileKey || 13 > fileKey.length){
							alert("신규 첨부파일 번호 조회에 실패하였습니다.\n 페이지 재진입 바랍니다.");
							return;	
						}
						// 신규 채번된 첨부파일번호 세팅
						KitechAttach.uploadMap[uploadId].fileKey = fileKey;
						KitechAttach.action.reset(uploadId);
					}
					, error : function(e){
						alert("첨부파일번호 생성시 시스템 오류 발생! 페이지 재진입 필요!\n" + e);
					}
				});
			}

			/**
			 * 첨부파일번호에 해당하는 목록 조회
			 */
			, setAttachFiles: function(uploadId, fileKey, customValue){
				var action = 'SvcAttachList';
				var param = '{"attach_file_no": "'+ fileKey +'"}';
				WebSquare.net.ajax({
					  action : `/${action}.pwkjson`
					, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
					, mode : 'asynchronous'
					, mediatype : 'application/json'
					, method : 'post'
					, success : function(response){
						console.log('첨부파일 조회 완료!!', response.responseJSON.elData);
						response.responseJSON.elData.attachVoList.forEach( function(attach, index){
							var fileUniqueKey = attach.seq;
							var fileName = attach.orgFile;
							var filePath = '/' + attach.attachFullPath;
							var fileSize = KitechAttach.biz.getFormatSizeByFileSize( attach.file_size);
							// RAONKUPLOAD.AddUploadedFile(fileUniqueKey, fileName, filePath, fileSize, customValue, uploadId);
							Rn.AddUploadedFile(fileUniqueKey, fileName, filePath, fileSize, customValue, uploadId);							
						});
					}
					, error : function(e){
						console.log("첨부파일 조회시 시스템 오류 발생! 페이지 재진입 필요!", e);
					}
				});
			}

			/**
			 * 파일 일괄 삭제 로직 필요. 업무테이블 삭제
			 */						
			, deleteFiles: function(params, removeCallback){
				var action = 'SvcAttachDel';
				var param = '{"attachVoList": '+ JSON.stringify(params) +'}';

				WebSquare.net.ajax({
					  action : `/${action}.pwkjson`
					, requestData : `{"elHeader":{"locale":"ko"},"elData":${param}}`
					, mode : 'asynchronous'
					, mediatype : 'application/json'
					, method : 'post'
					, success : function(response){
						console.log('첨부파일 삭제 완료!!', response.responseJSON);
						if (removeCallback){
							console.log('첨부파일 삭제 후 콜백 수행!!');
							(removeCallback)();
						}
					}
					, error : function(e){
						console.log("첨부파일 삭제시 시스템 오류 발생! 페이지 재진입 필요!", e);
					}
				});
			}
		} // james.biz
	};
	return james;
})(RAONKUPLOAD);

KitechAttach.init();
