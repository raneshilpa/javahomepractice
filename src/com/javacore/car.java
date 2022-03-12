package javabasics;

public class car {

	int mod;
	int wheel;
	
	public static void main(String[] args) {
		//new car() --this is object of a car class
		// object is an instance of a class
		//a,b,c -object reference variable
		//class is collection of object.its a logical entity.
		
		
		 car a = new car();
		 car b = new car();
		 car c = new car();
		
		  a.mod=2015;
		  a.wheel=4;
		  
		  b.mod=2014;
		  b.wheel=4;
		  
		  c.mod=2013;
		  c.wheel=4;
		 
		  System.out.println("before shifting the references");
		  System.out.println(a.mod);
		  System.out.println(a.wheel);
		  System.out.println("After shifting the references");
			a=b;
			b=c;
			c=a;
			a.mod=10;
			System.out.println(a.mod);//10
			
			c.mod=20;
			System.out.println(a.mod);//20
			System.out.println(c.mod);
		  

	}

}
