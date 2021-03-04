package Java_Main;

import java.util.Scanner;

public class Calculator_Program {
static long a,b,c,d,e,f,g,h,i,j;
	
//	public long addition(long a, long b) {
//		long m = a+b;
//		return m;
//	}
//	public long addition(long a, long b, long c) {
//		long n = a+b+c;
//		return n;
//	}
//	public long addition(long a, long b, long c,long d) {
//		long o = a+b+c+d;
//		return o;
//	}
	public static long addition(long a, long b, long c,long d,long e,long f,long g, long h, long i, long j) {
		long sum = a+b+c+d+e+f+g+h+i+j;
		return sum;
	}
		
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String args[]) {
		
	System.out.println("********Calculator Program of Addition, subtraction , Multiplication and division etc********");
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number for addtion : ");
	a = scan.nextLong();
	b = scan.nextLong();
	c = scan.nextLong();
	d = scan.nextLong();
	e = scan.nextLong();
	f = scan.nextLong();
	g = scan.nextLong();
	h = scan.nextLong();
	i = scan.nextLong();
	j = scan.nextLong();
	
	long sum = addition(a, b,  c, d, e, f, g,  h,  i,  j);
	
	System.out.println("Sum of total Number : "+sum);
	
	}
	}
