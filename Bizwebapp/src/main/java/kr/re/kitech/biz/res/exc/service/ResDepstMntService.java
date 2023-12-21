package kr.re.kitech.biz.res.exc.service;

import java.util.List;

import kr.re.kitech.biz.fin.com.vo.FcpDepstReqVo;
import kr.re.kitech.biz.res.exc.vo.ResBgDepstMntVo;
import kr.re.kitech.biz.res.exc.vo.ResBgRectlVo;
import kr.re.kitech.biz.res.exc.vo.ResDemndReqVo;
import kr.re.kitech.biz.res.exc.vo.ResDepstDetlVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSlipCancelVo;
import kr.re.kitech.biz.res.exc.vo.ResExcSrcVo;

/**
 * 연구비입금관리Interface
 * @author LeeYH
 * @since 2023.04.25.
 */
public interface ResDepstMntService {
	/*
    * 연구비입금관리 목록 조회
    */
	public List<ResBgDepstMntVo> selectResBgDepstMntList(ResExcSrcVo vo);
	/*
    * 연구비 입금관리 상세조회(과제정보 및 입금예정관리 조회)
    */
	public ResDepstDetlVo selectResDepstDetlInfo(ResExcSrcVo vo);
	/*
    * 연구비입금내역정보 조회
    */
	public List<ResBgRectlVo> selectResBgRectlList(ResExcSrcVo vo);
	/*
    * 연구비입금관리 상세 저장
    */
	public void saveResBgRecvDetail(ResDepstDetlVo vo);
	/*
    * 연구비청구의뢰 조회
    */
	public ResDepstDetlVo selectResDemndReq(ResExcSrcVo vo);	
	/*
    * 연구비청구의뢰 저장
    */
	public String saveResDemndReq(ResDemndReqVo vo) throws Exception;
	/*
    * 연구비청구의뢰 삭제
    */
	public void deleteResDemndReq(ResDemndReqVo vo);
	/*
    * 미수반제신청 조회
    */
	public ResDepstDetlVo selectResRepayReq(ResExcSrcVo vo);
	/*
    * 미수반제신청 저장
    */
	public String saveRepayReqMnt(ResDepstDetlVo vo);
	/*
    * 연구비 입금 결재신청
    */
	public String approvalResDepstReq(ResDepstDetlVo vo) throws Exception;
	/*
    * 연구비 반제신청 삭제
    */
	public void deleteRepayReqMnt(ResDepstDetlVo vo);
	/*
    * 연구비 입금의뢰 저장
    */
	public String saveResDepstReq(List<FcpDepstReqVo> vo);
	
	/*
    * 연구비 입금의뢰 삭제
    */
	public void deleteResDepstReq(List<FcpDepstReqVo> depstList);
	
	/*
    * 연구비 입금 또는 청구 결의취소
    */
	public void deleteResExcSlipMnt(ResExcSlipCancelVo vo);
}
