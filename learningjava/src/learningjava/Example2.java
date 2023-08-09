package learningjava;

public class Example2 {
	public static void main(String[] args){ 
		int salary = 24000;
		if (salary > 10000) {
		salary += 2500;
	}else if (salary > 15000) {
		salary+=1000;
	} else {
		salary+=500;		
	}
		System.out.print(salary);
	}
}
	
		