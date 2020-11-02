package by.metelsky.classes.simpleclasses.task3.view;

import by.metelsky.classes.simpleclasses.task3.entity.Group;
import by.metelsky.classes.simpleclasses.task3.entity.Student;
import by.metelsky.classes.simpleclasses.task3.logic.StudentLogic;

public class StudentView {

	public void printExellentStudent(Group group) {
		StudentLogic studentLogic = StudentLogic.getInstance();
		boolean flag = false;
		for (Student student : group.getStudents()) {

			if (studentLogic.isExellentStudent(student)) {
				flag = true;
				System.out.println(student.getFio() + " group number = " + student.getGroupNumber() +".");
			}

		}
		if (!flag) {
			System.out.println("There are no excellent students in group " +group.getGroupNumber() +".");
		}

	}

}
