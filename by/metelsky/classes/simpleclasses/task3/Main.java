package by.metelsky.classes.simpleclasses.task3;

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		int[] goodAcadem = {9,10,9,9,10};
		int[] badAcadem = {9,10,7,9,10};
		
		
		
		Student st1 = new Student("Ivanov I.I.",1,goodAcadem);
		Student st2 = new Student("Petrov P.C.",1,badAcadem);
		Student st3 = new Student("Shalamov V.A.",1,goodAcadem);
		Student st4 = new Student("Sidorov S.K.",2,goodAcadem);
		Student st5 = new Student("Perumov A.N.",2,badAcadem);
		Student st6 = new Student("Potter H.I.",2,goodAcadem);
		Student st7 = new Student("Baranov E.N.",3,badAcadem);
		Student st8 = new Student("Prokop A.A.",3,badAcadem);
		Student st9 = new Student("Borisov I.O.",4,badAcadem);
//		Student st10 = new Student("Filman F.S.",3,goodAcadem);
		Student st10= new Student();
		st10.setFio("Filman F.S.");
		st10.setGroupNumber(4);
		st10.setAcademicPerformance(goodAcadem);
		students[0]=st1;
		students[1]=st2;
		students[2]=st3;
		students[3]=st4;
		students[4]=st5;
		students[5]=st6;
		students[6]=st7;
		students[7]=st8;
		students[8]=st9;
		students[9]=st10;
		printExellentStudent(students);
		
	}
	public static void printExellentStudent(Student[]mas) {
		for(int i=0; i<mas.length;i++) {
			if(mas[i].getIsExellentStudent()) {
			System.out.println(mas[i].getFio() + " group number = " + mas[i].getGroupNumber());
		}
	}

}

}
