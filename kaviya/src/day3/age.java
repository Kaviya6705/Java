package day3;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=18)
		{
			System.out.println("not eligible for vote");
		}
		if(num>=18)
		{
		System.out.println("eligible for vote");	
		}
		else if(num==0)
		{
			System.out.println("no age");
		}
		sc.close();
	}

}
