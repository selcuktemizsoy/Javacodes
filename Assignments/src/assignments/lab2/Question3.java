package assignments.lab2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive number: ");
		
		System.out.println(sum(sc.nextInt()));
	
	}
	
	public static int sum (int count) {
		int temp = 0;
		for(int i = 1; i <= count; i++) {
			temp += i;
		}
		return temp;
	}

}
