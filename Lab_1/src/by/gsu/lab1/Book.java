package by.gsu.lab1;

public class Book {
	private String name, knig; 
	private Boolean ilustr; 
	private int price;
	private int kolvo;
	private static int totalPrice; 
	private static int totalkolvo; 
	

public Book (String name, int price, Boolean ilustr) { 
super(); 
this.name = name; 
this.ilustr = ilustr; 
this.price = price; 
totalPrice+=this.price; 
if (ilustr==true) {
	    totalkolvo++;
	    knig= "Присутствуют";
}
else{
		knig= "Отсутствуют";
}
 
} 
public static int getTotalPrice(){ 
return totalPrice; 
} 

public static int getTotalkolvo() { 
	
return totalkolvo; 
} 

@Override 
public String toString() { 
return "Название: " + name + ", Цена: " + price + ", Наличие иллюстраций: " + knig + ";"; 
} 
}
