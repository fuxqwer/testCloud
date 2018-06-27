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
	public Dept get(@PathVariable("id") Long id) {
		return deptService.findById(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> list() {
		return deptService.findAll();
	}

}
