import java.util.Scanner;

public class euler3 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextLong();
		long a = 2;
		
			
		
			while (a<=i) {
			
				if (i % a ==0)
					
					System.out.println(a);
					a++;
			}
		}
}