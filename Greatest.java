package com.sonata;

public class Greatest {
	public static void main(String[] args) {
		
		int ar[]  = {12,25,89};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if (max<ar[i])
			{
				max=ar[i];
			}
		}
		
	System.out.println(max);
	}

}
