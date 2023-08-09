package learningjava2;
import java.util.Scanner;
public class program6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fruit = in.next();
		switch (fruit) {
			case "Mango" -> System.out.println("its a fruit");
			case "Apple" -> System.out.println("its a fruit");
			case "banana" -> System.out.println("its a fruit");
			case "watermelon" -> System.out.println("its a fruit");
			default -> System.out.print("enter a fruit");
		}
	}

}
