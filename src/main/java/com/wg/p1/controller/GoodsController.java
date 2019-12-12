package com.wg.p1.controller;

import java.util.List;
import java.util.ArrayList;

import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.wg.p1.model.ReviewVO;
import com.wg.p1.model.ThemeVO;
import com.wg.p1.service.ReviewService;
import com.wg.p1.model.CategoryVO;
import com.wg.p1.model.GoodsVO;
import com.wg.p1.model.MemberVO;
import com.wg.p1.model.NationVO;
import com.wg.p1.service.GoodsService;


@Controller
@RequestMapping("/goods/**")
public class GoodsController {

	@Inject
	ReviewService reviewService;
	
	@Inject
	private GoodsService goodsService;
	
	@RequestMapping("good_page")
	public ModelAndView goods(ModelAndView mv)throws Exception{
		
		ReviewVO reviewVO = new ReviewVO();
		ReviewVO reviewVO2 = new ReviewVO();
		reviewVO.setGoods_num(1);
		reviewVO =reviewService.review_avg_total(reviewVO);
		reviewVO2 = reviewService.reviewLatest(reviewVO2);
		mv.addObject("review", reviewVO);
		mv.addObject("review2", reviewVO2);
		mv.setViewName("goods/good_page");
		
		//goods 정보담기
		
		//mv.addObject("info", attributeValue)
		return mv;
		
	}


	@RequestMapping("goods_area")
	public ModelAndView goods_area(ModelAndView mv, int city_num) throws Exception{
		NationVO nationVO = new NationVO();
		GoodsVO goodsVO = new GoodsVO();
		nationVO.setCity_num(city_num);
		goodsVO.setGoods_num(city_num);
		nationVO = goodsService.City(nationVO);
		
		mv.addObject("nation", nationVO);
		
		return mv;
	}


	@RequestMapping("goods")
	public void goods()throws Exception{
		System.out.println("goods page~~~");

	}
	

	@RequestMapping("goods_themes")
	public void themes() throws Exception{
		
		
		
	}
	
	@GetMapping("goods_write")
	public void goods_write(ModelAndView mv) throws Exception{
		
	}
}
