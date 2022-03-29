package Account;

import java.util.Scanner;

public class BusinessAcct {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		double Bala;
		double Wamo;
		String fName;
		String lName;
		String Str;
		String City;
		String Pro;
		String Zip;
		String withdraw;

		System.out.println("Enter your Balance: ");
		Bala = input.nextDouble();

		System.out.println("Enter your First Name: ");
		fName = input.next();

		System.out.println("Enter your Last Name: ");
		lName = input.next();

		System.out.println("Enter your Street: ");
		Str = input.next();

		System.out.println("Enter your City: ");
		City = input.next();

		System.out.println("Enter your Province: ");
		Pro = input.next();

		System.out.println("Enter your Zip Code: ");
		Zip = input.next();

		Account Cole = new Account(Bala,fName,lName,Str,City,Pro,Zip);



		do
		{


		System.out.println("Would you like to withdraw from your balance? Y for Yes N for No : ");
		withdraw = input.next();

		if (Bala<500 && withdraw.equalsIgnoreCase("Y")) {
		System.out.print("Enter amount to withdraw: ");
		Wamo = input.nextDouble();
		
		if (Wamo == 0 ) {
			Cole.withdrawal(Wamo);
		}
		else {
			Cole.withdrawal(Wamo+10);
		}
		
		} else if (Bala>= 500 && withdraw.equalsIgnoreCase("Y")) {
		System.out.print("Enter amount to withdraw: ");
		Wamo = input.nextDouble();
		Cole.withdrawal(Wamo);
		}

		} while(!withdraw.equalsIgnoreCase("N"));
		System.out.println(Cole.toString());
		}		

	}


