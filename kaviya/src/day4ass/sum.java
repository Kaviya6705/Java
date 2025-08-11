package day4ass;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>9) 
		{
			
		while(num>0)
		{
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
			}
		num=sum;
			
		}
		System.out.println(num);

	}

}
