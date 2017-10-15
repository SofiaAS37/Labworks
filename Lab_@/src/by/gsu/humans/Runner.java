package by.gsu.humans;

public class Runner {
	public static void main(String[] args) {
		Human[] humanArray = { new Human("Иван Петров", 42, "Мужской"), new Child("Марко Ив", 4, "Мужской", 4),
				new Teenager("Майк Лоусон", 15, "Мужской", 63, "Хорошая"),
				new Parent("Мария Иванова", 40, "Женский", "ЗАО Белкельме", 3),
				new Teenager("Лена Иванова", 12, "Женский", 78, "Отличная"), new Child("Патрик Ив", 3, "Мужской", 8),
				new Human("Петр Петров", 36, "Мужской"), new Child("Александр Иванов", 3, "Мужской", 5),
				new Human("Алиса Селезнева", 17, "Женский"),
				new Parent("Егор Летов", 43, "Мужской", "Безработный", 1) };

		for (int i = 0; i < humanArray.length; i++) {
			System.out.println(humanArray[i]);
			System.out.println(humanArray[i].name());
		}
	}
}