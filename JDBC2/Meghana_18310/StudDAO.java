package com.sonata.DAO;

import java.util.List;

import com.sonata.Exception.DuplicationException;
import com.sonata.Model.Student;

public interface StudDAO {
	public int addStudent(Object obj) throws DuplicationException;
	public List<Student> getStudent();

}
