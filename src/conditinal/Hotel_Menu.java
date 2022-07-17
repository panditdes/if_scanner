package conditinal;

import java.util.Scanner;

public class Hotel_Menu {

	
	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print("Bill Of Dish A ");
		int a =scn.nextInt();
		System.out.print("Bill Of Dish B ");
		int b = scn.nextInt();
		System.out.print("Bill Of Dish C ");
		int c = scn.nextInt();
		int total = a+b+c;

		if(total<350)
		{
			if(total<150)
			{
				System.out.println("Minimum Bill Amount Should Be RS.150");
			}
			else
			{
				System.out.println("Your Bill Is RS."  +(total+35));

			}
		}
		else
		{
			System.out.println("Your Bill Is RS. "  + total);
			System.out.println("...Thank You For Visit...");
		}


	}

}

		
		
		
		

		
		

	

