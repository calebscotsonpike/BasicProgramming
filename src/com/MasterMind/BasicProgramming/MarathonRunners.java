package com.MasterMind.BasicProgramming;

import java.util.*;
import java.io.*;
import java.math.*;

//Program to find the lowest time in a list of times recorded for marathon runners.

public class MarathonRunners {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		ArrayList<String> times = new ArrayList<String>();
		for (int i = 0; i < n; i ++) {
			String time = in.nextLine();
			times.add(time);
			//System.out.println("Time " + i + " is " + time);
		}
		Collections.sort(times);
		System.out.println(times.get(0));
		
		//System.out.println(times);
		//for (int j = 0; j < n; j ++) {
			//String t = times.get(j);
			//System.out.println(t);			
		//}
	}
}
