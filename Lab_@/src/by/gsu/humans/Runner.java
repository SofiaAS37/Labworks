package by.gsu.humans;

public class Runner {
	public static void main(String[] args) {
		Human[] humanArray = { new Human("���� ������", 42, "�������"), new Child("����� ��", 4, "�������", 4),
				new Teenager("���� ������", 15, "�������", 63, "�������"),
				new Parent("����� �������", 40, "�������", "��� ���������", 3),
				new Teenager("���� �������", 12, "�������", 78, "��������"), new Child("������ ��", 3, "�������", 8),
				new Human("���� ������", 36, "�������"), new Child("��������� ������", 3, "�������", 5),
				new Human("����� ���������", 17, "�������"),
				new Parent("���� �����", 43, "�������", "�����������", 1) };

		for (int i = 0; i < humanArray.length; i++) {
			System.out.println(humanArray[i]);
			System.out.println(humanArray[i].name());
		}
	}
}