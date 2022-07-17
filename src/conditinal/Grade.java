package conditinal;

import java.util.Scanner;

public class Grade {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// If You Knoe The Percentaage Calculate Grade
		//	A+= 90
		//	A = 80
		//	B = 70
		//	C = 60
		//	D = 50
		//	E =<40


		Scanner scn = new Scanner (System.in);
		System.out.print("Please Enter Your Percentage: ");
		float a = scn.nextFloat();

		if(a>=90) 
		{
			System.out.print("Your Grade Is A+ ");
		}
		else if(a>=80)
		{
			System.out.print("Your Grade Is A ");
		}		
		else if	(a>=70)	
		{
			System.out.print("Your Grade Is B ");
		}
		else if	(a>=60)	
		{
			System.out.print("Your Grade Is C ");
		}		
		else if	(a>=50)	
		{
			System.out.print("Your Grade Is D ");
		}
		else if	(a>=40)	
		{
			System.out.print("Your Grade Is E ");
		}
		else 
		{
			System.out.print("Your ARE FAIL ");
		}
	}

}
