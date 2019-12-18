package com.wg.p1.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wg.p1.model.BookerInfoVO;
import com.wg.p1.model.GoodsOptionVO;

@Repository
public class OrderDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE="orderMapper.";

	//selectOptionTime
	public List<GoodsOptionVO> selectOptionTime()throws Exception{
		return sqlSession.selectList(NAMESPACE+"selectOptionTime");
	}
	public int insertBookerInfo(BookerInfoVO bookerInfoVO) throws Exception{
		return sqlSession.insert(NAMESPACE+"insertBookerInfo", bookerInfoVO);
	}
	public int insertBookerInfo2(BookerInfoVO bookerInfoVO)throws Exception{
		return sqlSession.insert(NAMESPACE+"insertBookerInfo2", bookerInfoVO);
	}
}