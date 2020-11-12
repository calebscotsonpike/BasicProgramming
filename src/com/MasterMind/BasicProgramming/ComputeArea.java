package com.MasterMind.BasicProgramming;

import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double radius;
		double area;
		
		System.out.println("Please enter value for radius: ");		
		// radius = 12;
		radius = input.nextDouble();
		
		area = radius * radius * Math.PI;
		System.out.println("The area for a circle of radius " + radius + " is " + area);
		
		/**
		 * ALGORITHM:
		 * 1. Read in the radius
		 * 2. Compute area using formula: area = radius * radius * pi
		 * 3. Display the area
		 */

	}

}
