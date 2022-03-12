package javabasics;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		
		

	}
//method overloading- when the method name is same with different argument orb input parameter within same class
	
	public void sum() {
		System.out.println("sum method");
	}
	
	public void sum(int x)
	{
		System.out.println(" one input parameter");
		System.out.println(x);
	}
	public void sum(int y, int s)
	{
		System.out.println("two input parameter");
		System.out.println(y+s);
		
		
	}
	
	
}
