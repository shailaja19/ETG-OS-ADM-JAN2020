/*4) Write a java program to sum values of an array.
 *  For example a[5] ={1,2,3,4,5,6} the sum of the values is 21.
 *  */

package com.sonata.assignment;

public class SumOfArray {
	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
      System.out.println(sum);
	}

}
