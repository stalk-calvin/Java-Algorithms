# Combinations of a String

## Problem

Implement a function that prints all possible combinations of the characters in a string.
These combinations range in length from one to the length of the string. Two combinations that differ only in ordering of their characters are the same combination.
In other words. "12" and "31" are different combinations from the input string "123", but "21" is the same as "12".

## Analysis

Take "abcd" for example,

    a,  combine(bcd)
    b,  combine(cd)
    c,  combine(d)

