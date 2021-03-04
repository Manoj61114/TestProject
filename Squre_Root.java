package Java_Main;

import java.util.Scanner;

public class Squre_Root {

	public long squre(long a) {
		System.out.println("**** Normal Squre *****");
		long squre = a * a;
		return squre;
	}
	public double squre_rootMath(long a) {
		System.out.println("**** Squre Root *****");
		double squre_math = (long) Math.sqrt(a);
		return squre_math;
	}
	
	@SuppressWarnings("resource")
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number :");
		long n = scan.nextLong();
		Squre_Root s = new Squre_Root();
		long normal_squre = s.squre(n);
		System.out.println(normal_squre);
		double math_squre = s.squre_rootMath(n);
		System.out.println(math_squre);
	}
	
}
