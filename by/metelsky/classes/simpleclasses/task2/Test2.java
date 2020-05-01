package by.metelsky.classes.simpleclasses.task2;

public class Test2 {
	private int age;
	private String name;

	public Test2(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	public Test2() {
		age = 5;
		name = "Fenya";
	}

	public void setAge(int age) {
		if(age>0) {
		this.age = age;
		}else {
			System.out.println("Age must be greater than 0");
		}
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
