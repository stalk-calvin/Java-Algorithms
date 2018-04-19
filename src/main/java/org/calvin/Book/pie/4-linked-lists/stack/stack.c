#include <stdlib.h> // malloc, free
#include <stdbool.h>// bool, true, false
#include <stdio.h>  // printf

typedef struct Element {
    struct Element *next;
    void *data;
} Element;

typedef long INT; // for 64, the sizeof(void *) = sizeof(long)

/**
 * init the stack: set the stack pointer to NULL and return success.
 */
bool createStack(Element **stack) {
    *stack = NULL;
    return true;
}

/**
 * push: add new element to the stack, place it at the top of stack, and adjust the stack pointer.
 * Note: need check the allocation.
 */
bool push(Element **stack, void *data) {
    Element *elem = malloc(sizeof(Element));
    if(!elem) return false;

    elem->data = data;
    elem->next = *stack;
    *stack = elem;
    return true;
}

/**
 * pop: fetch the data from the top element, and adjust the stack pointer.
 * Note: need check if the stack is empty, and free the element is no longer on the stack.
 */
bool pop(Element **stack, void **data) {
    Element *elem;
    if (!(elem = *stack)) return false;

    *data = elem->data;
    *stack = elem->next;
    free(elem);
    return true;
}

/**
 * delete the whole stack.
 * Note: don't forget use a temp pointer to hold the address of the next element while free the current one.
 */
bool deleteStack(Element **stack) {
    Element *next;
    while (*stack) {
        next = (*stack)->next;
        free(*stack);
        *stack = next;
    }
    return true;
}


int main(int argc, char *garv[]) {
    Element *stack;
    createStack(&stack);
    INT count = 5;
    INT i;
    bool result;
    INT val;
    printf("==== push test ====\n");
    for (i = 0 ; i < count; i++) {
        result = push(&stack, (void *)i);
        if (result) {
            printf("%ld -> ", i);
        } else {
            printf("allocation failed.");
        }
    }
    printf("\n==== pop test ====\n");
    for (i = 0 ; i < count; i++) {
        result = pop(&stack, (void *)&val);
        if (result) {
            printf("%ld -> ", val);
        } else {
            printf("can't pop from empty stack.");
            break;
        }
    }
    printf("\n");
}
