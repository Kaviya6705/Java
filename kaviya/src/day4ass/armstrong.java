package day4ass;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int n1=0;
		int r=0;
		int sum=0;
		n1=n;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==n1)
		{
			System.out.println("this is a armstrong no");
		}
		else
		{
			System.out.println("this is not a armstrong no");
		}
		
	}
}
