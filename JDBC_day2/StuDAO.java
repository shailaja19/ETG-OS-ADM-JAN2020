package com.sonata.Dao;

import java.util.List;

import com.sonata.Model.Student;
import com.sonata.StudentDaoImpl.DuplicateException;



public interface StuDAO {
	public int addStudent(Object obj) throws DuplicateException;
	public List<Student> getStudent();

}
