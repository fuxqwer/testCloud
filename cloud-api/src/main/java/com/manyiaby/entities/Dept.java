/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.manyiaby.entities
* @author: fux
* @date: 2018年6月21日 上午10:33:20
*/

package com.manyiaby.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName: Dept
 * @Description: dept
 * @author: fux
 * @date: 2018年6月21日 上午10:33:20
 */

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

	private Long deptno;// 主键
	private String dname;// 部门名称
	private String dbsource;// 来自于哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库

	/**
	 * @Title:Dept
	 * @Description:有参构造
	 * @param dname
	 */

	public Dept(String dname) {
		super();
		this.dname = dname;
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: toString
	 * 
	 * @Description: toString
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", dbsource=" + dbsource + "]";
	}

}
