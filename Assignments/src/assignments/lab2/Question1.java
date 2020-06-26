package assignments.lab2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		int smallest;
		int biggest;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		biggest = smallest = sc.nextInt();
		do {
			System.out.println("next number");
			int temp = sc.nextInt();
			smallest = (temp < smallest) ? temp : smallest;
			biggest = (temp > biggest) ? temp : biggest;
			
			System.out.println("Do you wanna go 0-N 1-Y");
			if (sc.nextInt() == 0)
				break;
			
			
			
		}while (true);
		
		System.out.println("Biggest " + biggest + " smallest " + smallest);
	}

}
