/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby
* @author: fux
* @date: 2018年6月21日 下午3:26:08
*/

package com.manyiaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer7001_App
 * @Description: eureka注册中心
 * @author: fux
 * @date: 2018年6月21日 下午3:26:08
 */
@SpringBootApplication
@EnableEurekaServer // 标识开启Eureka
public class EurekaServer7001_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001_App.class, args);
	}
}
