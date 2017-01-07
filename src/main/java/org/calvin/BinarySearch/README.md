## BinarySearch

Just a plain binary search against int array. I see the middle key generation can cause overflow.

It is better to write:
```
int mid = first + (last-first)/2;
```

## FindMinimumNumber

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., `0 1 2 4 5 6 7` might become `4 5 6 7 0 1 2`).

Find the minimum element.

The array may contain duplicates (findMinWithDuplicated function)

## FirstBadVersion

Search first bad integer (chosen randomly) using binary search from given 0 to n.

## Search For A Range

Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log *n*).

If the target is not found in the array, return `[-1, -1]`.

For example,
Given `[5, 7, 7, 8, 8, 10]` and target value 8,
return `[3, 4]`.