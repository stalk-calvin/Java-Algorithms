#include <stdlib.h> // malloc, free
#include <stdbool.h>// bool, true, false
#include <stdio.h>  // printf

typedef struct Element {
    struct Element *next;
    int data;
} Element;

Element *head = NULL;
Element *tail = NULL;

bool delete(Element *elem) {
    if (elem == NULL) return false;

    if (elem == head) {
        /* special case: only one node. */
        if (head == tail) tail = NULL;
        head = head->next;
        free(elem);
        return true;
    }

    Element *curr = head;
    while (curr) {
        if (curr->next != elem) {
            curr = curr->next;
        } else {
            curr->next = elem->next;
            if (elem == tail) tail = curr; /* delete at tail. */
            free(elem);
            return true;
        }
    }
    /* can't find the element. */
    return false;
}

bool insertAfter(Element *elem, int data) {
    Element *newElem = malloc(sizeof(Element));
    if (!newElem) return false;

    newElem->data = data;

    /* insert before head. */
    if (elem == NULL) {
        newElem->next = head;
        head = newElem;
        /* special case: empty list. */
        if (tail == NULL) tail = newElem;
        return true;
    }
    
    Element *curr = head;
    while (curr) {
        if (curr == elem) {
            newElem->next = elem->next;
            curr->next = newElem;
            /* insert after the tail. */
            if (elem == tail) tail = newElem;
            return true;
        }
    }
    /* can't find the element. */    
    free(newElem);
    return true;
}

void printList(Element *elem) {
    Element* curr = elem;
    while (curr) {
        printf("%d -> ", curr->data);
        curr = curr->next;
    }
    printf("null\n");
}

int main(int argc, char *argv[]) {
    bool result;
    printf("==== insert before head node ====\n");
    result = insertAfter(NULL, 1);
    printf("result: %d, head: %d, tail: %d.\n", result, head->data, tail->data);
    printList(head);
    printf("\n==== insert after head node ====\n");
    Element *curr = head;
    result = insertAfter(curr, 2);
    printf("result: %d, head: %d, tail: %d.\n", result, head->data, tail->data);
    printList(head);
    printf("\n==== delete at head node ====\n");
    result = delete(curr);
    printf("result: %d, head: %d, tail: %d.\n", result, head->data, tail->data);
    printList(head);
    printf("\n==== delete not exist node ====\n");
    result = delete(curr);
    printf("result: %d, head: %d, tail: %d.\n", result, head->data, tail->data);
    printList(head);
    printf("\n==== insert after tail node ====\n");
    curr = tail;
    result = insertAfter(curr, 3);
    printf("result: %d, head: %d, tail: %d.\n", result, head->data, tail->data);
    printList(head);
    printf("\n==== delete at tail node ====\n");
    curr = tail;
    result = delete(curr);
    printf("result: %d, head: %d, tail: %d.\n", result, head->data, tail->data);
    printList(head);
}
