package com.atlunk.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor//全参的构造函数
@NoArgsConstructor//空参构造函数
@Data//生成get set
@Accessors(chain=true)//链表模式
public class Dept implements Serializable{//Dept(Entiy) orm mySql->Dept(table)类表关系映射

	private long 	deptno; //主键
	private String 	dname;//部门名称
	private String 	db_source;//来自哪个数据库

	
	//@Accessors(chain=true)//链表模式-链表使用
	public static void mian(String args[]) {
		Dept dept = new Dept();
		dept.setDeptno(11L).setDname("RD").setDb_source("DB01");
	}
}
