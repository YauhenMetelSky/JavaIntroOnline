package by.metelsky.classes.simpleclasses.task3.main;

import javax.print.PrintException;

import by.metelsky.classes.simpleclasses.task3.entity.Group;
import by.metelsky.classes.simpleclasses.task3.entity.Student;
import by.metelsky.classes.simpleclasses.task3.view.StudentView;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
 *  номер группы, успеваемость (массив из пяти элементов). 
 *  Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий
 *  и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
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
		Student st10= new Student();
		st10.setFio("Filman F.S.");
		st10.setGroupNumber(4);
		st10.setAcademicPerformance(goodAcadem);
		
		Group group1 = new Group(1, new Student[] {st1,st2,st3});
		Group group2 = new Group(2, new Student[] {st4,st5,st6});
		Group group3 = new Group(3, new Student[] {st7,st8});
		Group group4 = new Group(4, new Student[] {st9});
		
		StudentView sv = new StudentView();
		sv.printExellentStudent(group2);
		System.out.println(st1);
		

	}

}
