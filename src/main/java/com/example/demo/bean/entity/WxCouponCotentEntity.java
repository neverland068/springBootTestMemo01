package com.example.demo.bean.entity;

import com.example.demo.base.bean.entity.BaseEntity;

/**********************************************************
 * WxCouponCotentEntity.java
 * 
 * @version 1.0.0
 *
 **********************************************************/

public class WxCouponCotentEntity extends BaseEntity {

	/** serialVersion */
	private static final long serialVersionUID = 1L;

	/** 优惠券GUID */
	private String COUPON_CONTENT_GUID;

	/** 卡券ID(子活动代码) */
	private String CARD_ID;

	/** 优惠券号 */
	private String COUPON_ID;

	/** 活动ID(活动代码) */
	private String EVENT_ID;

	/** OPEN_ID */
	private String OPEN_ID;

	/** 公众号HASH */
	private String GZH_HASH;

	/** 销售店号 */
	private String DEALER_CODE;

	/** 卡券状态(优惠券状态) */
	private String COUPON_STATUS;

	/** 优惠券类型 */
	private String TYPE_ID;

	/** 优惠券内容 */
	private String COUPON_CONTENT;

	/** 优惠券使用规则 */
	private String COUPON_RULE;

	/** 有效期开始时间 */
	private String COUPON_BEGIN;

	/** 有效期结束时间,YYYY-MM-DD */
	private String COUPON_END;

	/** 维修工单号 */
	private String SRV_ORDER_NO;

	/** 车架号 */
	private String VIN_NO;

	/** SFX */
	private String SFX_CODE;

	/** 车型是否适合 */
	private String CHECK_MODEL;

	/** 使用状态 */
	private String USE_STATUS;

	/** 更新标示 */
	private String UPDATE_COUNT;

	/** 删除标识 */
	private String DEL_FLAG;

	/** USER_NAME */
	private String USER_NAME;

	/** 用户电话 */
	private String USER_NUMBER;

	/** 平台更新时间 */
	private String UPDATE_ON;

	/** 优惠劵分类 */
	private String COUPON_KBN;

	/** 优惠券组ID */
	private String COUPON_GROUP_ID;

	/** 第三方商家名 */
	private String THIRDPARTY_NAME;

	/** 发布日 */
	private String PUBLISH_DATE;

	/** 第三方优惠券URL */
	private String COUPON_URL;

	/** 领取日时 */
	private String GET_DATE;

	/** 绑定日时 */
	private String BIND_DATE;

	/** 核销日时 */
	private String WRITEOFFS_DATE;

	/** 优惠券详情内容 */
	private String COUPON_DETAIL;
	
	/** 经销商名称 */
	private String DEALER_NAME;
	
	// add for 第三方优惠券 by liangxiao at 20170527 start
    /** 第三方券号密码 */
    private String COUPON_PWD;
    
    /** 第三方优惠卷客服热线 */
    private String COUPON_PHONE;
    
    /** 优惠券简介（查看更多URL） */
    private String COUPON_INTRODUCTION;
    
    /** 是否可以领取多张（1：是；0：否） */
    private int COUPON_GRANT_TYPE;
    
    /** 来源系统（1：iClub; 2：App; 3：电商） */
    private String FROM_APPLICATION;
    
    private String CREATED_ON;
    private String MODIFY_ON;
    
//    /** 优惠券副标题 */
//    private String SUBTITLE;
    // add for 第三方优惠券 by liangxiao at 20170527 end

	/**
	 * @return the cOUPON_CONTENT_GUID
	 */
	public String getCOUPON_CONTENT_GUID() {
		return COUPON_CONTENT_GUID;
	}

	/**
	 * @param cOUPON_CONTENT_GUID
	 *            the cOUPON_CONTENT_GUID to set
	 */
	public void setCOUPON_CONTENT_GUID(String cOUPON_CONTENT_GUID) {
		COUPON_CONTENT_GUID = cOUPON_CONTENT_GUID;
	}

	/**
	 * @return the cARD_ID
	 */
	public String getCARD_ID() {
		return CARD_ID;
	}

	/**
	 * @param cARD_ID
	 *            the cARD_ID to set
	 */
	public void setCARD_ID(String cARD_ID) {
		CARD_ID = cARD_ID;
	}

	/**
	 * @return the cOUPON_ID
	 */
	public String getCOUPON_ID() {
		return COUPON_ID;
	}

