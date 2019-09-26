# Telephone Words

## Problem

People in the United States often give others their telphone number as aword representing the seven-digit number after the area code.
For example, if my telephone number were 866-2665, I could tell people my number is "TOOCOOL" instead of the hard-to-rember seven-digit number. Note that many other possiblities(most of which are nonsensical) can represent 866-2665.

    1       2(ABC)  3(DEF)
    4(GHI)  5(JKL)  6(MNO)
    7(PRS)  8(TUV)  9(WXY)
    *       0       #

Write a dunction that takes a seven-didit telephone number and prints out all of the possible "words" or combinations of letters that can represent the given number.
Because the 0 and 1 keys have no letters on them, you should change only the digit 2-9 to letters. You'll be passed an array of seven integers, with each element being one digit in the number.
You may assume that only valid phone number will be passed to your function. You can use the helper function
    
    char getCharKey(int telephoneKey, int place)

which takes a telephone key (0-9) and a place of either 1, 2, 3 and returns the character corresponding to the letter in that position on the specified key.
For example, getCharKey(3, 2) will return 'E' because the telephone key 3 has the letters "DEF" on it and 'E' is the second letter.

## Analysis

Recursive
