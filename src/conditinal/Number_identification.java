package conditinal;

import java.util.Scanner;

public class Number_identification {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Quesion:The Number is 10?
		Scanner scn = new Scanner(System.in);     //scanner class object
		System.out.print("Enter Your Number = ");
		int a = scn.nextInt();                   //User scanner class method
		//int a = 10;
		if(a ==10)
		{
			System.out.print("Number is 10");
			
		}
		else
		{
			if(a!=10);
			
			System.out.println("Number is Not Correct");
		}
		
		
	
	}
	
}
