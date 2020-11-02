package by.metelsky.classes.simpleclasses.task3.logic;

import by.metelsky.classes.simpleclasses.task3.entity.Student;

public class StudentLogic {
	public static final int  CONDITION_EXELLENT_STUDENT = 9;
	
	private static final StudentLogic instance = new StudentLogic();
	private StudentLogic() {
		
	}
	
	public static StudentLogic getInstance() {
		return instance;
	}
	
	
	public boolean isExellentStudent(Student student) {
		boolean isExellentStudent = true;
		 for(int mark : student.getAcademicPerformance()) {
			 if(mark < CONDITION_EXELLENT_STUDENT) {
				 isExellentStudent = false;
				 break;
			 } else {
				 isExellentStudent = true;
			 }
			 
		 }
		 
		 return isExellentStudent;
		
				
	}
	

}
