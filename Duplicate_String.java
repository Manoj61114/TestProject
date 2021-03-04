package Java_Main;

import java.util.Scanner;

public class Duplicate_String {

	public static void duplicate_string(String s) {
		int count=0;
		System.out.println("Orginal String : "+s);
		System.out.println("Duplicate String charactor : ");
		for(int i =0; i<s.length();i++) {
		char d = 0 ; 
			for(int j = i+1;j<s.length();j++) {
				
				if(s.charAt(i)==s.charAt(j)) {
				 
					if(d!=s.charAt(i))
					{
					count++;

					d = s.charAt(i);

					System.out.println("Duplicate Charaacter is "+d);
					
					}

					}
					}
					}
					System.out.println("Number of duplicate character is "+count);
					}
		

	
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = scan.nextLine();
		duplicate_string(s);
	}
}
