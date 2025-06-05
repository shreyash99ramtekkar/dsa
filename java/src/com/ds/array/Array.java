/**
 * 
 */
package com.ds.array;

/**
 * 
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
