package com.practiceproblem;
import java.util.Arrays;
// You are given an array of integers arr[]. You have to reverse the given array.

// Note: Modify the array in place.

// Examples:

// Input: arr = [1, 4, 3, 2, 6, 5]
// Output: [5, 6, 2, 3, 4, 1]
// Explanation: The elements of the array are [1, 4, 3, 2, 6, 5]. After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on. Hence, the answer is [5, 6, 2, 3, 4, 1].
// Input: arr = [4, 5, 2]
// Output: [2, 5, 4]
// Explanation: The elements of the array are [4, 5, 2]. The reversed array will be [2, 5, 4].
// Input: arr = [1]
// Output: [1]
// Explanation: The array has only single element, hence the reversed array is same as the original.
// Constraints:
// 1 ≤ arr.size() ≤ 105
// 0 ≤ arr[i] ≤ 105
public class ReverseArray3 {

    public static void main(String[] args) {
        int[] arr  = new int[] {1, 4, 3, 2, 6, 5};
        ReverseArray3 reverseArray = new ReverseArray3();
        System.out.println(Arrays.toString(reverseArray.reverseArray(arr,0,arr.length-1)));
        
    }
    /**
     * Return the reverse of the array
     * @param arr
     * @return arr
     */
    public int[] reverseArray(int[] arr,int start,int end){
        
        int i = start;
        int j = end;
        int temp = 0 ;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }
    
}
