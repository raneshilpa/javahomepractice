package javabasics;

public class FunctionsInJava {

	public static void main(String[] args) {
        FunctionsInJava obj = new FunctionsInJava();//obj is reference variable of object
        // new FunctionsInJava() is object
        obj.test();
        int add = obj.pqr();
        System.out.println("Addition of a+b (10+20):   "+ add);
        
        String str = obj.qa();
        System.out.println("String value is  : "+str);
        
        int div = obj.division(30,10);
        System.out.println("Division of 30 / 10 : " +div);
		
	}
	//non static method
		public void test() 
		{
			
			System.out.println("test method");
		}
		
		public int pqr()
		{
			int a=10;
			int b=20;
			int c=a+b;
			return c;
			
			
		}
        public String qa()
        {
        	System.out.println("QA method");
        	String s ="Selenium";
        	return s;
        	
        }
        public int division(int x,int y)
        {
        	System.out.println("DIVISION METHOD");
        	
        	int d=x/y;
        	return d;
        	
        		
        	
        }
	

}
