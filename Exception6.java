package com.infosys.exceptions;//our class should extends exception,Throwable
//parameterized constructor
class InvalidAgeException extends Exception
{
	private int age;
	public InvalidAgeException(int age) 
	{
		this.age=age;
	}
	@Override
	public String toString() {
		return "you are not eligable for vote"+age;
	}}
public class Exception6 
{
	static void validation(int age) throws InvalidAgeException  
       {
     if(age<18)
    	
        throw new InvalidAgeException(age);//MyException1 obj
     else
      System.out.println("you are eligable to vote");
   }  
   public static void main(String args[])   
      {
				try {
					Exception6.validation(16);
				} catch (InvalidAgeException e) {
					// TODO Auto-generated catch block
					System.out.println("age must be above 18 to vote");
				}
      System.out.println("rest of the code...");
      }
   }