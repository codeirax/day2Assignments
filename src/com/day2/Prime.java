package com.day2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter Your Number :");
        int x = input.nextInt();
        input.close();
        
    	for(int i = 2; i<=x; i++) {
    		while(x % i == 0) {
    			System.out.print( i + " ");
    			x /= i;
    		}
    	}
    	
    	
    }

}
