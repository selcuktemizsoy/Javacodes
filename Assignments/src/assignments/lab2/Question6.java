package assignments.lab2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		final double STATE_TAX =0.04;
		final double CITY_TAX = 0.02;
		Scanner sc = new Scanner(System.in);
		System.out.println("How much purchase ");
		int purchase = sc.nextInt();
		double stateTax = purchase * STATE_TAX;
		double cityTax = purchase * CITY_TAX;
		double totalTax = stateTax + cityTax;
		double totalPurchase = purchase + totalTax;
		
		System.out.println("purchase " + purchase + " state tax " + stateTax + " city tax " + cityTax + " total tax " + totalTax + " total "
				+ "purchase " + totalPurchase);
		

	}

}
