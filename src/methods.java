
public class methods {

	public static boolean isPrime (long number) {
		int counter=0;
		long sqrt=(long) Math.sqrt(number);
		for (long x =1 ; x<=sqrt ; x++) {
			if (number%x==0) {
				counter++;
			}
			if (counter>1) {
				return false;
			}
		}
		return true;
	}
	
	public static long tenthousandandone(long limit) {
		long counter = 1;
		long result = 0;
		for (long x= 2; counter<= limit;x++) {
			if (isPrime(x)) {
				result =x;
				counter++;
			}
		}
		return result;
	}
		
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println(tenthousandandone(10001));
		long end = System.currentTimeMillis();
		System.out.println("sec"+ (double)(end-start) );
		

	}

}
