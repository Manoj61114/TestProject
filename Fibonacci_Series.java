package Java_Main;

import java.util.Scanner;

public class Fibonacci_Series {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int first = 0,second =1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = scan.nextInt();
		System.out.print("Fibonacci Series : "+first+" "+second+" ");
		int fact;
		while(n!=0) {
			fact = first+second;
			System.out.print(fact+" ");
			first = second;
			second = fact;
			n--;
		}
	}
}
