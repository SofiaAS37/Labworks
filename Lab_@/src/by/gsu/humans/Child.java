package by.gsu.humans;

public class Child extends Human {

	private int numberOfKindergarten;

	public Child() {
	}

	public Child(String firstNameLastName, int age, String sex) {
		super(firstNameLastName, age, sex);
	}

	public Child(String firstNameLastName, int age, String sex, int numberOfKindergarten) {
		super(firstNameLastName, age, sex);
		this.numberOfKindergarten = numberOfKindergarten;
	}

	public int getNumberOfKindergarten() {
		return numberOfKindergarten;
	}

	public String name() {
		return super.name() + " Номер детского сада " + numberOfKindergarten;
	}

	public String toString() {
		return "Child " + super.toString() + " Номер детского сада " + numberOfKindergarten + ";";
	}

}