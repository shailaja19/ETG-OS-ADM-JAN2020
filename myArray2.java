package com.sonata;

import java.util.Scanner;

public class myArray2 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of arary");
		int n=in.nextInt();
		int arr[]=new int[n];
		
		System.out.println("enter the element of arary");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("enter the specific value");
		int spc=in.nextInt();
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==spc)
			{
				
				c=1;
			}
			
				
		}
		if(c==1)
		{
			System.out.println("the Specific value contain");
		}
		else
			System.out.println("the Specific value does notcontain");
	
		
}
	
}


