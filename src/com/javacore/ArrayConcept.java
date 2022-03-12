package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//to store similar data type values in a array variable
		 // int array
		//lowest bound/index = 0
		//Highest bound/index = n-1
		// array indexoutofbound exceptioni[4]
	
		//one d array///static array//store similar data items
		
		//Disadvantage of array
		//size is fixed -static array  -to overcome this problem - we use collections,arraylist,hashtable---dynamic array
		
		//store only similar data types -to overcome this problem -- we use object array
		
		
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
	 System.out.println(" array length/size =  " +i.length);
	 System.out.println(i[2]);
	 System.out.println(i[3]);
	 
	//print all the values of array use for loop
	 for(int j=0; j<i.length;j++)
	 {
		 System.out.println(i[j]);
	 }
	 //double array
	 
	 double d[]= new double[3];
	 d[0]=10.11;
	 d[1]=11.11;
	 d[2]=12.11;
	 System.out.println(d[2]);

	 //char array
	 char c[]=new char[3];
	 c[0]='a';
	 c[1]='b';
	 c[2]='c';
	 
	 //boolean arrray
	 boolean b[]=new boolean[2];
	 
	 b[0]=true;
	 b[1]=false;
	 
	 
	 //string array
	 String s[]=new String[3];
	 s[0]="test";
	 s[1]="Hello";
	 s[2]="world";
	 System.out.println("string array length "+s.length );
	 
	 System.out.println("-------------------------------");
	 
	 ////Java Program to print the array elements using for-each loop
	 int arr[] = {11,22,33,44};
	//printing array using for-each loop  
	 for(int k:arr)
	 {
		 System.out.println(k);
	 }
	 System.out.println("-------------------------------");
	 //object array --object is a class
	 Object ob[] =new Object[6];
	 ob[0]="tom";
	 ob[1]=25;
	 ob[2]=12.33;
	 ob[3]="1/1/1982";
	 ob[4]='M';
	 ob[5]="london";
	 System.out.println(ob[5]);
	 System.out.println(ob.length);
	 System.out.println("-------------------------------");
	
	 //two d array
	 String x[][] = new String[3][5];
	 System.out.println("total number of row "+ x.length); //total numbare of rows 3
	 
	 System.out.println("total number of column "+x[0].length);//total number of column 5
		
	 x[0][0] ="A";
	 x[0][1] ="B";
	 x[0][2] ="C";
	 x[0][3] ="D";
	 x[0][4] ="E";
	 
	 x[1][0] ="A1";
	 x[1][1] ="B1";
	 x[1][2] ="C1";
	 x[1][3] ="D1";
	 x[1][4] ="E1";
	 
	 x[2][0] ="A2";
	 x[2][1] ="B2";
	 x[2][2] ="C2";
	 x[2][3] ="D2";
	 x[2][4] ="E2";
	 
	 System.out.println(x[1][2]);
	 	
	 //print all values of 2 D array 
	 
	 
	 for(int row=0;row<x.length;row++)
	 {
		 for(int col=0;col<x[0].length;col++)
	  {
		  System.out.print(x[row][col]+ " ");
	  }
		 System.out.println();
	 }
		
		
		
		
		

	}

}
