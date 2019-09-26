#include <stdlib.h>     // malloc, free
#include <stdbool.h>    // bool
#include <ListElement.h>// ListElement

/**
 * Insert a node the front.
 * Note: We should pass a pointer to the head pointer to update the head.
 * Use return value to indicate the success or failure of the memory allocation(because there is no exception in C).
 */
bool insertInFront(ListElement **head, int data) {
    ListElement *newElem = malloc(sizeof(ListElement));
    if(!newElem) return false;

    newElem->data = data;
    newElem->next = *head;
    *head = newElem; // update the head pointer
    return true;
}

/**
 * Delete an element from the list.
 * Note: deletion require a pointer or reference to the element immediately preceding the deletion or insertion localtion.
 */
bool deleteElement(ListElement **head, ListElement *deleteMe) {
    ListElement *elem; /* previous node */

    if (!head || !*head || !deleteMe) /* check for null pointers */
        return false;

    elem = *head;
    if (deleteMe == *head) { /* special case for head */
        *head = elem->next;
        free(deleteMe);
        return true;
    }

    while (elem) {
        if (elem->next == deleteMe) {
            /* elem is element preceding deleteMe */
            elem->next = deleteMe->next;
            free(deleteMe);
            return true;
        }
        elem = elem->next;
    }
    /* deleteMe not found */
    return false;
}

/**
 * Remove all elements from list.
 * Note: using two pointers to solve free problem.
 * Deletion of an element always requires at least two pointers variables.
 */
void deleteList(ListElement **head) {
    ListElement *deleteMe = *head;
    while (deleteMe) {
        ListElement *next = deleteMe->next;
        free(deleteMe);
        deleteMe = next;
    }
    *head = NULL;
}
