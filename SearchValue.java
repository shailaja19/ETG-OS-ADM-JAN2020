package com.sonata;
import java.util.Scanner;
public class SearchValue {

	public static void main(String[] args) {
		int ar[] = {10,20,30,40,50};
		int i,num,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		num=sc.nextInt();
		for(i=0;i<ar.length;i++)
		{
			if(num==ar[i])
			{
				flag=1;
			}
				
		}
		if(flag==1)
		System.out.println("Element is found");
		else
			System.out.println("Element not found ");
	}

}
