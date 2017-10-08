package by.gsu.lab1;

public class Runner {

	public static void main(String[] args) {
		Book[] product = new Book[]{ 
				new Book("Product 1", 1400, true), 
				new Book("Product 2", 2500, false), 
				new Book("Product 3", 1780, true), 
				new Book("Product 4", 1860, false), 
				new Book("Product 5", 2300, true), 
				new Book("Product 6", 2431, true),
				new Book("Product 7", 3799, true),
				new Book("Product 8", 2120, false),
				new Book("Product 9", 1999, true),
				new Book("Product 10", 2549, true)
				}; 

		for (int i = 0; i < product.length; i++) {
			System.out.println(product[i]);
		}

		System.out.println(
				"Books with pics: " + Book.getTotalkolvo() + "; Total price: " + Book.getTotalPrice());
	}

}