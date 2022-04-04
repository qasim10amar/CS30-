/*

Program: BuisnessAcct.java          Last Date of this Revision: 26-Mar-2022

Purpose: An application that inherits the Account class and requires minimum balance of $500 otherwise charging $10.

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package Account;

import java.util.Scanner;

public class BusinessAcct {

	public static void main(String[] args) {
	
		//Creating Scanner
		Scanner input = new Scanner(System.in);
		
		//Creating variable for each value
		double Bala;
		double Wamo;
		String fName;
		String lName;
		String Str;
		String City;
		String Pro;
		String Zip;
		String withdraw;

		//Asking users to input values
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

		//Initializes the information for the object
		Account Cole = new Account(Bala,fName,lName,Str,City,Pro,Zip);

		//A do while loop that allows user to withdraw fund repeatedly
		do
		{

		//Asks user if they would like to withdraw from their account
		System.out.println("Would you like to withdraw from your balance? Y for Yes N for No : ");
		withdraw = input.next();
		
		//Stores amount user wants to withdraw
		if (Bala<500 && withdraw.equalsIgnoreCase("Y")) {
		System.out.print("Enter amount to withdraw: ");
		Wamo = input.nextDouble();
		
		//If user wants to not withdraw any money no fee is charged
		if (Wamo == 0 ) {
			Cole.withdrawal(Wamo);
		}
		
		//If user wants to withdraw and balance is less than $500 than a extra $10 fee is taken
		else {
			Cole.withdrawal(Wamo+10);
		}
		
		//If user wants to withdraw and balance is equal to or more than $500 than no fee is charged
		} else if (Bala>= 500 && withdraw.equalsIgnoreCase("Y")) {
		System.out.print("Enter amount to withdraw: ");
		Wamo = input.nextDouble();
		Cole.withdrawal(Wamo);
		}

		} 
		
		//When user types N there is no longer a prompt to withdraw money
		while(!withdraw.equalsIgnoreCase("N"));
		
		//Displays the information of the object
		System.out.println(Cole.toString());
		}		

	}

/* Screen Dump:

Enter your Balance: 
500
Enter your First Name: 
Qasim
Enter your Last Name: 
Amar
Enter your Street: 
123 Street Way
Enter your City: 
Calgary
Enter your Province: 
Alberta
Enter your Zip Code: 
T2J4T7
Would you like to withdraw from your balance? Y for Yes N for No : 
Y
Enter amount to withdraw: 10
Would you like to withdraw from your balance? Y for Yes N for No : 
N
Qasim Amar
123 Street Way
Clagary, Alberta  T2J4T7
Current balance is $490.00

Enter your Balance: 
400
Enter your First Name: 
John
Enter your Last Name: 
Jones
Enter your Street: 
52 North Way
Enter your City: 
Calgary
Enter your Province: 
Alberta
Enter your Zip Code: 
T2J4T7
Would you like to withdraw from your balance? Y for Yes N for No : 
Y
Enter amount to withdraw: 20
Would you like to withdraw from your balance? Y for Yes N for No : 
N
John Jones
52 North Way
Calgary, Alberta  T2J4T7
Current balance is $370.00

*/

