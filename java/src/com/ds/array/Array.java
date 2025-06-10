/**
 * 
 */
package com.ds.array;

/**
 * Array is one of the most widely and frequently used data structure but, it has some limitations.

Some of the limitations are:

An array can contain data of only similar type. Heterogeneous elements cannot be stored in an array.

Array is of fixed size. Once declared, the size cannot be changed. Let us consider an example of a school which uses an array to store names of all the students in a class. Initially based on the number of students, an array is created and the information is stored. Suppose a student joins after few days, storing the information of this student now becomes very difficult.

You have seen the insertion and deletion operations in an array. Those operations are expensive in terms of memory as they require shifting of elements. This shifting may also sometime lead to loss of data if we try to exceed the capacity of the array. Let us take the example of a car having 5 seats. 5 people are seated and another person comes and wants to sit at the second seat. In order to accommodate this person, the person sitting at the second seat shifts to the third seat and so on. At the end, the person who was sitting at the last has no place to sit.

The elements of an array are stored in continuous memory locations. If the required number of blocks are not present together in the memory, then the array will not be created. 
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = new char[6];
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		
		Array.insert(arr, 3, 'J');
		Array.delete(arr, 3);
		for(char c : arr) {
			System.out.println(c);
		}
	}
	
	
	public static void insert(char[] arr, int pos, char val) {
		for(int i = arr.length - 1; i >= pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = val;
		
	}
	
	public static void delete(char[] arr,int pos) {
		for(int i = pos; i <= arr.length-1; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = '0';
	}

}