	/**
	 * @param cOUPON_ID
	 *            the cOUPON_ID to set
	 */
	public void setCOUPON_ID(String cOUPON_ID) {
		COUPON_ID = cOUPON_ID;
	}

	/**
	 * @return the eVENT_ID
	 */
	public String getEVENT_ID() {
		return EVENT_ID;
	}

	/**
	 * @param eVENT_ID
	 *            the eVENT_ID to set
	 */
	public void setEVENT_ID(String eVENT_ID) {
		EVENT_ID = eVENT_ID;
	}

	/**
	 * @return the oPEN_ID
	 */
	public String getOPEN_ID() {
		return OPEN_ID;
	}

	/**
	 * @param oPEN_ID
	 *            the oPEN_ID to set
	 */
	public void setOPEN_ID(String oPEN_ID) {
		OPEN_ID = oPEN_ID;
	}

	/**
	 * @return the gZH_HASH
	 */
	public String getGZH_HASH() {
		return GZH_HASH;
	}

	/**
	 * @param gZH_HASH
	 *            the gZH_HASH to set
	 */
	public void setGZH_HASH(String gZH_HASH) {
		GZH_HASH = gZH_HASH;
	}

	/**
	 * @return the dEALER_CODE
	 */
	public String getDEALER_CODE() {
		return DEALER_CODE;
	}

