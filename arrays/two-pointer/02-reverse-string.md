# Reverse String

**Source:** LeetCode 344
**Pattern:** Two Pointer (opposite ends)
**Difficulty:** Easy

## Approach
Two pointers start at opposite ends of the array (left=0, right=n-1). 
Swap the elements at left and right, then move left forward and right 
backward. Stop when left >= right — no need to swap the middle element 
(if any) with itself, since a single middle element is always its own 
mirror in a reversal.

## Complexity
- Time: O(n)
- Space: O(1) — in-place, no StringBuilder or extra array needed

## What I learned
Method signature (void, char[] param) was the clue that this needed 
in-place char[] swapping, not StringBuilder — StringBuilder is for 
building a *new* string, not modifying a given array in place. Also 
clarified: left < right (not <=) stops exactly before the pointless 
self-swap at the middle element.
