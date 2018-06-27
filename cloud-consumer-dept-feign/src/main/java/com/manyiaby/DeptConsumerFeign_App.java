/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby
* @author: fux
* @date: 2018年6月21日 下午2:04:19
*/

package com.manyiaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: DeptConsumer80_App
 * @Description: 主启动类
 * @author: fux
 * @date: 2018年6月21日 下午2:04:19
 */
@SpringBootApplication
@EnableEurekaClient // 开启eureka客户端，从eureka中获取相关服务
@EnableFeignClients(basePackages = { "com.manyiaby" })
@ComponentScan("com.manyiaby")
public class DeptConsumerFeign_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerFeign_App.class, args);
	}
}
