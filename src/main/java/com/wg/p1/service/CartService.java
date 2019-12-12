package com.wg.p1.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.wg.p1.dao.CartDAO;
import com.wg.p1.model.CartVO;
import com.wg.p1.model.GoodsVO;
import com.wg.p1.model.MemberVO;

@Service
public class CartService {

	@Inject
	private CartDAO cartDAO;

	

	public int cartAdd(CartVO cartVO) throws Exception {
		return cartDAO.cartAdd(cartVO);
	}

	public int cartDel(int cart_num) throws Exception {
		return cartDAO.cartDel(cart_num);
	}

	public List<GoodsVO> myCart(MemberVO memberVO) throws Exception {
		return cartDAO.myCart(memberVO);
	}

	public int cartSum(MemberVO memberVO) throws Exception{ 
		return cartDAO.cartSum(memberVO);
	}

}