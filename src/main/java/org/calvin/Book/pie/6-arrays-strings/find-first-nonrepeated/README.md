# Find the First Nonrepeated CHaracter

## Problem

Write an effcient function to find the first nonrepeated character in a string.
For instance, the first nonrepeated character in "total" is 'o' and the first nonrepeated character in "teeter" is 'r'. Discuss the efficiency of your algorithm.

## Analysis

    First, build the character count hash table:
        for each character
            if no value is stored, store 1
            otherwist, increment the value
    Second, sacn the string:
        for each character
            return character if count in hash table is 1
        if no character have count 1, return null
