package com.wg.p1.model;

import java.util.List;

public class MemberVO {
	
	private String m_pk;
	private String social;
	private String email;
	private String pw;
	private String name;
	private String ename_first;
	private String ename_last;
	private String phone;
	private String img;
	private int goods_num;
	private List<WishListVO> wishlist;

	private String uuid;
	private List<MyCouponVO> myCoupon;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	
	public List<MyCouponVO> getMyCoupon() {
		return myCoupon;
	}
	public void setMyCoupon(List<MyCouponVO> myCoupon) {
		this.myCoupon = myCoupon;

	}
	public List<WishListVO> getWishlist() {
		return wishlist;
	}
	public void setWishlist(List<WishListVO> wishlist) {
		this.wishlist = wishlist;
	}
	public int getGoods_num() {
		return goods_num;
	}
	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}
	public String getM_pk() {
		return m_pk;
	}
	public void setM_pk(String m_pk) {
		this.m_pk = m_pk;
	}
	public String getSocial() {
		return social;
	}
	public void setSocial(String social) {
		this.social = social;
	}
	public String getEname_first() {
		return ename_first;
	}
	public void setEname_first(String ename_first) {
		this.ename_first = ename_first;
	}
	public String getEname_last() {
		return ename_last;
	}
	public void setEname_last(String ename_last) {
		this.ename_last = ename_last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
}
