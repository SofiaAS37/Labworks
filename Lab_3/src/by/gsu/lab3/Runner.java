package by.gsu.lab3;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.print("Количество конусов: ");
		int i = Integer.parseInt(in.nextLine());
		Konys[] konys = new Konys[i];
		String fileName = "object1.data";
		Serialization sr = new Serialization();
		for (int j = 0; j < i; j++) {
			System.out.print("Высота конуса: ");
			double hight = Double.parseDouble(in.nextLine());
			System.out.print("Радиус основания: ");
			double rad = Double.parseDouble(in.nextLine());
			konys[j] = new Konys(hight, rad);
			sr.serial(konys[j], fileName);
		}
		sr.closeStream();
		Konys[] konys2 = new Konys[i];
		for (int j = 0; j < i; j++) {
			konys2[j] = (Konys) sr.diserial(fileName);
			System.out.println(konys2[j]);
		}
	}

}
