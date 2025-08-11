package day3;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        if(a<33)
        {
            System.out.println("Inflate");
        }
        else if(a>33)
        {
            System.out.println("Deflate");
        }
        else
        {
            System.out.println( "Untouched");
        }
            
        
        
        
    }
}