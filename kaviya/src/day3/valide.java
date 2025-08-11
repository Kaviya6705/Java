package day3;

import java.util.Scanner;

public class valide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int weight =sc.nextInt();
		if(weight>=0 && weight<=100)
		{
			if(weight%2==0)
				
			{
			
				
			System.out.println("YES");
			System.out.println(weight/2+" "+weight/2);
			
		}
		else
		{
			System.out.println("NO");
		}
	}
		}
}
