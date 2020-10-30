package labassignmentday4;

import java.util.Scanner;
class InputException extends Exception{}
public class userexceprtion  {
     public static void main(String args[]) throws InputException {
    	 Scanner sc=new Scanner(System.in);
    	 int n=150;
    	 System.out.println("Enter any number:");
    	 int n1=sc.nextInt();
    	 try{
    		 if(n1 > n)
    			 throw new InputException();
    	 }
    		 catch(InputException e) {
    			 System.out.println("Number can't be greater than 100");
    		 }
     }
}
