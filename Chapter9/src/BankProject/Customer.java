/**
 * Customer class.
 */

package BankProject;

import java.util.Scanner;

public class Customer {
	private String firstName, lastName;
    private String City, Street, Province, postalCode;
	

/**
 * constructor
 * pre: none
 * post: A Customer object has been created. 
 * Customer data has been initialized with parameters.
 */
public Customer(String fName, String lName, String street, String city, String province, String pCode) {
	firstName = fName;
	lastName = lName;
            Street = street;
            City = city;
            Province = province;
            postalCode = pCode;
}
    
    //Changes the city of the person
    public void changeCity()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your city?");
        City = input.nextLine();
        
    }
    
    //Changes the street of the person
    public void changeStreet()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your street?");
        Street = input.nextLine();
        
    }
    
    //Changes the province of the person
    public void changeProvince()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your province?");
        Province = input.nextLine();
        
    }
    
    //Change the person postal code
    public void changeCode()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your postal code?");
        postalCode = input.nextLine();
        
    }


/** 
 * Returns a String that represents the Customer object.
 * pre: none
 * post: A string representing the Customer object has 
 * been returned.
 */
public String toString() {
	String custString;

	custString = firstName + " " + lastName + ", lives in " + Street + ", " + City + ", " + Province + ", " + postalCode + "\n";
 	return(custString);
}

}


