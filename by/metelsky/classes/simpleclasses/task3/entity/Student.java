package by.metelsky.classes.simpleclasses.task3.entity;

import java.util.Arrays;


public class Student {
	
	private String fio;
	private int groupNumber;
	private int[] academicPerformance;
	
		public Student() {
		
		
	}
      public Student(String fio, int groupNumber,int[] academicPerformance) {
    	  this.fio = fio;
    	  this.groupNumber = groupNumber;
    	  this.academicPerformance = academicPerformance;
;
      	       	   
 	}
     
   	public void setFio(String fio) {
		this.fio = fio;
	}
	
	public String getFio() {
		return fio;
	}
	
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;

	}
	
	public int[] getAcademicPerformance() {
		return academicPerformance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(academicPerformance);
		result = prime * result + ((fio == null) ? 0 : fio.hashCode());
		result = prime * result + groupNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (!Arrays.equals(academicPerformance, other.academicPerformance))
			return false;
		if (fio == null) {
			if (other.fio != null)
				return false;
		} else if (!fio.equals(other.fio))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [fio=" + fio + ", groupNumber=" + groupNumber + ", academicPerformance="
				+ Arrays.toString(academicPerformance) + "]";
	}
	
	
}
