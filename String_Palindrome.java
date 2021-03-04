package Java_Main;

import java.util.Scanner;

public class String_Palindrome {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = scan.next();
		char [] a = s.toCharArray();
		String rev ="";
		int len = a.length;
		for(int i=len-1;i>=0;i--) {
			//System.out.print(a[i]);
			rev = rev + a[i];
		}
		System.out.println("Reverse String : "+rev);
		if(s.equals(rev)) {
			System.out.println("Given String is Palindrome : "+s);
		}
		else {
			System.out.println("Given string is not Palindrome : "+s);
		}
		
	}
}
