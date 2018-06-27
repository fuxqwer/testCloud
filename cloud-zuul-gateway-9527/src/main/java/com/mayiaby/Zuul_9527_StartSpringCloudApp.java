/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.mayiaby
* @author: fux
* @date: 2018年6月26日 上午10:41:19
*/

package com.mayiaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: Zuul_9527_StartSpringCloudApp
 * @Description: TODO
 * @author: fux
 * @date: 2018年6月26日 上午10:41:19
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9527_StartSpringCloudApp {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}
}
