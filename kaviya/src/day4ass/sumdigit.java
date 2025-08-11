package day4ass;
import java.util.Scanner;
public class sumdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
		}

}
