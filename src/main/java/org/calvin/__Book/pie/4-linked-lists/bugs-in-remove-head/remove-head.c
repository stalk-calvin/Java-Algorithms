#include <stdlib.h>
#include <stdio.h>

typedef struct ListElement {
    struct ListElement *next;
    void *data;
} ListElement;

void removeHead(ListElement **head) {
    ListElement *temp;
    if (head && *head) {
        temp = (*head)->next;
        free(*head);
        *head = temp;
    }
}

int main(int argc, char *argv[]) {
    ListElement *head = NULL;
    printf("=== remove zero-element list ===\n");
    removeHead(&head);
    printf("\n=== remove one-element list ===\n");
    ListElement *curr = malloc(sizeof(ListElement));
    curr->data = (void *)1;
    head = curr;
    printf("%ld\n", (long)head->data);
    printf("\n=== after remove ===\n");
    removeHead(&head);
    if (head == NULL) printf ("null\n");
}
