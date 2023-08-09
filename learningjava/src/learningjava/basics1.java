package learningjava;

import java.util.Scanner;

public class basics1 {
	public static void main(String[] args){ 
		Scanner in = new Scanner(System.in);
		System.out.println("please enter a number: ");
		int n = in.nextInt();
		if (n<=1) {
			System.out.println("neither prime nor composite");
			return;
			}
		int c  = 2;
		while (c*c<=n) {
			if(n%c ==0) {
				System.out.println("not prime");
			return;
				
		}
			c = c + 1;
			// c++;			
		}
		   if (c * c > n) {
	            System.out.println("Prime");
	}

}
	
}
