/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby
* @author: fux
* @date: 2018年6月26日 上午10:07:29
*/

package com.manyiaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName: DeptConsumer_Dashboard_App
 * @Description: 服务监控
 * @author: fux
 * @date: 2018年6月26日 上午10:07:29
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_Dashboard_App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer_Dashboard_App.class, args);
	}
}
