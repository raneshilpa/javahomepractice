package com.lambda;
interface calculator{
    void add(int num1, int num2);

}

class CalC
{
    public static void addSomething(int num1, int num2)
    {
        System.out.println(num1 +" and  "+num2 + " addition is "+(num1+num2));
    }
    public void letsAdd(int num1, int num2)
    {
        System.out.println(num1 +" and  "+num2 + " adds to "+(num1+num2));
    }
}
//functional interface
interface Messenger
{
    Message getmessage(String msg);

}

class Message
{
    Message(String msg)
    {
        System.out.println(" message is "+msg);
    }

}
public class MethodReferencesApp {


    public static void main(String[] args) {
    // CalC.addSomething(10,20);
     // 1.
     //reference to the static method
    // calculator cref = CalC ::addSomething; /// method reference
  //   cref.add(30,50);

        //2.
 // reference to the non static method or intance method
        //object construction statement for CalC
  //      CalC cal = new CalC();
  //      calculator ref = cal::letsAdd;
 //       ref.add(5,5);

        //reference to a constructor
 Messenger  mreg = Message::new;
 mreg.getmessage("Search the candle");



    }
}
