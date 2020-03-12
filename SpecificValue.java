/*5) Write a java program to test if an array contains a specific value
 * 
 */

package com.sonata.assignment;

public class SpecificValue {
	
	public static boolean check(int[] a,int i)
	{
		for(int n:a) {
			if(i==n) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int a[]=new int[]{10,20,30,44,55};
		System.out.println(check( a,44));//true
		System.out.println(check( a,7));//false
	}

}




