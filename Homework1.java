package com.gmail.shovk.vlad;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner number = new Scanner (System.in);
		int a;
		System.out.println("¬ведите п€тизначное число и нажмите Enter");
		a = number.nextInt();
		int numOne = a/10000;
		System.out.println(numOne);
		int numTwo = a % 10000/1000;
		System.out.println(numTwo);
		int numThree = a % 1000/100;
		System.out.println(numThree);
		int numFour = a %100/10;
		System.out.println(numFour);
		int numFive = a % 10/1;
		System.out.println(numFive);
		number.close();
	}

}
