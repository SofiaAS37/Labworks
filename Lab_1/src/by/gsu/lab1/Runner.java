package by.gsu.lab1;

public class Runner {

	public static void main(String[] args) {
		Book[] product = new Book[]{ 
				new Book("Product 1", 1400, true), 
				new Book("Product 2", 2500, false), 
				new Book("Product 3", 1780, true), 
				new Book("Product 4", 1860, false), 
				new Book("Product 5", 2300, true), 
				}; 
				for(int i=0; i<product.length; i++){ 
				System.out.println(product[i]); 
				} 
				System.out.println("книг с илюстрациями: "+Book.getTotalkolvo()+"; Общая стоимосить: "+Book.getTotalPrice()); 

				} 

}