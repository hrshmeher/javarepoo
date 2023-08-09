package learningjava2;

public class program4 {
	public static void main(String[] args) {
		int n = 1304333;
		
		int count=0;
		while(n>0) {
		int rem = n%10;
		if (rem==3) {
			count++;
			
		}
		n /=10;
	}
		
	System.out.println(count);
	}
}
