package com.wg.p1.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wg.p1.model.GoodsVO;
import com.wg.p1.model.MemberVO;
import com.wg.p1.model.WishListVO;

@Repository
public class WishListDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String NAMESPACE="wishlistMapper.";

	public int wishAdd(WishListVO wishListVO) throws Exception{
		return sqlSession.insert(NAMESPACE+"wishAdd", wishListVO);
	}
	
	public int wishDel(MemberVO memberVO) throws Exception{
		return sqlSession.delete(NAMESPACE+"wishDel", memberVO);
	}
	
	public List<GoodsVO> myWish(MemberVO memberVO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"myWish", memberVO);
	}
}
