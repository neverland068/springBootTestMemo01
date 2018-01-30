package com.example.demo.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.webservice.CommonService;
import com.example.demo.webservice.CouponInfoService;

@Configuration
public class CxfConfig {
	@Autowired
	private Bus bus;

	@Autowired
	CommonService commonService;
	@Autowired
	CouponInfoService couponInfoService;

	@Bean
	public ServletRegistrationBean dispatcherServlet(){
		return new ServletRegistrationBean(new CXFServlet(), "/gtms-ap/ap/*");
	}
	
	/** JAX-WS **/
	@Bean
	public EndpointImpl endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, commonService);
		endpoint.publish("/CommonService");
		return endpoint;
	}
	/** JAX-WS **/
	@Bean
	public EndpointImpl endpointCouponInfoService() {
		EndpointImpl endpoint = new EndpointImpl(bus, couponInfoService);
		endpoint.publish("/CouponInfoService1");
		return endpoint;
	}
}

