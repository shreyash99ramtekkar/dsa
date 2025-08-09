# Move All Zeroes to End
# Difficulty: EasyAccuracy: 45.51%Submissions: 365K+Points: 2Average Time: 15m
# You are given an array arr[] of non-negative integers. You have to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

# Examples:

# Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
# Output: [1, 2, 4, 3, 5, 0, 0, 0]
# Explanation: There are three 0s that are moved to the end.
# Input: arr[] = [10, 20, 30]
# Output: [10, 20, 30]
# Explanation: No change in array as there are no 0s.
# Input: arr[] = [0, 0]
# Output: [0, 0]
# Explanation: No change in array as there are all 0s.
# Constraints:
# 1 ≤ arr.size() ≤ 105
# 0 ≤ arr[i] ≤ 105
def pushZerosToEnd(arr):
    swapped = False
    i = 0
    j = i+1
    # code here
    if len(arr)<=1:
        return arr
    
    while(True):
        if j == len(arr):
            if swapped == False:
                break
            swapped = False
            i = 0
            j = i+1
        if arr[i] == 0 and arr[j] != 0:
            arr[i] = arr[j]
            arr[j] = 0
            swapped= True
        i+=1
        j+=1
    return arr


print(pushZerosToEnd([3, 5, 0, 0, 4]))
