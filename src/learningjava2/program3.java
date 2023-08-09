package learningjava2;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		System.out.print("enter a number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = 0;
		int i = 1;
		int count = 2;
		
		
		while (count<=n) {
			int temp = i;
			i = i+p;
			p = temp;
			count++;
		}
		
	System.out.println(i);

}
}
