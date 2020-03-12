package com.sonata;

import java.util.Scanner;

public class MyArrayRev {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arary");
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("original array");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int k=n-1;
		System.out.println("Reverse array");
		for(int i=k ;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		
}
}
