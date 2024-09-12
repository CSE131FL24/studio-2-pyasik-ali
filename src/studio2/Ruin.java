package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting value?");
		double StartingValue=in.nextDouble();
		
		System.out.println("What is your win chance?");
		double WinChance=in.nextDouble();
		
		System.out.println("What is your win limit?");
		double WinLimit=in.nextDouble();
		
		System.out.println("How many times do you want to run the simulation?");
		int TotalSimulations=in.nextInt();
	
	for(int i=0;i <= TotalSimulations; i++) {
		double j = i + 1;
		double newValue = StartingValue +1 ;
		double newwValue = StartingValue - 1;
		while(StartingValue > 0 && StartingValue < WinLimit) {
			double result = Math.random();
			if (result <= WinChance ) {
				System.out.print("Simulation:"+ j + ":" + newValue);
			}
			else {
				System.out.print("simulation" + j + ":" + newwValue);
	}
	}
	}}
}