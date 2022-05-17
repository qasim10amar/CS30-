/*

Program: LocalBank.java          Last Date of this Revision: May 17, 2022

Purpose: An application that create an account for a person at the bank

Author: Qasim Amar, 
School: CHHS
Course: Computer Programming 30
 

*/

package BankProject;

import java.util.Scanner;

public class LocalBank {

	public static void main(String[] args) {
		
//Creates bank object
Bank easySave = new Bank();
Scanner input = new Scanner(System.in);

//Create variables for choice and account id
String action, acctID;
Double amt;

/* display menu of choices */
do {
	
    //Ask user for choice
	System.out.println("\nDeposit\\Withdrawal\\Check balance\\Modify Address");
	System.out.println("Add an account\\Remove an account");
	System.out.println("Quit\n");
	System.out.print("Enter choice: ");
	action = input.next();

    //If add account do this
	if (action.equalsIgnoreCase("A")) 
                {
		easySave.addAccount();
	} 
                //If it doesn't equal quit do one of these
                else if (!action.equalsIgnoreCase("Q")) 
                {
		System.out.print("Enter account ID: ");
		acctID = input.next();
                        
        //Deposit into account
		if (action.equalsIgnoreCase("D")) 
                        {
                            System.out.print("Enter deposit amount: ");
                            amt = input.nextDouble();
                            easySave.transaction(1, acctID, amt);
		} 
                        //Withdraw from an account
                        else if (action.equalsIgnoreCase("W")) 
                        {
                            System.out.print("Enter withdrawal amount: ");
                            amt = input.nextDouble();
                            easySave.transaction(2, acctID, amt);
		} 
                        //Check money in account
                        else if (action.equalsIgnoreCase("C")) 
                        {
                            easySave.checkBalance(acctID);
		}
                        //Delete an account
                        else if (action.equalsIgnoreCase("R")) 
                        {
                            easySave.deleteAccount(acctID);
		}
                        //Change information
                        else if (action.equalsIgnoreCase("M")) 
                        {
                            easySave.modifyAccount(acctID);
                        }
	}
}       //If it equals quit end program
        while (!action.equalsIgnoreCase("Q"));
}
}

/* Screen Dump:


Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: A
First name: Qasim
Last name: Amar
What is your street: 57 Manner Way
What is your city: Calgary
What is your province: Alberta
What is your postal code: T2K4Z8
Beginning balance: 1000
Account created. Account ID is: QAmar

Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: D
Enter account ID: QAmar
Enter deposit amount: 2200
QAmar
Qasim Amar, lives in 57 Manner Way, Calgary, Alberta, T2K4Z8
Current balance is $3,200.00

Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: W
Enter account ID: QAmar
Enter withdrawal amount: 200
QAmar
Qasim Amar, lives in 57 Manner Way, Calgary, Alberta, T2K4Z8
Current balance is $3,000.00

Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: C
Enter account ID: QAmar
QAmar
Qasim Amar, lives in 57 Manner Way, Calgary, Alberta, T2K4Z8
Current balance is $3,000.00

Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: M
Enter account ID: QAmar
What is your street?458 Manner Way
What is your city?Aidre
What is your province?Alberta
What is your postal code?t2k5y7
QAmar
Qasim Amar, lives in 458 Manner Way, Aidre, Alberta, T2J4Y7
Current balance is $3,000.00

Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: R
Enter account ID: QAmar
Account removed.

Deposit\Withdrawal\Check balance\Modify Address
Add an account\Remove an account
Quit

Enter choice: Q

*/
