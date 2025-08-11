package day3;

import java.util.Scanner;

public class mark {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=100)
		{
			System.out.println("A+");
		}
		else if(num<=89)
		{
			System.out.println("A");
		}
		else if(num<=79)
		{
			System.out.println("b");
		}
		else if(num<=69)
		{
			System.out.println("C");
		}
		else if(num<=59)
		{
			System.out.println("D");
		}
		else if(num<56)
		{
			System.out.println("Fail");
		}


	}

}
