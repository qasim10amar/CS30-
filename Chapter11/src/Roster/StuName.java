package Roster;


public class StuName {
	
	String firstName, lastName;
	
	public StuName(String name)
    {          
		int idx = name.lastIndexOf(' ');
		firstName = name.substring(0, idx);
		lastName  = name.substring(idx + 1);
	}
	 public String toString() {
		 return firstName + " " + lastName;
	 }
}
