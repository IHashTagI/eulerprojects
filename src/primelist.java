import java.util.ArrayList;

public class primelist {

	public static ArrayList<Integer> findprimes(int start,int end)
    {
		ArrayList<Integer> primes = new ArrayList<Integer>();
			
		
		for(int n = start; n < end ;n++) {
			boolean prime = true;			
			int i = 2;			 
			while(i <= n/2) {
				if(n % i == 0) {
					prime = false;
					break;
				}
				i++;
			}
			if (prime) {
				primes.add(n);
			}
			
		}
		
		return primes;
    }
	public static void main(String[] args) {
		
		System.out.println((findprimes(1,100)));
		
	}
}
