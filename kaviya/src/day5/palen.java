package day5;

import java.util.Scanner;
public class palen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int temp1=n;
		while(n>0)
		{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		if(temp1==rev)
		{
		System.out.println("palindrome");	
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
