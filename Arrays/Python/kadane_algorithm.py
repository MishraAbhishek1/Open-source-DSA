# ✅ Problem: Kadane's Algorithm
# 🔗 Link: https://leetcode.com/problems/maximum-subarray/
# 🧠 Approach: Dynamic Programming (Kadane’s Algo)

def max_subarray(arr):
    max_sum = current_sum = arr[0]
    for num in arr[1:]:
        current_sum = max(num, current_sum + num)
        max_sum = max(max_sum, current_sum)
    return max_sum

# 🧪 Example
# Input: [-2,1,-3,4,-1,2,1,-5,4]
# Output: 6