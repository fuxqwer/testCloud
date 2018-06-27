/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.service
* @author: fux
* @date: 2018年6月26日 上午9:18:43
*/

package com.manyiaby.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.manyiaby.entities.Dept;

import feign.hystrix.FallbackFactory;

/**
 * @ClassName: DeptClientServiceFallbackFactory
 * @Description: TODO
 * @author: fux
 * @date: 2018年6月26日 上午9:18:43
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

	/*
	 * (non Javadoc)
	 * 
	 * @Title: create
	 * 
	 * @Description:
	 * 
	 * @param arg0
	 * 
	 * @return
	 * 
	 * @see feign.hystrix.FallbackFactory#create(java.lang.Throwable)
	 */

	@Override
	public DeptClientService create(Throwable arg0) {
		return new DeptClientService() {

			@Override
			public Dept findById(Long id) {
				return new Dept().setDeptno(id).setDname("无此记录").setDbsource("not in database");
			}

			@Override
			public List<Dept> findAll() {
				return null;
			}

			@Override
			public Boolean addDept(Dept dept) {
				return null;
			}
		};
	}

}
