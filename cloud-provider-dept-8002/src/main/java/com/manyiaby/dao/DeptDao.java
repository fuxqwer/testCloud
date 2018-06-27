/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.dao
* @author: fux
* @date: 2018年6月21日 上午10:58:22
*/

package com.manyiaby.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.manyiaby.entities.Dept;

/**
 * @ClassName: DeptDao
 * @Description: dept Dao
 * @author: fux
 * @date: 2018年6月21日 上午10:58:22
 */

@Mapper
public interface DeptDao {

	public Boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
