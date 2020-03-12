package com.sonata;

import java.util.Scanner;

public class Myarray {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arary");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element of arary");
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of element "+ sum);
		
}
}