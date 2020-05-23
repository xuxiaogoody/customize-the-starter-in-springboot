package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @EnableConfigurationProperties(HelloProperties.class)
 * 保证了即使HelloProperties没有加入到ioc
 * 在本类中依然可以生效
 * @author xuxiao
 *
 */
@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfigrution {
	@Autowired
	HelloProperties helloProperties;
	@Bean
	public HelloService helloService() {
		HelloService service = new HelloService();
		service.setProperties(helloProperties);
		return service;
	}

}
