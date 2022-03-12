package javabasics;

public interface USBank {

	int min_bal =100;
	
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	// only method declaration
	//no method body -only method prototype
	//in interface we can declare variables - var are by default static in nature
	//var values will not be changed
	//no static method in interface
	//no main method in interface
	// we can not create object of interface--abstract in nature
	
	
}
