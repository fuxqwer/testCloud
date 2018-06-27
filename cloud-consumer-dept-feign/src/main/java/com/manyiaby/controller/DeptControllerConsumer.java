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

import com.manyiaby.entities.Dept;
import com.manyiaby.service.DeptClientService;

/**
 * 
 * @ClassName: DeptControllerConsumer
 * @Description: feign 的消费者
 * @author: fux
 * @date: 2018年6月25日 下午5:59:04
 */
@RestController
public class DeptControllerConsumer {
	@Autowired
	private DeptClientService service;

	@RequestMapping("/dept/add")
	public Boolean add(Dept dept) {
		return this.service.addDept(dept);
	}

	@RequestMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.findById(id);
	}

	@RequestMapping("/dept/list")
	public List<Dept> list() {
		return this.service.findAll();
	}

}
