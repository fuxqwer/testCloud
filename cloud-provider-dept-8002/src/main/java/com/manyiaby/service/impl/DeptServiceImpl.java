/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.service.impl
* @author: fux
* @date: 2018年6月21日 上午11:30:21
*/

package com.manyiaby.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manyiaby.dao.DeptDao;
import com.manyiaby.entities.Dept;
import com.manyiaby.service.DeptService;

/**
 * @ClassName: DeptServiceImpl
 * @Description: service 实现类
 * @author: fux
 * @date: 2018年6月21日 上午11:30:21
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	/*
	 * (non Javadoc)
	 * 
	 * @Title: addDept
	 * 
	 * @Description: addDept
	 * 
	 * @return
	 * 
	 * @see com.manyiaby.service.DeptService#addDept(Dept dept)
	 */

	@Override
	public Boolean addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: findById
	 * 
	 * @Description: findById
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see com.manyiaby.service.DeptService#findById(java.lang.Long)
	 */

	@Override
	public Dept findById(Long id) {
		return deptDao.findById(id);
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: findAll
	 * 
	 * @Description: findAll
	 * 
	 * @return
	 * 
	 * @see com.manyiaby.service.DeptService#findAll()
	 */

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}

}
