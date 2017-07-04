## AnagramCounter

Checks how far apart 2 given strings are from being anagram

## AnagramValidity

Checks given 2 strings are anagram or not.

## AnagramGrouper

Given an array of strings, group anagrams together.

## ArrayPartition1

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

**Example 1:**

```text
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4.
```

**Note:**
1. n is a positive integer, which is in the range of [1, 10000].
2. All the integers in the array will be in the range of [-10000, 10000].

## CheckIfArrayElementsAreConsecutive

Checks if all the numbers in the array are consecutive.

## ContainsDuplicate

containsDuplicateFirst: Checks if input int array has any duplicate item.
containsDuplicateSecond: Variated method for solving duplicate
containsNearbyDuplicate: Given an array of integers and an integer *k*, find out whether there are two distinct indices *i* and *j* in the array such that **nums[i]** = **nums[j]** and the **absolute** difference between *i* and *j* is at most *k*.
containsNearbyAlmostDuplicate: Given an array of integers, find out whether there are two distinct indices *i* and *j* in the array such that the **absolute** difference between **nums[i]** and **nums[j]** is at most *t* and the **absolute** difference between *i* and *j* is at most *k*.

## DuplicateWithinkIndices

Checks if input int array has any duplicate item within a set of window.

## FindDuplicates

Given an array *nums* containing *n* + 1 integers where each integer is between 1 and *n* (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

**Note**:

1. You **must not** modify the array (assume the array is read only).
2. You must use only constant, O(1) extra space.
3. Your runtime complexity should be less than O(n<sup>2</sup>).
4. There is only one duplicate number in the array, but it could be repeated more than once.

## GasStation

There are *N* gas stations along a circular route, where the amount of gas at station *i* is `gas[i]`.

You have a car with an unlimited gas tank and it costs `cost[i]` of gas to travel from station i to its next station (*i*+1). You begin the journey with an empty tank at one of the gas stations.

Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

## Intersection

Given 2 int arrays, returns 1 array that contains all items intersected.

## Intersection2

Given 2 int arrays, returns 1 array that contains all items intersected. Items can appear more than once.

## KDiffPairs

Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

**Example 1**:

```text
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
```

**Example 2**:

```text
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
```

**Example 3**:

```text
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
```

**Note**:

1. The pairs (i, j) and (j, i) count as the same pair.
2. The length of the array won't exceed 10,000.
3. All the integers in the given input belong to the range: [-1e7, 1e7].


## LongestConsecutive

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

## MajorityElement

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

## MajorityElement 2

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

## MaximumProductSubarray

Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array `[2,3,-2,4]`, the contiguous subarray `[2,3]` has the largest product = 6.

## MaximumSubarray

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array `[−2,1,−3,4,−1,2,1,−5,4]`, the contiguous subarray `[4,−1,2,1]` has the largest sum = 6.

## MergeSortedArray

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

## MoveZeros

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

## RemoveDuplicateSortedArray

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

## RemoveElement

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

## ReshapeMatrix

In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

**Example**

```
Input: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
Output: 
[[1,2,3,4]]
Explanation:
The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
```

## Rotate

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

## SlidingWindowMaximum

Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
