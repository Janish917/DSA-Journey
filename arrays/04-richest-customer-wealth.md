# Richest Customer Wealth

**Source:** LeetCode 1672
**Pattern:** 2D Array Traversal
**Difficulty:** Easy

## Approach
For each customer (row), sum all their bank account values using a nested 
loop. Compare the row's total against a running max after the row is 
fully summed, not during — the comparison happens once per customer, 
after the inner loop completes.

## Complexity
- Time: O(n*m) — must visit every account at least once
- Space: O(1)

## What I learned
Initially misjudged the constraint — thought n<=50 meant nested loops 
were too slow. Realized 2D grid traversal (n*m total cells) is still 
linear in total elements, not quadratic in the "bad" sense. Also fixed 
a habit bug: check max after the inner loop finishes summing a full row, 
not inside it — only worked before because values were non-negative.
