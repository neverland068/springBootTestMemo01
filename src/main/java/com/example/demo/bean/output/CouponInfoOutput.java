package com.example.demo.bean.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.example.demo.base.bean.entity.CouponValirResultEntity;
import com.example.demo.base.bean.output.BaseOutputInfo;

/**
 * 优惠券验证Output
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CouponInfoOutput extends BaseOutputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 处理结果 */
    @XmlElement(required = true)
    private String result = "0";

    /** 优惠券LIST */
    private CouponValirResultEntity[] couponValirResultList = new CouponValirResultEntity[] {};

    /**
     * 返回 处理结果
     * 
     * @return 处理结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置 处理结果
     * 
     * @param result
     *            处理结果
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 获取couponValirResultList
     * 
     * @return couponValirResultList couponValirResultList
     */

    public CouponValirResultEntity[] getCouponValirResultList() {
        return couponValirResultList;
    }

    /**
     * 设置couponValirResultList
     * 
     * @param couponValirResultList
     *            couponValirResultList
     */

    public void setCouponValirResultList(CouponValirResultEntity[] couponValirResultList) {
        this.couponValirResultList = couponValirResultList;
    }

}