	/**
	 * @param dEALER_CODE
	 *            the dEALER_CODE to set
	 */
	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
	}

	/**
	 * @return the cOUPON_STATUS
	 */
	public String getCOUPON_STATUS() {
		return COUPON_STATUS;
	}

	/**
	 * @param cOUPON_STATUS
	 *            the cOUPON_STATUS to set
	 */
	public void setCOUPON_STATUS(String cOUPON_STATUS) {
		COUPON_STATUS = cOUPON_STATUS;
	}

	/**
	 * @return the tYPE_ID
	 */
	public String getTYPE_ID() {
		return TYPE_ID;
	}

	/**
	 * @param tYPE_ID
	 *            the tYPE_ID to set
	 */
	public void setTYPE_ID(String tYPE_ID) {
		TYPE_ID = tYPE_ID;
	}

	/**
	 * @return the cOUPON_CONTENT
	 */
	public String getCOUPON_CONTENT() {
		return COUPON_CONTENT;
	}

	/**
	 * @param cOUPON_CONTENT
	 *            the cOUPON_CONTENT to set
	 */
	public void setCOUPON_CONTENT(String cOUPON_CONTENT) {
		COUPON_CONTENT = cOUPON_CONTENT;
	}

	/**
	 * @return the cOUPON_RULE
	 */
	public String getCOUPON_RULE() {
		return COUPON_RULE;
	}

	/**
	 * @param cOUPON_RULE
	 *            the cOUPON_RULE to set
	 */
	public void setCOUPON_RULE(String cOUPON_RULE) {
		COUPON_RULE = cOUPON_RULE;
	}

	/**
	 * @return the cOUPON_BEGIN
	 */
	public String getCOUPON_BEGIN() {
		return COUPON_BEGIN;
	}

	/**
	 * @param cOUPON_BEGIN
	 *            the cOUPON_BEGIN to set
	 */
	public void setCOUPON_BEGIN(String cOUPON_BEGIN) {
		COUPON_BEGIN = cOUPON_BEGIN;
	}

	/**
	 * @return the cOUPON_END
	 */
	public String getCOUPON_END() {
		return COUPON_END;
	}

	/**
	 * @param cOUPON_END
	 *            the cOUPON_END to set
	 */
	public void setCOUPON_END(String cOUPON_END) {
		COUPON_END = cOUPON_END;
	}

	/**
	 * @return the sRV_ORDER_NO
	 */
	public String getSRV_ORDER_NO() {
		return SRV_ORDER_NO;
	}

	/**
	 * @param sRV_ORDER_NO
	 *            the sRV_ORDER_NO to set
	 */
	public void setSRV_ORDER_NO(String sRV_ORDER_NO) {
		SRV_ORDER_NO = sRV_ORDER_NO;
	}

	/**
	 * @return the vIN_NO
	 */
	public String getVIN_NO() {
		return VIN_NO;
	}

	/**
	 * @param vIN_NO
	 *            the vIN_NO to set
	 */
	public void setVIN_NO(String vIN_NO) {
		VIN_NO = vIN_NO;
	}

	/**
	 * @return the sFX_CODE
	 */
	public String getSFX_CODE() {
		return SFX_CODE;
	}

	/**
	 * @param sFX_CODE
	 *            the sFX_CODE to set
	 */
	public void setSFX_CODE(String sFX_CODE) {
		SFX_CODE = sFX_CODE;
	}

	/**
	 * @return the cHECK_MODEL
	 */
	public String getCHECK_MODEL() {
		return CHECK_MODEL;
	}

	/**
	 * @param cHECK_MODEL
	 *            the cHECK_MODEL to set
	 */
	public void setCHECK_MODEL(String cHECK_MODEL) {
		CHECK_MODEL = cHECK_MODEL;
	}

	/**
	 * @return the uSE_STATUS
	 */
	public String getUSE_STATUS() {
		return USE_STATUS;
	}

	/**
	 * @param uSE_STATUS
	 *            the uSE_STATUS to set
	 */
	public void setUSE_STATUS(String uSE_STATUS) {
		USE_STATUS = uSE_STATUS;
	}

	/**
	 * @return the uPDATE_COUNT
	 */
	public String getUPDATE_COUNT() {
		return UPDATE_COUNT;
	}

	/**
	 * @param uPDATE_COUNT
	 *            the uPDATE_COUNT to set
	 */
	public void setUPDATE_COUNT(String uPDATE_COUNT) {
		UPDATE_COUNT = uPDATE_COUNT;
	}

	/**
	 * @return the dEL_FLAG
	 */
	public String getDEL_FLAG() {
		return DEL_FLAG;
	}

	/**
	 * @param dEL_FLAG
	 *            the dEL_FLAG to set
	 */
	public void setDEL_FLAG(String dEL_FLAG) {
		DEL_FLAG = dEL_FLAG;
	}

	/**
	 * @return the uSER_NAME
	 */
	public String getUSER_NAME() {
		return USER_NAME;
	}

	/**
	 * @param uSER_NAME
	 *            the uSER_NAME to set
	 */
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}

	/**
	 * @return the uSER_NUMBER
	 */
	public String getUSER_NUMBER() {
		return USER_NUMBER;
	}

	/**
	 * @param uSER_NUMBER
	 *            the uSER_NUMBER to set
	 */
	public void setUSER_NUMBER(String uSER_NUMBER) {
		USER_NUMBER = uSER_NUMBER;
	}

	/**
	 * @return the uPDATE_ON
	 */
	public String getUPDATE_ON() {
		return UPDATE_ON;
	}

	/**
	 * @param uPDATE_ON
	 *            the uPDATE_ON to set
	 */
	public void setUPDATE_ON(String uPDATE_ON) {
		UPDATE_ON = uPDATE_ON;
	}

	/**
	 * @return the cOUPON_KBN
	 */
	public String getCOUPON_KBN() {
		return COUPON_KBN;
	}

	/**
	 * @param cOUPON_KBN
	 *            the cOUPON_KBN to set
	 */
	public void setCOUPON_KBN(String cOUPON_KBN) {
		COUPON_KBN = cOUPON_KBN;
	}

	/**
	 * @return the cOUPON_GROUP_ID
	 */
	public String getCOUPON_GROUP_ID() {
		return COUPON_GROUP_ID;
	}

	/**
	 * @param cOUPON_GROUP_ID
	 *            the cOUPON_GROUP_ID to set
	 */
	public void setCOUPON_GROUP_ID(String cOUPON_GROUP_ID) {
		COUPON_GROUP_ID = cOUPON_GROUP_ID;
	}

	/**
	 * @return the tHIRDPARTY_NAME
	 */
	public String getTHIRDPARTY_NAME() {
		return THIRDPARTY_NAME;
	}

	/**
	 * @param tHIRDPARTY_NAME
	 *            the tHIRDPARTY_NAME to set
	 */
	public void setTHIRDPARTY_NAME(String tHIRDPARTY_NAME) {
		THIRDPARTY_NAME = tHIRDPARTY_NAME;
	}

	/**
	 * @return the pUBLISH_DATE
	 */
	public String getPUBLISH_DATE() {
		return PUBLISH_DATE;
	}

	/**
	 * @param pUBLISH_DATE
	 *            the pUBLISH_DATE to set
	 */
	public void setPUBLISH_DATE(String pUBLISH_DATE) {
		PUBLISH_DATE = pUBLISH_DATE;
	}

	/**
	 * @return the cOUPON_URL
	 */
	public String getCOUPON_URL() {
		return COUPON_URL;
	}

	/**
	 * @param cOUPON_URL
	 *            the cOUPON_URL to set
	 */
	public void setCOUPON_URL(String cOUPON_URL) {
		COUPON_URL = cOUPON_URL;
	}

	/**
	 * @return the gET_DATE
	 */
	public String getGET_DATE() {
		return GET_DATE;
	}

	/**
	 * @param gET_DATE
	 *            the gET_DATE to set
	 */
	public void setGET_DATE(String gET_DATE) {
		GET_DATE = gET_DATE;
	}

	/**
	 * @return the bIND_DATE
	 */
	public String getBIND_DATE() {
		return BIND_DATE;
	}

	/**
	 * @param bIND_DATE
	 *            the bIND_DATE to set
	 */
	public void setBIND_DATE(String bIND_DATE) {
		BIND_DATE = bIND_DATE;
	}

	/**
	 * @return the wRITEOFFS_DATE
	 */
	public String getWRITEOFFS_DATE() {
		return WRITEOFFS_DATE;
	}

	/**
	 * @param wRITEOFFS_DATE
	 *            the wRITEOFFS_DATE to set
	 */
	public void setWRITEOFFS_DATE(String wRITEOFFS_DATE) {
		WRITEOFFS_DATE = wRITEOFFS_DATE;
	}

	/**
	 * @return the cOUPON_DETAIL
	 */
	public String getCOUPON_DETAIL() {
		return COUPON_DETAIL;
	}

	/**
	 * @param cOUPON_DETAIL
	 *            the cOUPON_DETAIL to set
	 */
	public void setCOUPON_DETAIL(String cOUPON_DETAIL) {
		COUPON_DETAIL = cOUPON_DETAIL;
	}

	/**
	 * @return the DEALER_NAME
	 */
	public String getDEALER_NAME() {
		return DEALER_NAME;
	}

	/**
	 * @param DEALER_NAME
	 *            the DEALER_NAME to set
	 */
	public void setDEALER_NAME(String dEALER_NAME) {
		DEALER_NAME = dEALER_NAME;
	}
	
	// add for 第三方优惠券 by liangxiao at 20170527 start

		public String getCOUPON_PWD() {
			return COUPON_PWD;
		}

		public void setCOUPON_PWD(String cOUPON_PWD) {
			COUPON_PWD = cOUPON_PWD;
		}

		public String getCOUPON_PHONE() {
			return COUPON_PHONE;
		}

		public void setCOUPON_PHONE(String cOUPON_PHONE) {
			COUPON_PHONE = cOUPON_PHONE;
		}

		public String getCOUPON_INTRODUCTION() {
			return COUPON_INTRODUCTION;
		}

		public void setCOUPON_INTRODUCTION(String cOUPON_INTRODUCTION) {
			COUPON_INTRODUCTION = cOUPON_INTRODUCTION;
		}

		public int getCOUPON_GRANT_TYPE() {
			return COUPON_GRANT_TYPE;
		}

		public void setCOUPON_GRANT_TYPE(int cOUPON_GRANT_TYPE) {
			COUPON_GRANT_TYPE = cOUPON_GRANT_TYPE;
		}

		public String getFROM_APPLICATION() {
			return FROM_APPLICATION;
		}

		public void setFROM_APPLICATION(String fROM_APPLICATION) {
			FROM_APPLICATION = fROM_APPLICATION;
		}
		
		public String getCREATED_ON() {
			return CREATED_ON;
		}

		public void setCREATED_ON(String cREATED_ON) {
			CREATED_ON = cREATED_ON;
		}
		
		public String getMODIFY_ON() {
			return MODIFY_ON;
		}

		public void setMODIFY_ON(String mODIFY_ON) {
			MODIFY_ON = mODIFY_ON;
		}

//		public String getSUBTITLE() {
//			return SUBTITLE;
//		}
//
//		public void setSUBTITLE(String sUBTITLE) {
//			SUBTITLE = sUBTITLE;
//		}
		
		// add for 第三方优惠券 by liangxiao at 20170527 end
}
