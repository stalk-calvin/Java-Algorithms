## Range

Should be able to store and fetch variety of ranges, search by binary search.

## AddDigit

Given a non-negative integer `num`, repeatedly add all its digits until the result has only one digit.

For example:

Given `num = 38`, the process is like: `3 + 8 = 11`, `1 + 1 = 2`. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

## BaseConverter

1. Convert Decimal Number to any base number in String
2. Convert any integer into a Decimal Number.

## BullsAndCows

For example:

```
Secret number:  "1807"
Friend's guess: "7810"
```

Hint: `1` bull and `3` cows. (The bull is `8`, the cows are `0`, `1` and `7`.)
Write a function to return a hint according to the secret number and friend's guess, use A to indicate the bulls and B to indicate the cows. In the above example, your function should return `"1A3B"`.

Please note that both secret number and friend's guess may contain duplicate digits, for example:

```
Secret number:  "1123"
Friend's guess: "0111"
```

In this case, the 1st `1` in friend's guess is a bull, the 2nd or 3rd `1` is a cow, and your function should return `"1A1B"`.

## CircularPrime

The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below `n=100`: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below given `n`?

## ClosestToZero

Write a program that prints the temperature closest to 0 among input data. If two numbers are equally close to zero, positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).

Example:

`[1 -2 -8 4 5]` should give `1`

## ContainsNearbyDuplicate

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.

## CountPrimes

Count the number of prime numbers less than a non-negative number, ***n***.

## Decimal

Different ways of calculating decimals

## ExcelSheetColumnNumber

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    
## FactorialTrailingZeros

Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

## HappyNumber

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

1<sup>2</sup> + 9<sup>2</sup> = 82  
8<sup>2</sup> + 2<sup>2</sup> = 68  
6<sup>2</sup> + 8<sup>2</sup> = 100  
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1

## IntegerAddSubtract

Calculate the sum/subtraction of two integers a and b, but you are not allowed to use the operator + and -.

## Largest Number

Given a list of non negative integers, arrange them such that they form the largest number.

For example, given `[3, 30, 34, 5, 9]`, the largest formed number is `9534330`.

Note: The result may be very large, so you need to return a string instead of an integer.

## MostFrequent

Find the most frequent integer in an array

## MultiplicationWithoutMultiply

Given two integers passed as parameter, can you write a method to multiply it and return the result without use "*" operator?

## MultiplyArrayElements

Given an array of elements, write a method to multiply every value for the rest of elements and return a new array with this values. Can you resolve this problem without use "/" operator?

## NumWaysToDecodeMessageTest

Given a => '1', b => '2' ... z => '26', decode number of ways a String of input can be converted to represent as letters.

For example,
```
input: 12345
output: 3

There are 3 possibilities:
- abcde
- lcde
- axde
```

## Palindrome

Determine whether an integer is a palindrome. Do this without extra space.

## PascalsTriangle

Given *numRows*, generate the first *numRows* of Pascal's triangle.

For example, given *numRows* = 5,
Return

```
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

## PascalsTriangle2

Given an index *k*, return the *k*<sup>th</sup> row of the Pascal's triangle.

For example, given k = 3,  
Return `[1,3,3,1]`.

## PowerOf2

Given an integer, write a function to determine if it is a power of two.

## PowerOf3

Given an integer, write a function to determine if it is a power of three.

## PowerOf4

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:  
Given num = 16, return true. Given num = 5, return false.

## PowerOfN

Implement `pow(x, n)`.

## RandomizedSet - Insert Delete GetRandom O(1)

Design a data structure that supports all following operations in average O(1) time.

1. `insert(val)`: Inserts an item val to the set if not already present.  
2. `remove(val)`: Removes an item val from the set if present.  
3. `getRandom`: Returns a random element from current set of elements. Each element must have the same probability of being returned.  

Example:

```
// Init an empty set.
RandomizedSet randomSet = new RandomizedSet();

// Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomSet.insert(1);

// Returns false as 2 does not exist in the set.
randomSet.remove(2);

// Inserts 2 to the set, returns true. Set now contains [1,2].
randomSet.insert(2);

// getRandom should return either 1 or 2 randomly.
randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
randomSet.remove(1);

// 2 was already in the set, so return false.
randomSet.insert(2);

// Since 1 is the only number in the set, getRandom always return 1.
randomSet.getRandom();
```

## RangeQueryImmutable

Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

**Example**:

```
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
```

## ReverseInteger

Reverse digits of an integer.

```
Example1: x = 123, return 321
Example2: x = -123, return -321
```

## RomanToInt

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

## SellStock

Say you have an array for which the *i*<sup>th</sup> element is the price of a given stock on day *i*.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

**Example 1**:

```
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
```

**Example 2**:

```
Input: [7, 6, 4, 3, 1]
Output: 0
```

In this case, no transaction is done, i.e. max profit = 0.

## SmallestNFromList

Given an input array with *N*, Find smallest *N* numbers and return it in a list.

## SmallestProductN

Find the smallest number which digit numbers product is equal to a given N

## SubsetsWithDuplicates

Given a collection of integers that might contain duplicates, ***nums***, return all possible subsets.

**Note**: The solution set must not contain duplicate subsets.

For example,
If ***nums*** = `[1,2,2]`, a solution is:

```
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
```

## SumOfFibonacci

Return the sum of all Fibonacci numbers up to and including the passed number if it is a Fibonacci number.
 
The first few numbers of the Fibonacci sequence are 1, 1, 2, 3, 5 and 8, and each subsequent number is the sum of the previous two numbers.
 
As an example, passing 4 to the function should return 7 because all Fibonacci numbers under 4 are 1, 1, 2 and 3.

Bonus: Calculate sum of odd fibonacci, example: passing 4 => 5 as fibonacci numbers under 4 are 1, 1 and 3.

## ThirdMax

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

**Example 1**:

```text
Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.
```

**Example 2**:

```text
Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
```

**Example 3**:

```text
Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
```

## ThreeSum

Given an array S of *n* integers, are there elements *a*, *b*, *c* in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

**Note**: The solution set must not contain duplicate triplets.

```
For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```

**Example**:

```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## UglyNumber

Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include `2, 3, 5`. For example, `6, 8` are ugly while `14` is not ugly since it includes another prime factor `7`.

Note that `1` is typically treated as an ugly number.

## ValidSudoku

Determine if a Sudoku is valid, according to: [Sudoku Puzzles - The Rules](http://sudoku.com.au/TheRules.aspx).

The Sudoku board could be partially filled, where empty cells are filled with the character `'.'`.
