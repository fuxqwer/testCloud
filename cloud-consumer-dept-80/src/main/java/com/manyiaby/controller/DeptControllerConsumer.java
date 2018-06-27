/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.controller
* @author: fux
* @date: 2018年6月21日 下午1:51:51
*/

package com.manyiaby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.manyiaby.entities.Dept;

/**
 * @ClassName: DeptControllerConsumer
 * @Description: deptcontroller 消费者
 * @author: fux
 * @date: 2018年6月21日 下午1:51:51
 */
@RestController
public class DeptControllerConsumer {
	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://CLOUD-DEPT"; // eureka 中注册的微服务名字

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/dept/add")
	public Boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
	}

	@RequestMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping("/dept/list")
	public List<Dept> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
	}

}
