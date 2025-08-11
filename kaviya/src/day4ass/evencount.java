package day4ass;
import java.util.Scanner;
public class evencount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int evencount=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				evencount++;
				}
		}
		{
		System.out.println(evencount);
		sc.close();
		}
	}

}
