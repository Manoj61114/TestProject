package Java_Main;

import java.util.Scanner;

public class Factorial_Program {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("**************Factorial Program**********");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		int fact = 1;
		for(int i=1; i<=n;i++) {
			fact = fact *i;
		}
		System.out.println("Factorial of "+n+ " number is : "+fact);
		
		
		
		System.out.println("\n*********Factorial Series**********");
		System.out.print("Enter the new Number : ");
		int nn = scan.nextInt();
		int fact1 = 1;
		System.out.print("Factorial Number >> ");
		for(int j=nn;j>=1;j--) 
		{
			System.out.print(j);
			if(j!=1) {
			System.out.print("*");
			}
			fact1 = fact1 *j;
		}
		System.out.print(" : "+fact1);
	}
	
}
