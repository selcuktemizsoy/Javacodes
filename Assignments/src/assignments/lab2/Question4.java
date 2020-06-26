package assignments.lab2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int female;
		int male;
		System.out.println("Enter female numbers: ");
		female = sc.nextInt();
		System.out.println("Enter male numbers: ");		
		male =sc.nextInt();
		percantageWritten(female, male);
		
		
	}
	
	public static void percantageWritten(int female, int male) {
		double femalePercantage = 100 * female / (female + male);
		System.out.println("Female percantage " + femalePercantage + " male percantage " + (100 - femalePercantage));
		
		
	}

}
