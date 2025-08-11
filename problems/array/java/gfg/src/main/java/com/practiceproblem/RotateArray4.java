package com.practiceproblem;

import java.util.Arrays;

public class RotateArray4 {

    public static void main(String[] args) {
        int d = 3;
        int[] arr = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        RotateArray4 rotateArray = new RotateArray4();
        
        System.out.println(Arrays.toString(rotateArray.rotateArray(arr, d)));
        
    }
     /**
     * Rotate the elements of array in anticlockwise by d steps
     * @param arr Array to be rotated
     * @param d Steps
     * @example
     * 
     *  Input: arr[] = [1, 2, 3, 4, 5], d = 2
        Output: [3, 4, 5, 1, 2]

        Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
        Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
        Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
        Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
        Input: arr[] = [7, 3, 9, 1], d = 9
        Output: [3, 9, 1, 7]
      Constraints;
        1 <= arr.size(), d <= 105
        0 <= arr[i] <= 105
     * @return arr Rotated array
     */
   
    public int[] rotateArray(int[] arr, int d){
      ReverseArray3 reverseArray = new ReverseArray3();
      d %= arr.length;
      reverseArray.reverseArray(arr,0,d-1);
      reverseArray.reverseArray(arr, d, arr.length-1);
      reverseArray.reverseArray(arr,0, arr.length-1);


      return arr;
    }

    // private int[] reverseArr
    
}
