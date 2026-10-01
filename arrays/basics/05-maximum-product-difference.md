# Maximum Product Difference Between Two Pairs

**Source:** LeetCode 1913
**Pattern:** Sorting
**Difficulty:** Easy

## Approach
Sort the array. Since all values are positive, the two smallest sorted 
elements give the minimum product, and the two largest give the maximum 
product. Answer is max product minus min product.

## Complexity
- Time: O(n log n) — from Arrays.sort()
- Space: O(1) — sorting is in-place, only two fixed variables used

## What I learned
Approach only works because values are guaranteed positive — with 
negatives allowed, two large-magnitude negative numbers could produce 
a bigger product than the two largest positives, so this logic would 
break. Also mixed up O(log n) vs O(n log n) initially, and briefly 
miscalled space complexity O(n) instead of O(1) — sorting in-place 
doesn't add space proportional to input size.
