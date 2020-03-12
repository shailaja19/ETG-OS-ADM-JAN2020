package com.sonata;

public class ArraySum {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		int i,sum=0;
		for(i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("the sum of the array is "+sum);
	}

}
