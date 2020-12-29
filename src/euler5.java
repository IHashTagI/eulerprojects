
import java.util.Scanner;
public class euler5 
{
    public static void main(String[] args) 
    {
        int n, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        euler5 obj = new euler5();
        x = obj.prime(n, 2);
        if(x == 1)
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }
    int prime(int y,int i)
    {
         if(i < y)
        {
            if(y % i != 0) 
            {
                return(prime(y, ++i));
            } 
            else
            {
                return 0; 
            }
        }
        return 1;
    }
}
/*import java.util.Scanner;
public class deneme1 {
public static void main(String arg[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Sayýyý giriniz: ");
	int sayi=scanner.nextInt();
	int bolen=2;
	int bolunen=sayi;
	System.out.println("Asal çarpanlar: ");
	while(bolen<sayi){
		if(bolunen%bolen==0){
			System.out.println(bolen);
			bolunen/=bolen;
			if 
		}
		else{
			bolen++;
		}
	}
}
}*/