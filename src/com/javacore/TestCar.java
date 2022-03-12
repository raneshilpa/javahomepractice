package javabasics;

public class TestCar {

	public static void main(String[] args) {
	 
	  BMW b = new BMW();
	  b.start();
	  b.stop();
	  b.refuel();
	  b.theftsafety();
	  b.engine();
	 
	  System.out.println("-------");
	  Carr c =new Carr();
	  c.start();
	  c.stop();
	  c.refuel();
	  
	  System.out.println("-------");
	  Carr c1 = new BMW(); //dynamic polymorphism
	  c1.start();
	  c1.stop();
	  c1.refuel();
	  
	  

	}

}
