package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Employee;

public interface EmpDao {

	public int save(Object object);
	public List<Employee> getData();
	
}

