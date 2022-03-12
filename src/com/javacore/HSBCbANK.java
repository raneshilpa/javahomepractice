package javabasics;

public class HSBCbANK implements USBank, BrazilBank{ // ACHEIVING MULTIPLE INHERITANCE

	// IF a class is implementing any interface then its mandatory to define or override all methods of interface
	
	//overriding from USBank
	public void credit()
	{
		System.out.println("....HSBC ---CREDIT");
	}
	
	public void debit()
	{
		System.out.println("HSBC ----debit");
	}
	public void transferMoney()
	{
		System.out.println("HSBC ---TRANSFER MONEY");
	}
	
	// seperate method of HSBCbANK
	
	public void edu_loan()
	{
		System.out.println("HSBC ---EDUCATION LOAN");
	}
	
	public void car_loan()
	{
		System.out.println("HSBC ----CAR LOAN");
	}
	
	
	//brazilbank method --OVERRIDNG FROM bRAZILbANK
	
	
	public void mutualfund()
	{
		System.out.println(" HSBC ---mutual fund");
	}
		
	
	
	
}
