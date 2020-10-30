package labassignmentday4;

import java.util.*;
public class ExtensionOfException {

	public static void main(String[] args) throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Please enter a number or enter '-1' if you want to quit");
		do {
		  n=scanner.nextInt();
		  if(n>100) {
			  System.out.println("Number can't be greater than 100");
				throw new InputMismatchException("Number can't be greater than 100");
		  }
		 if(n!=-1) {
			
		   if(n>0) {
			 try {
			if(n%2==0) {
				System.out.println("You have entered an even number");
			}
			else {
				System.out.println("you have entered an odd number");
			}
		}
			catch(InputMismatchException e) {
				System.out.println("You must enter an integer"); 
			}
		}
		}
		else if(n==-1)
			System.out.println("your program will end here");
        
	}while(n!=-1);
	}
}
