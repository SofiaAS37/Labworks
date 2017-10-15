package by.gsu.lab3;

import java.io.Serializable;

public class Konys implements Serializable {

	private double hight;
	private double rad;
	private static double pi = 3.14;

	public Konys(double hight, double rad) {
		super();
		this.hight = hight;
		this.rad = rad;
	}

	public double getPlos() {
		return (double) ((double) Math.pow(rad, 2) * pi);
	}

	@Override
	public String toString() {
		return "Высота: " + hight + ", Радиус основания: " + rad + ", Площадь основания: " + getPlos() + ";";
	}
}
