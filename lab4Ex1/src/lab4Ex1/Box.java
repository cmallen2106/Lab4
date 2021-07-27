//Lab 4 - Exercise 1
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab4Ex1;

public class Box {
	
	int size = 0; 
	public static char c = 'c'; 

	public static void main(String[] args) {
		Box box = new Box(); 
		box.setSize(); 
		box.printBox(); 
	}
	
	//method to set size of printBox method
	public void setSize() {
		size = 5; 
	}
	
	//Add a method to this class named printBox with no parameters and void return type, that
	//prints out to the screen a set of * (star) characters with size rows and size columns.
	
	public void printBox() {
		for (int num = 1; num <= size; num++) {
			for (int index = 1; index <= size; index++)
				System.out.println("*"); 
			System.out.println(); 
		}
	}
	
	//overloaded method loop for printbox
	public void printBox (char c) {
		for (int num = 1; num <= size; num++) {
			for (int index = 1; index <= size; index++)
				System.out.println(c); 
			System.out.println(); 
		}
	}
	
		 

}