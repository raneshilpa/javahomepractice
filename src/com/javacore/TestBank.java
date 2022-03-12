package javabasics;

public class TestBank {

	public static void main(String[] args) {
	    System.out.println("MINIMUM BALANCE : "+USBank.min_bal);
		//USBank.min_bal =200; --- not allowed -- you can not change value of interface variable
	    
	    
	    
		HSBCbANK B = new HSBCbANK();
		B.credit();
		B.debit();
		B.transferMoney();
		B.car_loan();
		B.edu_loan();
		B.mutualfund();
		System.out.println("------------");
		
		
		//dynamic polymorphism
		
        // child class object can be referered by parent interface reference var
		
		USBank u =new HSBCbANK();
		u.credit();
		u.debit();
		u.transferMoney();
	
	}

}
