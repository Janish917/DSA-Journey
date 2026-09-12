# Concatenation of Array

**Source:** LeetCode 1929
**Pattern:** Array Basics
**Difficulty:** Easy

## Approach
Create an array of size 2n. For each index i, place nums[i] at both 
ans[i] and ans[i+n] — filling both halves in a single pass.

## Complexity
- Time: O(n)
- Space: O(n) (output array is required to be size 2n)

## What I learned
Already optimal — output size forces O(n) minimum. Known alternative: 
System.arraycopy() for bulk copying instead of a manual loop, but no 
Big-O difference, just a minor constant-factor speedup.
