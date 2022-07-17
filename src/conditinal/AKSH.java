package conditinal;

import java.util.Scanner;

public class AKSH {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		Scanner scn1 = new Scanner(System.in);
		System.out.print("Bill Of Dish A ");
		int a =scn1.nextInt();
		System.out.print("Bill Of Dish B ");
		int b = scn1.nextInt();
		System.out.print("Bill Of Dish C ");
		int c = scn1.nextInt();
		int total = a+b+c;

		if(total<350)
		{
			if(total<150)
			{
				System.out.println("Minimum Bill Amount Should Be 150");
			}
			else
			{
				System.out.println("Your Bill Is"  +(total+35));

			}
		}
		else
		{
			System.out.println("Your Bill Is " + total);
			System.out.println("...Thank You For Visit...");
		}

		
      }


	}

