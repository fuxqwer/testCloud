/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.service
* @author: fux
* @date: 2018年6月21日 上午11:28:12
*/

package com.manyiaby.service;

import java.util.List;

import com.manyiaby.entities.Dept;

/**
 * @ClassName: DeptService
 * @Description: service 接口
 * @author: fux
 * @date: 2018年6月21日 上午11:28:12
 */

public interface DeptService {
	public Boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
