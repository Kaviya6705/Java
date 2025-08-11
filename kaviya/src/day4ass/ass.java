package day4ass;
import java.util.Scanner;

public class ass {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int x = sc.nextInt();      
		        int y = sc.nextInt();      
		        double s = sc.nextDouble(); 
		        double r = sc.nextDouble(); 
		        double l = sc.nextDouble(); 
		        if (s > r && 2 * s < r) {
		            System.out.println("Invalid Input");
		            return;
		        }
		        double soloCost = x * s;
		        double roundCost = 0;
		        for (int i = 0; i < y; i++) {
		            if (2 * s <= r) {
		                roundCost += 2 * s;
		            } else {
		                roundCost += r;
		            }
		        }
		        double totalComboCost = soloCost + roundCost;
		        if (l <= totalComboCost) {
		            System.out.println("Monthly Pass");
		        } else {
		            System.out.println("Solo Trail + Roundabout Ride");
		        }
		    }
		}





    
