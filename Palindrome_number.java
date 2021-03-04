package Java_Main;

import java.util.Scanner;

public class Palindrome_number {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("********Palindrome Number***********");
		System.out.println("Enter the Number :");
		int n = scan.nextInt();
		int org = n;
		int rev =0, rem;
		while(n!=0) {
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		System.out.println("origanal Number : "+org);
		System.out.println("Reverse Number : "+rev);
		if(org==rev) {
			System.out.println("Given Number is Palindrome " +rev);
		}
		else {
			System.out.println("Given Number is not Palindrome "+org);
		}
	}
}
