
public class euler6 {

	public static void main(String[] args) {
		
		double a=0,sum1=0,sum2=0;
		
		for (int i=0;i<101;i++) {
			sum2 +=Math.pow(i, 2);;
		}
		System.out.println(sum2);
		
		for (int i=0;i<101;i++) {
			sum1 +=i;
		}
		a=Math.pow(sum1, 2);
		System.out.println(a);
		long b = (long) (a -sum2);
		System.out.println(b);
	}

}
