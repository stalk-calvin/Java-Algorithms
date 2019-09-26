#include <stdlib.h>
#include <stdio.h>

typedef struct ListElement {
    struct ListElement *next;
    int data;
} ListElement;

ListElement *findMToLastElement(ListElement *head, int m) {
    if (m < 0) return NULL;

    ListElement *p = head;
    ListElement *q = head;
    int i = 0;
    while (i <= m) {
        if (p) {
            p = p->next;
            i++;
        } else {
            return NULL;
        }
    }
    while (p != NULL) {
        p = p->next;
        q = q->next;
    }
    return q;
}

ListElement *createList(int count) {
    ListElement *head = malloc(sizeof(ListElement));
    ListElement *curr = head;
    int i;
    for (i = 1; i < count; i++) {
        curr->data = i;
        curr->next = malloc(sizeof(ListElement));
        curr = curr->next;
    }
    curr->data = i;
    return head;
}

void printList(ListElement *head) {
    ListElement *curr = head;
    while (curr) {
        printf("%d -> ", curr->data);
        curr = curr->next;
    }
    printf("null\n");
}

int main(int argc, char *argv[]) {
    ListElement *head = NULL;
    ListElement *result = NULL;
    ListElement *curr = NULL;
    printf("=== zero-element list test ====\n");
    result = findMToLastElement(head, 0);
    if (result) printf("null\n");

    printf("\n=== one-element list test ====\n");
    head = createList(1);
    printList(head);
    result = findMToLastElement(head, 0);
    printf("%d\n", result->data);

    printf("\n=== more-element list test ====\n");
    head = createList(4);
    printList(head);
    result = findMToLastElement(head, 1);
    printf("%d\n", result->data);
}

