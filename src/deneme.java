
public class deneme {

	public static void main(String[] args) {
		
		
		int counter =10001;
		for(long i=2;i<=counter;i++)
		{
			for(long j=2;j<=i;j++)
			{
				if(j==i) {
					System.out.println(i);
					counter--;
				}
				if(i%j==0) {
					break;
				}
			}
		}
		
		
		
		
	}

}
