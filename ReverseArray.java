package com.sonata;
import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {
		
		int i,n,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		n=sc.nextInt();
		int a[] = new int[n];
		int ar[] = new int[n];
		System.out.println("Enter array elements of size"+n);
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
				
		}
		//displaying array elements
		System.out.println("array elements are ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("reverse order");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
				
		}
		
	}

}
