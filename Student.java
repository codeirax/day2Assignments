package com.basicOOPS;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void StudentDetails() {
		System.out.println("Roll is :"+ roll);
		System.out.println("Name is :" + name);
		System.out.println("Marks is :" + marks);	
	}
	
	public static void main(String[] args) {
//		first object creation
		Student firstStudent = new Student();
		Student secondStudent = new Student();
		
	
		firstStudent.roll = 1;
		firstStudent.name = "Shivaay";
		firstStudent.marks = 55;
		firstStudent.StudentDetails();
		
		firstStudent = null;
		System.out.println(firstStudent);
		
		secondStudent.roll = 1;
		secondStudent.name = "Ram Lakhan";
		secondStudent.marks = 95;
		secondStudent.StudentDetails();
		secondStudent = null;
		System.out.println(secondStudent);
		
	}
	
	
	

}
