﻿POLARIS.dialog.add("cellSplit",function(b){return{title:b.lang.table.cellSplit,minWidth:180,minHeight:80,resizable:POLARIS.DIALOG_RESIZE_NONE,onShow:function(){element=this.getParentEditor().getSelection().getStartElement();this._.selectedElement=element.getAscendant("table")},onOk:function(){b.getSelection();var a=this._.selectedElement;data={};this.commitContent(data,a);data.info&&b.execCommand("tableSplitCell",{Merge:data.info.mergeAndSplitCells,Rows:data.info.rowCount,Cols:data.info.columnCount,
SameHeight:data.info.splitCellWithSameHeight})},contents:[{id:"info",label:"",title:"타이틀",startupFocus:"rowCount",expand:!0,elements:[{type:"hbox",styles:["vertical-align:top"],children:[{id:"rowCount",type:"select",label:b.lang.table.rowCount,"default":"2",items:[["1",1],["2",2],["3",3],["4",4],["5",5],["6",6],["7",7],["8",8],["9",9],["10",10]],commit:function(a){var b=this.id;a.info||(a.info={});a.info[b]=this.getValue()}},{id:"columnCount",type:"select",label:b.lang.table.columnCount,"default":"1",
items:[["1",1],["2",2],["3",3],["4",4],["5",5],["6",6],["7",7],["8",8],["9",9],["10",10]],commit:function(a){var b=this.id;a.info||(a.info={});a.info[b]=this.getValue()}}]},{id:"splitCellWithSameHeight",type:"checkbox",label:b.lang.table.splitCellWithSameHeight,commit:function(a){var b=this.id;a.info||(a.info={});a.info[b]=this.getValue()}}]}]}});