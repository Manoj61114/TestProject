package Java_Main;

import java.util.Scanner;

public class Armstrong_Number {
	
	@SuppressWarnings("resource")
	static public void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("***** ARMSTRING NUMBER *****");
		System.out.println("Enter the Number : ");
		int n = scan.nextInt();
		int temp = n,temp1=n;
		int arm=0,rem;
		int incr= 0;
		while(n!=0) {
			n = n/10;
			incr = incr+1;
					}
		System.out.println("Count : "+incr);
		for(int i=1; i<=incr;i++) {
			rem = temp%10;
			arm = (int) (arm + Math.pow(rem, incr));
			temp=temp/10;
		}
		//System.out.println("Original Number :"+temp);
		//System.out.println("After apply Arm formula Number : "+arm);
		
		if(temp1==arm) {
			System.out.println("Given Number is Armstrong : "+arm);
		}
		else {
			System.out.println("Given number is not armstrong : "+arm);
		}
		
	}

}
