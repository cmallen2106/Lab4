//Lab 4 - Exercise 4
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab4Ex4;
import java.util.Arrays; 
import java.util.Scanner; 

public class Numbers {

	public static void main(String[] args) {
		
		//Asking user for array size
		Scanner scan = new Scanner(System.in); 
		System.out.println("Input size of Array: "); 
		int arraySize = Integer.parseInt(scan.nextLine()); 
		int[] group = new int[arraySize]; 
		
		//Asking user and loading array elements 
		for (int index = 0; index < group.length; index++) {
		System.out.println("Enter array numbers: " + (index+1) + ": "); 
		group[index] = scan.nextInt(); 
		}
		
		//close scanner
				scan.close();
		

	}
}
