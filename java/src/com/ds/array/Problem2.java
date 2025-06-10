/**
 * 
 */
package com.ds.array;

/**
 * Given an array nums, answer queries about the sum of elements within a specific range [i, j].

Example:

    Input: nums = [1, 2, 3, 4, 5, 6], i = 1, j = 3

    Output: 9
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5, 6};
		// TODO Auto-generated method stub
		System.out.println(Problem2.sum(nums, 1, 3));
	}
	
	public static int sum(int[] nums, int startIndex , int endIndex) {
		
		int[] sumArray = Problem2.computeSumArray(nums);
		if(startIndex == 0)
			return sumArray[endIndex];
		return sumArray[endIndex] - sumArray[startIndex-1];
	}
	
	public static int[] computeSumArray(int[] nums) {
		// Store the sum
		int temp = 0;
		// Store the sum Array
		int[] sumArray = new int[nums.length];
		
		for( int i = 0 ; i < nums.length; i++) {
			sumArray[i] = temp + nums[i];
			temp = nums[i]+ temp;
		}
		Problem2.print(sumArray);
		return sumArray;
	}
	public static void print(int[] arr) {
		for(int number: arr) {
			System.out.print(number);
			System.out.print(" ");
		}
		System.out.println();
	}
}
