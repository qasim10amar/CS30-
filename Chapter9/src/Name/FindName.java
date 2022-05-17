package Name;

import java.util.Scanner;
import java.lang.Math;

public class FindName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many names do you want to enter: ");
		int numNames = input.nextInt();
		input.nextLine();
		String Name;
		int location;
		String names[] = new String[numNames];

		for(int i=0 ; i<names.length; i++) {
		System.out.println("Enter name: " + (i));
		names[i] = input.nextLine();
		}


		System.out.println("Which name do you want to find: ");
		Name=input.nextLine();

		location = SearchName.linear(names, Name);

		if (location == -1) {
		System.out.println("Sorry, n not found in array.");
		} else {
		System.out.println("Occurrence is element " + location);
		}

		}
		}

