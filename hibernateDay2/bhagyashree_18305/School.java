package com.sonata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
	@Table(name="School1")
	public class School {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int schoolId;
		private String schoolName;
		
		@OneToOne
		@JoinColumn(name="addId")
		private Address schoolAdd;

		public Address getSchoolAdd() {
			return schoolAdd;
		}


		public void setSchoolAdd(Address schoolAdd) {
			this.schoolAdd = schoolAdd;
		}


		public int getSchoolId() {
			return schoolId;
		}


		public String getSchoolName() {
			return schoolName;
		}


		@Override
		public String toString() {
			return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolAdd=" + schoolAdd + "]";
		}


		public void setSchoolId(int schoolId) {
			this.schoolId = schoolId;
		}


		public void setSchoolName(String string) {
			this.schoolName = string;
		}
		
		

}
