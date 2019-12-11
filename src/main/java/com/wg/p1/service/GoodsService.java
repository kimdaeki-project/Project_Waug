package com.wg.p1.service;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wg.p1.dao.GoodsDAO;
import com.wg.p1.model.GoodsVO;
import com.wg.p1.model.MemberVO;

@Service
public class GoodsService {

	@Inject
	private GoodsDAO goodsDAO;

	public ArrayList<GoodsVO> goodsRecomand(MemberVO memberVO) throws Exception{
		System.out.println(memberVO.getM_pk());
		return (ArrayList<GoodsVO>)goodsDAO.goodsRecomand(memberVO);
	}
}