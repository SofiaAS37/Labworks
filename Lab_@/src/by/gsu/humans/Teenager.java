package by.gsu.humans;

public class Teenager extends Human {

	private int numberOfSchool;
	private String grade;

	public Teenager() {
	}

	public Teenager(String firstNameLastName, int age, String sex) {
		super(firstNameLastName, age, sex);
	}

	public Teenager(String firstNameLastName, int age, String sex, int numberOfSchool, String grade) {
		super(firstNameLastName, age, sex);
		this.grade = grade;
		this.numberOfSchool = numberOfSchool;
	}

	public int getNumberOfSchool() {
		return numberOfSchool;
	}

	public String getGrade() {
		return grade;
	}

	public String name() {
		return getFirstNameLastName() + "Номер школы " + numberOfSchool + " Успеваемость " + grade;
	}

	public String toString() {
		return "Teenager " + super.toString() + " Номер школы " + numberOfSchool + ";" + " Успеваемость " + grade + ";";
	}
}