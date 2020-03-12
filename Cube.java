package com.sonata;
import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		int num,cube;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		  num = sc.nextInt();
		 cube = num*num*num;
		 System.out.println("the cube of number "+num+" is "+cube);

	}

}
