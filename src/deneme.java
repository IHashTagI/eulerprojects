public class deneme {

	public static long prime (long a, long i) {
		
		while (a<=i) {
			
			if (i % a ==0)
				
				System.out.println(a);
				a++;
		}
		return 0;
}
	
	public static void main(String[] args) {
		long i = 36,a = 2,b=0,c=0;
		
		prime(a,i);
		prime(a,i);
	}

}
