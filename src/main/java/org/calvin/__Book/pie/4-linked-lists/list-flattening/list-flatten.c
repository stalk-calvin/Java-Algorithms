#include <stdlib.h>
#include <stdio.h>

typedef struct Node {
    struct Node *next;
    struct Node *prev;
    struct Node *child;
    int         value;
} Node;

void appendChild(Node *child, Node **tail); 

void flattenList(Node *head, Node **tail) {
    Node *curr = head;
    Node *child;
    while (curr) {
        /* the current node had a child. */
        if (curr->child) {
            appendChild(curr->child, tail);
        }
        curr = curr->next;
    }
}

/**
 * Appends the child list to the end of the tail and updates the tail.
 */
void appendChild(Node *child, Node **tail) {
    Node *curr = child;

    /* append the child list to the end. */
    (*tail)->next = child;
    child->prev = *tail;

    /* update the new tail. */
    while (curr->next) {
        curr = curr->next;
    }
    *tail = curr;
}

void createMutipleList(Node **head, int idx, Node *child) {
    Node *curr = *head;
    int i = 0;    
    for (i = 0; i< idx; i++) {
        curr = curr->next;
    }
    curr->child = child;
}

void createList(Node **head, Node **tail, int nums[], int count) {
    if (count <= 0 ) return;
    *head = malloc(sizeof(Node));
    (*head)->value = nums[0];
    Node *curr = *head;
    int i = 0;
    for (i = 1; i < count; i++) {
        curr->next = malloc(sizeof(Node));
        curr->next->value = nums[i];
        curr->next->prev = curr;
        curr = curr->next;
    }
    *tail = curr;
}

void printList(Node *head) {
    Node *curr = head;
    while (curr) {
        printf("%d -> ", curr->value);
        curr = curr->next;
    }
    printf("null\n");
}

int main(int argc, char *argv[]) {
    printf("==== create single list ====\n");
    Node *h11, *h21, *h22, *h31, *h32, *h33, *h41, *h42;
    Node *t11, *t21, *t22, *t31, *t32, *t33, *t41, *t42;
    int nums11[] = {5, 33, 17, 2, 1};
    int nums21[] = {6, 25, 6};
    int nums22[] = {2, 7};
    int nums31[] = {8};
    int nums32[] = {9};
    int nums33[] = {12, 5};
    int nums41[] = {7};
    int nums42[] = {21, 3};
    createList(&h11, &t11, nums11, sizeof(nums11)/sizeof(int));    
    printList(h11);
    createList(&h21, &t21, nums21, sizeof(nums21)/sizeof(int));    
    printList(h21);
    createList(&h22, &t22, nums22, sizeof(nums22)/sizeof(int));    
    printList(h22);
    createList(&h31, &t31, nums31, sizeof(nums31)/sizeof(int));    
    printList(h31);
    createList(&h32, &t32, nums32, sizeof(nums32)/sizeof(int));    
    printList(h32);
    createList(&h33, &t33, nums33, sizeof(nums33)/sizeof(int));    
    printList(h33);
    createList(&h41, &t41, nums41, sizeof(nums41)/sizeof(int));    
    printList(h41);
    createList(&h42, &t42, nums42, sizeof(nums42)/sizeof(int));    
    printList(h42);

    printf("\n==== create mutiple layer list ====\n");
    createMutipleList(&h11, 0, h21);
    createMutipleList(&h11, 3, h22);
    createMutipleList(&h21, 1, h31);
    createMutipleList(&h21, 2, h32);
    createMutipleList(&h22, 0, h33);
    createMutipleList(&h32, 0, h41);
    createMutipleList(&h33, 0, h42);

    printf("\n==== flatten list ====\n");
    flattenList(h11, &t11);
    printList(h11);
}
