package com.MasterMind.BasicProgramming;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * 
 * A 'lucky' number has the numbers 6 or 8 in its digits. However, if it has both 6 and 8 it is not lucky.
 * This program computes the amount of lucky numbers there are between l and h inclusive.
 **/
public class LuckyNumbers {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        long h = in.nextLong();
        
        long counter = 0;
        
        //System.out.println(l);
        //System.out.println(h);
        
        for (long i = l; i < h + 1; i ++) {
        	boolean luck = lucky(i);
        	if (luck) {
        		counter ++;
        	}
        	System.out.println(i + " is " + luck + "; Counter: " + counter);
        }
    }
    
    public static boolean lucky(long num) {
    	long digit;
    	boolean isSix = false;
    	boolean isEight = false;
    	while (num > 0) {
    		digit = num % 10;
    		if (digit == 6) {
    			isSix = true;
    		}
    		else if (digit == 8) {
    			isEight = true;
    		}
    		num = num / 10;
    	}
    	if (isSix ^ isEight) {
    		return true;
    	}
    	return false;
    }
}