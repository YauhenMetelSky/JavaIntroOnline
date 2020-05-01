package by.metelsky.classes.simpleclasses.task3;
/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
 *  номер группы, успеваемость (массив из пяти элементов). 
 *  Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий
 *  и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
	
	private String fio;
	private int groupNumber;
	private int[] academicPerformance;
	 boolean isExellentStudent;
	
	
	public Student() {
		
		
	}
      public Student(String fio, int groupNumber,int[] academicPerformance) {
    	  this.fio = fio;
    	  this.groupNumber = groupNumber;
    	  this.academicPerformance = academicPerformance;
//    	  this.isExellentStudent = exellentStudent(academicPerformance);
      	       	   
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
//		this.isExellentStudent = exellentStudent(academicPerformance);
		//Метод exellentStudent() получает в качестве параметра "табель успеваемости"
		//и вовращает false или true.
		// поле c isExellentStudent с модификатором private. Соответственно если true значит отличник.
	}
	
	public int[] getAcademicPerformance() {
		return academicPerformance;
	}
	
	
	public boolean getIsExellentStudent() {
		isExellentStudent=exellentStudent(academicPerformance);
		return isExellentStudent;
	}
	
	private boolean exellentStudent(int[] array) {
		for(int i =0;i<array.length;i++) {
			
			if(array[i]<9) {
				return false;
			}
		}
		return true;
	}

}
