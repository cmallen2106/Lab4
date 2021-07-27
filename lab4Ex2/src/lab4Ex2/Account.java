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

	public static void main(String[] args) {

	}

}
