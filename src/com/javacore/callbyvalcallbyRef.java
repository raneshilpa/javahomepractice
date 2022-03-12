package javabasics;

public class callbyvalcallbyRef {
	int p;
	int q;
	

	public static void main(String[] args) 
	{
		int x =10;
		int y =20;
			
		
		callbyvalcallbyRef obj = new callbyvalcallbyRef();
		obj.p=30;
		obj.q=40;
		
		
		obj.testsum(x, y);////call by value or pass by value
		
		//before swap
		   System.out.println("BEFORE SWAP");
	       System.out.println("p = " +obj.p);
	       System.out.println("q = " +obj.q);
		   System.out.println("--------------");
     
		   obj.swap(obj); // CALL BY REFERENCE
       
       //after swap
       System.out.println("AFTER SWAP ");
       System.out.println("p = " +obj.p);
       System.out.println("q = " +obj.q);
       
	}

	
	
	public int testsum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public void swap(callbyvalcallbyRef t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
		
	}
}
