package Java_Main;

import java.util.Scanner;

public class Prime_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("********Prime Number 1 to 100**********");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Prime Number : ");
		for(int i = 1;i<=100;i++) {
			int a=1;
			for(int j=2; j<i;j++) {
				if(i%j==0) {
					a = a+1;
					}
			}
			if(a==1) {
				System.out.print(i+" ");
				
			}
		}
		
	System.out.println("\nPrime Number by User Input");
	System.out.println("Enter Number >>> ");
	int n = scan.nextInt();
	System.out.print("Prime Number : ");
	for(int k=1;k<=n; k++) {
		int prime =1;
		for(int l=2; l<k; l++) {
			if(k%l==0) {
				prime = prime+1;
			}
		}
		if(prime==1) {
			System.out.print(k +" ");
		}
	}
	}
}
