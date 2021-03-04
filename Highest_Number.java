package Java_Main;

import java.util.Scanner;

public class Highest_Number {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int len = scan.nextInt();
		int a[] = new int[len];
		System.out.print("Enter the array Value : ");
		for(int i =0;i<len;i++) {
			  a[i] =scan.nextInt();
		}
		System.out.print("Array Element : ");
		for(int j=0;j<len;j++) {
		System.out.print(a[j]+" ");
		}
		
		System.out.println("\n***** Sorting of Array *********");
		
		for(int k=0;k<len;k++) {
			for(int l=k+1;l<len;l++) {
				if(a[k]>a[l] ) {
					int temp = a[l];
					a[l] = a[k];
					a[k] = temp;
					
				}
			}
		}
		
		System.out.println("\nSorted Array : ");
		for(int j=0;j<len;j++) {
			System.out.print(a[j]+" ");
			}
			System.out.println("\nHighest Number : "+a[len-1]);
			System.out.println("Second Highest Number : " +a[len-2]);
	
	}
		
}
