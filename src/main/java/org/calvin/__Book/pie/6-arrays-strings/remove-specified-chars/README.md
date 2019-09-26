# Remove Specified Characters

## Problem

Write an efficient function that deletes characters from an ASCII string.
Using the prototype

    string removeChars(string str, string remove);

where any character existing in `remove` must be deleted from `str`.
For example. given a `str` of "Battle of the Vowel: Hawaii vs. Grozny" and a `remove` of "aeiou", the function should transform `str` to "Bttl f th Vwls: Hw vs. Grzny".
Justify and design decisions you make, and discuss the efficiency of your solution.

## Analysis

This problem breaks into two seprate tasks.
For each character in `str`, we must determine whether it should be deleted.  Then, if appropriate, we must delete the character.
The second task is deletion.

In general condtion, check a char in a string with length `n` need O(n) runtime.
We can reduce it to  O(1) by hash map(need O(n) to construct the map).


