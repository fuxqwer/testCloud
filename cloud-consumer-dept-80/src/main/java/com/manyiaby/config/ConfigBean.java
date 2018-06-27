/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.config
* @author: fux
* @date: 2018年6月21日 下午1:48:54
*/

package com.manyiaby.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ConfigBean
 * @Description: 配置类
 * @author: fux
 * @date: 2018年6月21日 下午1:48:54
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced // 使用ribbon的负载均衡，默认轮训
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	/**
	 * 
	 * @Title: myRule
	 * @Description: 选择随机的规则
	 * @return IRule
	 * @author fux
	 * @date 2018年6月25日下午5:26:24
	 */
	/*@Bean
	public IRule myRule() {
		return new RandomRule();
	}*/
}
