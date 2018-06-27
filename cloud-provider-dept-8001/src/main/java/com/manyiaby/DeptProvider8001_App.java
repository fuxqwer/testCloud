/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby
* @author: fux
* @date: 2018年6月21日 上午11:43:22
*/

package com.manyiaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: DeptProvider8001_App
 * @Description: 主启动类
 * @author: fux
 * @date: 2018年6月21日 上午11:43:22
 */

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_App.class, args);
	}
}
