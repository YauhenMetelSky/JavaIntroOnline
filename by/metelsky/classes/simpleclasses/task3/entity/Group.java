package by.metelsky.classes.simpleclasses.task3.entity;

import java.util.Arrays;



public class Group {
	private int groupNumber;
	private Student[] students;
	
	public Group() {
		
	}
	public Group (int groupNumber, Student[] students) {
		this.groupNumber = groupNumber;
		this.students = students;
	}
	
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}
	
	public void setStudents(Student[] students) {
		this.students = students;
	}
	public Student[] getStudents() {
		return students;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(students);
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
		Group other = (Group) obj;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String studentsForPrint = "\n";
		
		for(Student stu : students) {
			studentsForPrint = studentsForPrint + stu.getFio() +"\n";
		}
		return "Group " + groupNumber + ", students:" + studentsForPrint + "]";
	}
	
	
	
	

}
