//Difference Between Static and non-Static Variable in Java.
//
//The variable of any class are classified into two types -
//
//Static or class variable
//
//Non-static or instance variable
//
//1. Static variable in Java
//Memory for static variable is created only one in the program at the time of loading of class. These variables are preceded by static keyword. tatic variable can access with class reference.
//
//2. Non-static variable in Java
//Memory for non-static variable is created at the time of create an object of class. These variable should not be preceded by any static keyword Example: These variables can access with object reference.
package com.basicOOPS;


public class StaticAndNonStatic{
	
	static int roll_no = 21;  // declaring static variable 
	
	String name = "Shubham";   // Declaring non-static variable
	
  public static void main(String[] args) {
	System.out.println(StaticAndNonStatic.roll_no);
	
//	for Accessing non-static variable first we need to create an object
	
	StaticAndNonStatic nonStaticName = new StaticAndNonStatic(); 
//	nonStaticName.name = "Rahul";
	System.out.println(nonStaticName.name); // Printing non-static variable
}

}