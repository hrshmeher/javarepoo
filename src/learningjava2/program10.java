package learningjava2;

import java.util.Scanner;

public class program10 {
	public static void main(String[] args) {
		
		sum();
		
	}
	static void sum() {
		
	
	Scanner in = new Scanner (System.in);
		System.out.print("enter number 1: ");
		int num1 = in.nextInt();
		System.out.print("enter number 2: ");
		int num2 = in.nextInt();
		int sum = num1 + num2;
		System.out.print("the sum is : "+ sum);
		
		
}
}