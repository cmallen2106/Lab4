//Lab 4 - Exercise 2
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab4Ex2;

//Create a new class called Account
public class Account {
	
	//A static variable called numAccounts, initialized to 0.
	static int numAccounts = 0; 
	
	//A constructor method that will add 1 to the numAccounts variable each time a new Account object is created.
	public Account() {
		numAccounts++; 
	}
	
	//A static method called getNumAccounts(). It should return numAccounts
	public static int getNumAccounts() {
		return numAccounts; 
	}

	//Test the functionality in the main method of Account by creating a few Account objects, then print out the number of accounts.
	public static void main(String[] args) {
		
		new Account(); 
		new Account(); 
		new Account(); 
		
		System.out.println("Number of Accounts: " + Account.getNumAccounts()); 

	}

}
