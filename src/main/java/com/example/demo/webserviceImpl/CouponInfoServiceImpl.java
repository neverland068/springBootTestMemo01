package com.example.demo.webserviceImpl;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.bean.input.CouponInfoInput;
import com.example.demo.bean.output.CouponInfoOutput;
import com.example.demo.webservice.CouponInfoService;


/**
 * IF0034 优惠券验证 ServiceImpl
 * 
 * @author common
 *
 */
@WebService(serviceName = "CouponInfoService", // 与接口中指定的name一致
targetNamespace = "http://webservice.demo.example.com/", // 与接口中的命名空间一致,一般是接口的包名倒
endpointInterface = "com.example.demo.webservice.CouponInfoService"// 接口地址
)
@Component
public class CouponInfoServiceImpl implements CouponInfoService {

    /** 日志对象 */
    private static Logger logger = LoggerFactory.getLogger(CouponInfoServiceImpl.class);
    
    /**
     * 优惠券验证
     * @param input 输入参数
     * @return 输出
     */
    public CouponInfoOutput getCouponInfo(CouponInfoInput input) {

        logger.info("======================G-club系统-优惠券验证 接口調用開始。======================");
        CouponInfoOutput output = new CouponInfoOutput();
        output.setErrorMessage("测试");
        output.setReturnFlag(10001);
        logger.info("======================G-club系统-优惠券验证接口調用结束。======================");
        return output;
    }
}
