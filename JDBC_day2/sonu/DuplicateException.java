package com.sonata.StudentDaoImpl;

import java.util.Comparator;

import com.sonata.Model.Student;



	public class DuplicateException extends Exception implements Comparator<Student>  {

		public DuplicateException(String message) {
			super(message);
			
		}
		public DuplicateException() {
		
		}

		
		@Override
		public int compare(Student o1, Student o2) {
				if(o1.getStdId()==o2.getStdId())
					return 0;
			return 1;
		}

}
