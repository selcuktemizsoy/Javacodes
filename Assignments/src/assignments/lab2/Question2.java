package assignments.lab2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oneBag = 40;
		int servePerBag = 10;
		int caloriPerServe = 300;
		int cookiePerServe = oneBag / servePerBag;
		double caloriPerCookie = caloriPerServe / cookiePerServe;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many cookie do you eat ?");
		
		System.out.println("You take " + sc.nextInt() * caloriPerCookie + " calories");
		
	}

}
