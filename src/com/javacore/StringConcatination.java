package com.javacore;

public class StringConcatination {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		String x = "Hello ";
		String y = "World";
		
		Double c = 12.33;
		Double d = 10.33;
		
		System.out.println("-----------------------------");
		String con = x.concat(y);
		System.out.println("string concatination using concat() :" +con);
		
		
		System.out.println("-----------------------------");
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
	
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(x+y+c+d);
		
		System.out.println("Value of a is : "+a);
	

	}

}
