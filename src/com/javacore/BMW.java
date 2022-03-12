package javabasics;

public class BMW extends Carr{
 //when method is present in parent class as well as in child class with the same name and same number of arguments is called method overriding.
	
	public void start() // Overridden method
	{
		System.out.println(" BMW START ---");
	}
	public void theftsafety()
	{
		System.out.println(" BMW SAFETY ");
	}
	
	
	
}
