package lern;
import java.util.*;
public class fight {

    static Scanner sc = new Scanner(System.in);
	private static int a;
	private static int b;
	private static boolean task = true;
	private static int random= (int) (Math.random()*10) + 1;
	public static void main(String[] args) {

		System.out.println("Geben Sie ihren Alter an ");
	do {
		int a = sc.nextInt();

		if(a<18) {
			System.out.println("Ihre Zahl ist " + random);
			task = false;
		}
		else if(a>=18) {
			
			System.out.println("ihre Zahl ist " + random);
			task = false;
		}
	}while(task);
	
	System.out.println("was geht");
	
		
	}

}
