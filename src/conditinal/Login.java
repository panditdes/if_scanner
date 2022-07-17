package conditinal;

import java.util.Scanner;

public class Login {

	
	
	public static void main(String[] args) {
		
		
		System.out.println("WELCOME To AKSH HOTEL PLEASE LOGIN");
		

		// dev. login functionality take input from user and validate it
		@SuppressWarnings("resource")
		Scanner scn= new Scanner(System.in);
		System.out.print("Enter user Name : ");
		String userName=scn.nextLine();

		if(userName.equals("java"))
		{
			System.out.print("Enter Password: ");
			String password = scn.nextLine();
			if(password.equals("oracle123"))

			{
				System.out.println("Logged in");

			}
			else 
			{
				System.out.println("Your Password id Wrong");
			}
		}
		else
		{
			System.out.println("Enter correct user name");
		}

		
		
      }
}
		

		

	




		
		
				


