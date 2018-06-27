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
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.manyiaby.rule.MyselfRule;

/**
 * @ClassName: DeptConsumer80_App
 * @Description: 主启动类
 * @author: fux
 * @date: 2018年6月21日 下午2:04:19
 */
@SpringBootApplication
@EnableEurekaClient // 开启eureka客户端，从eureka中获取相关服务
@RibbonClient(name = "CLOUD-DEPT", configuration = MyselfRule.class) // 在服务启动的时候加载自定义的ribbon配置类，该类不能被@ComponentScan扫描
public class DeptConsumer80_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}
}
