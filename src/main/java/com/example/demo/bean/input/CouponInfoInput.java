package com.example.demo.bean.input;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.example.demo.base.bean.input.BaseInputInfo;

/**
 * 优惠券验证Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CouponInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 优惠券码 */
    @XmlElement(required = true)
    private String couponId;

    /** 维修工单号 */
    @XmlElement(required = true)
    private String srvOrderNo;

    /** 销售店CODE */
    @XmlElement(required = true)
    private String dealerCode;

    /** SFX代码 */
    @XmlElement(required = true)
    private String sfxCode;

    /** VIN */
    @XmlElement(required = true)
    private String vin;

    /**
     * SFX代码取得
     * 
     * @return SFX代码
     */
    public String getSfxCode() {
        return sfxCode;
    }

    /**
     * SFX代码设定
     * 
     * @param dealerCode
     *            SFX代码
     */
    public void setSfxCode(String sfxCode) {
        this.sfxCode = sfxCode;
    }

    /**
     * VIN取得
     * 
     * @return VIN
     */
    public String getVin() {
        return vin;
    }

    /**
     * VIN设定
     * 
     * @param dealerCode
     *            VIN
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * 销售店CODE取得
     * 
     * @return 销售店CODE
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * 销售店CODE设定
     * 
     * @param dealerCode
     *            销售店CODE
     */
    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    /**
     * 优惠券码取得
     * 
     * @return 优惠券码
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 优惠券码设定
     * 
     * @param couponId
     *            优惠券码
     */
    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getSrvOrderNo() {
        return srvOrderNo;
    }

    public void setSrvOrderNo(String srvOrderNo) {
        this.srvOrderNo = srvOrderNo;
    }

}
