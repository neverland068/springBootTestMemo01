package com.example.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.example.demo.bean.input.CouponInfoInput;
import com.example.demo.bean.output.CouponInfoOutput;

/**
 * 优惠券验证Service
 * 
 * @author common
 *
 */
@WebService(name = "CouponInfoService", // 暴露服务名称
targetNamespace = "http://webservice.demo.example.com/"// 命名空间,一般是接口的包名倒序
)
public interface CouponInfoService {
    /**
     * 优惠券验证
     * @param input 输入参数
     * @return 输出
     */
    @WebMethod
    public CouponInfoOutput getCouponInfo(@WebParam(name="parmInput") CouponInfoInput input) ;
    
}
