#include <stdlib.h>
#include <string.h>
#include <stdio.h>

void reverseString(char* str, int start, int end);

void reverseWords(char* str) {
    int start = 0;
    int end = 0;
    int length = strlen(str);

    // reverse whole string
    reverseString(str, start, length - 1);

    while (end < length) {
        while (str[end + 1] != ' ' && end < length - 1) { end++; }
        // reverse each word
        reverseString(str, start, end);
        start = end + 1; // skip the first space
        while (str[start] == ' ') { start ++; } // skip other space if has
        end = start;
    }

}

void reverseString(char* str, int start, int end) {
    char temp;
    while (start < end) {
        temp = str[start];
        str[start++] = str[end];
        str[end--] = temp;
    }
}

int main(int argc, char* argv[]) {
    char str1[] = "One";
    char str2[] = "Two words";
    char str3[] = "Do or do not, there is no try.";
    char* strs[] = { str1, str2, str3 };

    char result1[] = "One";
    char result2[] = "words Two";
    char result3[] = "try. no is there not, do or Do";
    char* results[] = { result1, result2, result3 };
    
    int count = 3;
    int failed = 0;
    int i;
    for (i = 0; i < count; i++) {
        reverseWords(strs[i]);
        if (strcmp(strs[i], results[i]) != 0) {
            failed++;
            printf("Excpect: %s, while returned: %s\n", results[i], strs[i]);
        }
    }
    printf("Test %d cases, %d success, %d failed\n", count, count-failed, failed);
}

