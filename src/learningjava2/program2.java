package learningjava2;
import java.util.Scanner;
public class program2 {
	 // case check 
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.print("enter a ch:");
		char ch = in.next().trim().charAt(0);
		if (ch>='a'&& ch<='z') {
			System.out.println("lowercase");	
		}else {
			System.out.println("Uppercase");
		}
			
		}
}
