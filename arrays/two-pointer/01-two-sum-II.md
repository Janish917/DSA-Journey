# 167. Two Sum II - Input Array Is Sorted

**Pattern:** Two Pointers (opposite ends)
**Difficulty:** Medium
**Link:** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

## Problem
Given a 1-indexed sorted array, find two numbers that add up to the target and return their indices (1-indexed).

## Brute Force
Pick each element and pair it with every element after it, checking the sum.
Total pairs = n(n-1)/2, so time is O(n²).

## Signal (how to recognize this pattern)
- The array is **sorted**
- I'm asked to **find a pair** that sums to a target

## Approach
Put `left` at the start and `right` at the end, then check `sum = nums[left] + nums[right]`:
- `sum < target`: move `left++`
- `sum > target`: move `right--`
- `sum == target`: found the pair, return the indices

## Why it's safe
Each move throws away an element that can't be in the answer.
- If `sum < target`, the smallest element is paired with the biggest possible partner and is still too small. Any other partner makes it even smaller, so drop it.
- If `sum > target`, the largest element is paired with the smallest possible partner and is still too big, so drop it.

Comparing the best case works with negative numbers too. Checking `nums[i] > target` alone does not.

## Complexity
- Time: O(n)
- Space: O(1)

## Code
See `01-two-sum-ii.java`

## Mistakes / things I learned
- Wrote the pointer moves in the wrong direction at first and got a Time Limit Exceeded
- Forgot `break` after finding the pair, which caused an infinite loop# 167. Two Sum II - Input Array Is Sorted

**Pattern:** Two Pointers (opposite ends)
**Difficulty:** Medium
**Link:** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

## Problem
Given a 1-indexed sorted array, find two numbers that add up to the target and return their indices (1-indexed).

## Brute Force
Pick each element and pair it with every element after it, checking the sum.
Total pairs = n(n-1)/2, so time is O(n²).

## Signal (how to recognize this pattern)
- The array is **sorted**
- I'm asked to **find a pair** that sums to a target

## Approach
Put `left` at the start and `right` at the end, then check `sum = nums[left] + nums[right]`:
- `sum < target`: move `left++`
- `sum > target`: move `right--`
- `sum == target`: found the pair, return the indices

## Why it's safe
Each move throws away an element that can't be in the answer.
- If `sum < target`, the smallest element is paired with the biggest possible partner and is still too small. Any other partner makes it even smaller, so drop it.
- If `sum > target`, the largest element is paired with the smallest possible partner and is still too big, so drop it.

Comparing the best case works with negative numbers too. Checking `nums[i] > target` alone does not.

## Complexity
- Time: O(n)
- Space: O(1)

## Code
See `01-two-sum-ii.java`

## Mistakes / things I learned
- Wrote the pointer moves in the wrong direction at first and got a Time Limit Exceeded
- Forgot `break` after finding the pair, which caused an infinite loop# 167. Two Sum II - Input Array Is Sorted

**Pattern:** Two Pointers (opposite ends)
**Difficulty:** Medium
**Link:** https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

## Problem
Given a 1-indexed sorted array, find two numbers that add up to the target and return their indices (1-indexed).

## Brute Force
Pick each element and pair it with every element after it, checking the sum.
Total pairs = n(n-1)/2, so time is O(n²).

## Signal (how to recognize this pattern)
- The array is **sorted**
- I'm asked to **find a pair** that sums to a target

## Approach
Put `left` at the start and `right` at the end, then check `sum = nums[left] + nums[right]`:
- `sum < target`: move `left++`
- `sum > target`: move `right--`
- `sum == target`: found the pair, return the indices

## Why it's safe
Each move throws away an element that can't be in the answer.
- If `sum < target`, the smallest element is paired with the biggest possible partner and is still too small. Any other partner makes it even smaller, so drop it.
- If `sum > target`, the largest element is paired with the smallest possible partner and is still too big, so drop it.

Comparing the best case works with negative numbers too. Checking `nums[i] > target` alone does not.

## Complexity
- Time: O(n)
- Space: O(1)

## Code
See `01-two-sum-ii.java`

## Mistakes / things I learned
- Wrote the pointer moves in the wrong direction at first and got a Time Limit Exceeded
- Forgot `break` after finding the pair, which caused an infinite loop
