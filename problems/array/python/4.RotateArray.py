import math
# Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

# Note: Consider the array as circular.

# Examples :

# Input: arr[] = [1, 2, 3, 4, 5], d = 2
# Output: [3, 4, 5, 1, 2]
# Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
# Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
# Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
# Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
# Input: arr[] = [7, 3, 9, 1], d = 9
# Output: [3, 9, 1, 7]
# Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
# Constraints:
# 1 <= arr.size(), d <= 105
# 0 <= arr[i] <= 105

def rotateArr(arr,d):
    """Rotate the elements of array in anticlockwise by d steps

    Args:
        arr (_type_): Array to be rotated
        d (_type_): Steps
    E.g.:
        Input: arr[] = [1, 2, 3, 4, 5], d = 2
        Output: [3, 4, 5, 1, 2]
        Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
        Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
        Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
        Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
        Input: arr[] = [7, 3, 9, 1], d = 9
        Output: [3, 9, 1, 7]
    Constraints:
        1 <= arr.size(), d <= 105
        0 <= arr[i] <= 105
    """
    #Juggling algorithm
    # length of array
    n = len(arr) 
    
    # steps 
    d %= n 
    
    # Greatest common divisor
    gcd = math.gcd(n,d)
    
    
    for i in range(gcd):
        curr_index = i
        temp = arr[i]
        while(True):
            next_index = (curr_index + d)%n
            
            if i == next_index:
                break
            arr[curr_index] = arr[next_index]
            curr_index = next_index
        arr[curr_index] = temp 
    return arr
    
    
    
# print(math.gcd(10,2))    
print(rotateArr([1,2,3,4,5],2))
