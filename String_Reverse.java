package Java_Main;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		System.out.println("********* Reverse String************");
		System.out.println("Enter the String :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("Befoe Reverse String : "+s);
		int length =s.length();
		System.out.println("Size of string : "+length);
		char rev ;
		char [] c = s.toCharArray();
		
		System.out.print("Reverse String : ");
		for(int i =length-1; i>=0; i--) {
			rev = s.charAt(i);
			System.out.print(rev);
		}
		System.out.println();
		
		System.out.println("\n***************Char array ***************");
		int len = c.length;
		System.out.println("Size of char Array : "+len);
		System.out.print("Reverse String : ");
		for(int j=len-1;j>=0;j--) {
			System.out.print(c[j]);
		}
	
	}
}
