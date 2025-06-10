/**
 * 
 */
package com.ds.array;



/**
 * 


Exercise on List using Array - Level 1

Problem Statement
A teacher has given a project assignment to a class of 10 students.

She wants to store the marks (out of 100 ) scored by each student. The marks scored are as mentioned below:
89,78,99,76,77,67,99,98,90

Write a Java program to store the marks in a list and perform the following:

1. The teacher forgot to include the marks of one student. Insert 78 at index position, 8 and display the marks of all 10 students.

2. The teacher also wants to know the marks scored by students represented by index positions, 5 and 7. Identify and display the two marks.
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] assignmentScore = new int[10];
		assignmentScore[0] = 89;
		assignmentScore[1] = 78;
		assignmentScore[2] = 99;
		assignmentScore[3] = 76;
		assignmentScore[4] = 77;
		assignmentScore[5] = 67;
		assignmentScore[6] = 99;
		assignmentScore[7] = 98;
		assignmentScore[8] = 90;
		Problem1.insert(assignmentScore, 8, 78);
		System.out.println(Problem1.fetch(assignmentScore, 8));
		System.out.println(Problem1.fetch(assignmentScore, 5));
		System.out.println(Problem1.fetch(assignmentScore, 7));
		
	}
	// Solution 1
	public static void insert(int[] arr, int pos, int val) {
		for(int i = arr.length-1; i>=pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = val;
	}
	
	//Solution 2
	public static int fetch(int[]arr, int pos) {
		return arr[pos-1];
	}

}
