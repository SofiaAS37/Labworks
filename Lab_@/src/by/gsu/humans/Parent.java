package by.gsu.humans;

public class Parent extends Human {

	private String placeOfWork;
	private int numberOfKids;

	public Parent() {
	}

	public Parent(String firstNameLastName, int age, String sex) {
		super(firstNameLastName, age, sex);
	}

	public Parent(String firstNameLastName, int age, String sex, String placeOfWork, int numberOfKids) {
		super(firstNameLastName, age, sex);
		this.placeOfWork = placeOfWork;
		this.numberOfKids = numberOfKids;
	}

	public int getNumberOfKids() {
		return numberOfKids;
	}

	public String getPlaceOfWork() {
		return placeOfWork;
	}

	public String name() {
		return getFirstNameLastName() + " Место работы " + placeOfWork;
	}

	public String toString() {
		return "Parent " + super.toString() + " Место работы " + placeOfWork + ";" + " Количество детей " + numberOfKids
				+ ";";
	}
}