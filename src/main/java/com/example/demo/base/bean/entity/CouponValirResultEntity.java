package com.example.demo.base.bean.entity;

public class CouponValirResultEntity extends BaseEntity {

	/** serialVersion */
	private static final long serialVersionUID = 1L;

	/** 优惠券ID */
	private String couponId;

	/** 优惠券是否有效 */
	private int couponStatus;

	/** 优惠券类型 */
	private int couponType;

	/** 优惠券内容 */
	private String couponContent;

	/** 优惠券使用规则 */
	private String couponRule;

	/** 有效期开始时间 */
	private String couponBegin;

	/** 有效期结束时间 */
	private String couponEnd;

	/** 违反规则内容 */
	private String breakRuleContent;

	/** 优惠券金额 */
	private String couponPrice;

	/**
	 * 违反规则内容取得
	 * 
	 * @return 违反规则内容
	 */
	public String getBreakRuleContent() {
		return breakRuleContent;
	}

	/**
	 * 违反规则内容设定
	 * 
	 * @param couponType
	 *            违反规则内容
	 */
	public void setBreakRuleContent(String breakRuleContent) {
		this.breakRuleContent = breakRuleContent;
	}

	/**
	 * 优惠券类型取得
	 * 
	 * @return 优惠券类型
	 */
	public int getCouponType() {
		return couponType;
	}

	/**
	 * 优惠券类型设定
	 * 
	 * @param couponType
	 *            优惠券类型
	 */
	public void setCouponType(int couponType) {
		this.couponType = couponType;
	}

	/**
	 * 优惠券内容取得
	 * 
	 * @return 优惠券内容
	 */
	public String getCouponContent() {
		return couponContent;
	}

	/**
	 * 优惠券内容设定
	 * 
	 * @param couponContent
	 *            优惠券内容
	 */
	public void setCouponContent(String couponContent) {
		this.couponContent = couponContent;
	}

	/**
	 * 有效期开始时间取得
	 * 
	 * @return 有效期开始时间
	 */
	public String getCouponBegin() {
		return couponBegin;
	}

	/**
	 * 有效期开始时间设定
	 * 
	 * @param couponBegin
	 *            有效期开始时间
	 */
	public void setCouponBegin(String couponBegin) {
		this.couponBegin = couponBegin;
	}

	/**
	 * 有效期结束时间取得
	 * 
	 * @return 有效期结束时间
	 */
	public String getCouponEnd() {
		return couponEnd;
	}

	/**
	 * 有效期结束时间设定
	 * 
	 * @param couponEnd
	 *            有效期结束时间
	 */
	public void setCouponEnd(String couponEnd) {
		this.couponEnd = couponEnd;
	}

	/**
	 * 优惠券是否有效取得
	 * 
	 * @return 优惠券是否有效
	 */
	public int getCouponStatus() {
		return couponStatus;
	}

	/**
	 * 优惠券是否有效设定
	 * 
	 * @param couponStatus
	 *            优惠券是否有效
	 */
	public void setCouponStatus(int couponStatus) {
		this.couponStatus = couponStatus;
	}

	/**
	 * 优惠券使用规则取得
	 * 
	 * @return 优惠券使用规则
	 */
	public String getCouponRule() {
		return couponRule;
	}

	/**
	 * 优惠券使用规则设定
	 * 
	 * @param couponRule
	 *            优惠券使用规则
	 */
	public void setCouponRule(String couponRule) {
		this.couponRule = couponRule;
	}

	/**
	 * @return 优惠券金额获取
	 */
	public String getCouponPrice() {
		return couponPrice;
	}

	/**
	 * @param couponPrice
	 *            优惠券金额设定
	 */
	public void setCouponPrice(String couponPrice) {
		this.couponPrice = couponPrice;
	}

	/**
	 * 
	 * @return 优惠券ID取得
	 */
	public String getCouponId() {
		return couponId;
	}

	/**
	 * 优惠券ID设定
	 * 
	 * @param couponId
	 *            优惠券ID
	 */
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

}
