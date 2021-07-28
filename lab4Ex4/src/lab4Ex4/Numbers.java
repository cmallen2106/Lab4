//Lab 4 - Exercise 4
//Christina Sosa
//Programming Fundamentals, Summer 2021

package lab4Ex4;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
	  
	public static int nextLargest(int array[], int n) 
	    { 
	        int nextLargestElement = -1;
	        
	      for (int i = 0; i < array.length; i++)  
	      {
	    	  if (array[i] > n) 
	    	    {
	    		  nextLargestElement = array[i];
	    	break;
	      }
	      }
	       return nextLargestElement;
	       
	      }
	       
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int size;
		int array[];
		int sortedArray[];
				
		//User inputs and stores size of array		
		System.out.print("Enter the size of the array: ");
		size = scan.nextInt();
		array = new int[size];
		sortedArray = new int[size];
		
		//user inputs and stores numbers
		System.out.print("Enter the numbers: ");
		
		for(int i = 0; i < size; i++)
		{ array[i] = scan.nextInt();
			sortedArray[i] = array[i];
		}
		
		//sort and print list of number and the next larger numbers next to it
		Arrays.sort(sortedArray);
		int max = Arrays.stream(array).max().getAsInt();
		
		for (int i = 0; i < size; i++)
		{
			int nextLargestElement = nextLargest(sortedArray, array[i]);
		if(nextLargestElement != -1)
		{
			System.out.println(array[i] + " : " + nextLargestElement);
		}
		else
		{
			//System.out.println(array[i]);
			System.out.println(array[i] + ": " + Integer.MAX_VALUE);
			
		}
		
		}
	
	}		
	
  }
