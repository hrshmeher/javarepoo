package learningjava2;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.print("enter 3 num to find the largest:");
	int a = in.nextInt();
	int b = in.nextInt();
	int c = in.nextInt();

	int max = a;
	
	if (b > max) {
		max = b;
		
	} if (c > max) {
		  max = c;
		
	}
	   System.out.println("the largest number is " + max);
		
	}

}
