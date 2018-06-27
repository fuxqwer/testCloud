/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.service
* @author: fux
* @date: 2018年6月25日 下午9:39:09
*/

package com.manyiaby.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.manyiaby.entities.Dept;

/**
 * @ClassName: DeptClientService
 * @Description: 使用feign处理的service
 * @author: fux
 * @date: 2018年6月25日 下午9:39:09
 */
// @FeignClient(value = "CLOUD-DEPT")
@FeignClient(value = "CLOUD-DEPT", fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

	@PostMapping("/add")
	public Boolean addDept(Dept dept);

	@GetMapping("/dept/get/{id}")
	public Dept findById(@PathVariable("id") Long id);

	@GetMapping("/dept/list")
	public List<Dept> findAll();
}
