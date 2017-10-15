package by.gsu.humans;

public class Human {
	private String firstNameLastName;
	private int age;
	private String sex;
	public Human() {
	}

	public Human(String firstNameLastName, int age) {
		this.firstNameLastName = firstNameLastName;
		this.age = age;
	}

	public Human(String firstNameLastName, int age, String sex) {
		this.firstNameLastName = firstNameLastName;
		this.age = age;
		this.sex = sex;
	}

	public String getFirstNameLastName() {
		return firstNameLastName;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}

	public String name() {
		return firstNameLastName + " " + sex;
	}
	
	public String toString() {
		return "Human ФИО " + firstNameLastName + ";" + " Возраст " + age + ";" + " Пол " + sex + ";";
	}

}