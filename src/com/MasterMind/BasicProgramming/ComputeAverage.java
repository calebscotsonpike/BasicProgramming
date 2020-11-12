package com.MasterMind.BasicProgramming;

import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three variables: ");
		
		double firstVariable = input.nextDouble();
		double secondVariable = input.nextDouble();
		double thirdVariable = input.nextDouble();
		
		double average = (firstVariable + secondVariable + thirdVariable) / 3;
		
		System.out.println("The average of: " + firstVariable + ", " + secondVariable + " and " + thirdVariable + " is " + average + ".");

	}

}
