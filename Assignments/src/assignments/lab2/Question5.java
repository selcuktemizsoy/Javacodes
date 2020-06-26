package assignments.lab2;

import java.util.Scanner;

public class Question5 {
	
	//we can define our variable here and use all the methods but now defining inside of the main.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAX = 0.0675;
		final double TIPS = 0.2;
		Scanner sc = new Scanner(System.in);
		System.out.println("What about your meal charge: ");
		double charge = sc.nextDouble();
		double tax = calculateTax(charge, TAX);
		double totalBill = charge + tax;
		double tips = calculateTips(totalBill, TIPS);
		totalBill += tips;
		
		System.out.println("Meal " + charge + " tax " + tax + " tips " + tips + " total " + totalBill);
	
	}
	
	
	
	public static double calculateTax(double charge, double tax) {
		
		return charge * tax;
	}
	
	public static double calculateTips(double charge, double tips) {
		return charge * tips;
	}

}
