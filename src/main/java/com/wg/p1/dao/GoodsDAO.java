package com.wg.p1.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wg.p1.model.GoodsVO;

import com.wg.p1.model.NationVO;
import com.wg.p1.model.MemberVO;


@Repository
public class GoodsDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE="goodsMapper.";
	
	public List<GoodsVO> goodsRecomand(MemberVO memberVO) throws Exception{
		System.out.println(memberVO.getM_pk());
		return sqlSession.selectList(NAMESPACE+"goodsRecomand", memberVO);
	}
	

	public List<GoodsVO> goodsList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"goodsList");
	}
	
	public List<NationVO> CityList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"areaRecomand");
	}
	
	public NationVO City(NationVO nationVO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"areaSelect", nationVO);
	}
	public GoodsVO goosSelectOne(int goods_num) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"goodsSelectOne", goods_num);

	}
}
