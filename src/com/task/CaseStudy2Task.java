package com.task;

// 1 Rahul has 20rupees and visits a chocolate shop. each chocolate costs 2 Rupees .
//the shopkeeper announces a special offer that for every 3 empty chocolate wrappers returned, 
//Rahul will receive 1 free chocolate after eating a chocolate Rahul keep its wrappers and can continue 
//exchanging wrappers for free chocolate as long as he has enough wrappers .
//write a java program to calculate the total numbers of chocolates Rahul can eat , 
//including both purchased and free chocolates please given simple and easy program for different way
public class CaseStudy2Task {

	public static void main(String[] args) {
		
	
		        int chocolates = 10; // 20/2--->=10
		        int wrappers = 10;
		        int total = 10;

		        while (wrappers >= 3) {
		            int free = wrappers / 3;
		            total = total + free;
		            wrappers = free + (wrappers % 3);
		        }

		        System.out.println(total);
		    }
		}