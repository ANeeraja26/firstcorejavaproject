package com.oops.methodoverloading;

// byte short int long float double 
// write a program to find areas of rectangle square circle & triangle
public class TestMOLDemo2 {

	  void main(String[] args) {
		System.out.println("main method started");
		
		
		System.out.println("Rectangle area:"+findArea(100.5,50.9));
		System.out.println("circle:"+findArea(10));
		System.out.println("triangle:"+findArea(100,5));
		System.out.println("square:"+findArea(10.5));
		
		
		
	}
	
	// areas of rectangle
	double findArea(double length,double breadth) {
		return length*breadth;
		
	}
	
	// area of square
	double findArea(double side) {
		return side*side;
		
	}
	// area of circle
	double findArea(float r) {
		return Math.PI*r*r;
		
	}
// area of triangle : 0.5 * base*height
	double findArea(double base,float height) {
		return 0.5*base*height;
		
	}
	
}
