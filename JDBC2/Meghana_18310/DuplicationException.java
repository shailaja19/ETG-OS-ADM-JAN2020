package com.sonata.Exception;

import java.util.Comparator;

import com.sonata.Model.Student;

public class DuplicationException extends Exception implements Comparator<Student>   {
	

	public DuplicationException(String message) {
		super(message);
		
	}
	public DuplicationException() {
	
	}

	
	@Override
	public int compare(Student o1, Student o2) {
			if(o1.getStdId()==o2.getStdId())
				return 0;
			
		
		return 1;
	}

}
