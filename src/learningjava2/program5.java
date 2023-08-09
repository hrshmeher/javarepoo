package learningjava2;

public class program5 {
	public static void main(String[] args) {
		int num = 1304333;
		int ans = 0;
		while(num>0) {
			int rem = num % 10;
			num /=  10;
			ans = ans *10 + rem;
		}
		System.out.print(ans);
		}
			
				
}
