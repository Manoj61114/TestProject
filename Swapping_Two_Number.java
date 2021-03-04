package Java_Main;

import java.util.Scanner;

public class Swapping_Two_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("*************Swapping Program with third variable ***********");
		Scanner scan =  new Scanner(System.in);
		System.out.print("\nEnter the value of A : ");
		int a = scan.nextInt();
		System.out.print("\nEnter the value of B : ");
		int b = scan.nextInt();
		System.out.println("Before swap the value A : "+ a +" and B : "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap the value A : "+a+" and B : "+b);
	}
}
