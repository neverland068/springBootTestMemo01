package com.example.demo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "CommonService", // 暴露服务名称
targetNamespace = "http://webservice.demo.example.com/"// 命名空间,一般是接口的包名倒序
)
public interface CommonService {
	@WebMethod
	public String sayHello(@WebParam(name = "userName") String name);
}