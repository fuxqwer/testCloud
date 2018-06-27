/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.controller
* @author: fux
* @date: 2018年6月21日 上午11:35:33
*/

package com.manyiaby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.manyiaby.entities.Dept;
import com.manyiaby.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @ClassName: DeptController
 * @Description: DeptController
 * @author: fux
 * @date: 2018年6月21日 上午11:35:33
 */

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	@PostMapping("/dept/add")
	public Boolean add(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}

	@GetMapping("/dept/get/{id}")
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {
		Dept dept = deptService.findById(id);
		if (dept == null) {
			throw new RuntimeException("无此记录" + id);
		}
		return dept;
	}

	/**
	 * 
	 * @Title: processHystrix_Get
	 * @Description: 使用服务熔断返回错误信息
	 * @param id
	 * @return Dept
	 * @author fux
	 * @date 2018年6月25日下午10:27:44
	 */
	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDeptno(id).setDname("无此用户").setDbsource("not in database");
	}

	@GetMapping("/dept/list")
	public List<Dept> list() {
		return deptService.findAll();
	}

}
