# Shuffle the Array

**Source:** LeetCode 1470
**Pattern:** Array Index Manipulation
**Difficulty:** Easy

## Approach
Array is split into two halves of size n. For each index i in the first 
half, place nums[i] at ans[2*i] and its paired element nums[i+n] at 
ans[2*i+1] — interleaving both halves directly by index offset.

## Complexity
- Time: O(n)
- Space: O(n) (for the output array)

## What I learned
Got stuck on index math initially — tried averaging indices instead of 
offsetting by n. Correct approach was offset-by-n, not averaging. 
Second index of each half is always i + n, not the midpoint.
