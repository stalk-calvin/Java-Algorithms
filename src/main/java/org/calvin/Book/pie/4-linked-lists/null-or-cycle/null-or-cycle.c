#include <stdlib.h>
#include <stdbool.h>
#include <stdio.h>

typedef struct Node {
    struct Node *next;
    int value;
} Node;

bool determineTermination(Node *head) {
    if (head == NULL || head->next == NULL) return false;
    Node *fast = head;
    Node *slow = head;
   
    do {
        slow = slow->next;
        fast = fast->next->next;
    } while (fast->next != NULL && slow != fast);

    return slow == fast ? true : false;
}


bool createList(Node **head, int nums[], int count) {
    if (count <= 0) return false;
    *head = malloc(sizeof(Node));
    if (*head == NULL) return false;

    Node *curr = *head;
    int i;
    for (i = 0; i < count; i++) {
        curr->value = nums[i];
        if (i < count - 1) {
            curr->next = malloc(sizeof(Node));
            if (curr->next == NULL) return false;
            curr = curr->next;
        } else {
            curr->next = NULL;
        }
    }
    return true;
}

void addCycle(Node **head, int pos) {
    Node *cycle;
    Node *curr;
    int i = 0;
    while (curr->next) {
        if (i == pos) cycle = curr;
        curr = curr->next;
        i++;
    }
    curr->next = cycle;
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
    Node *head;
    int nums[] = {1, 2, 3, 4, 5};
    bool result;
    createList(&head, nums, sizeof(nums)/sizeof(nums[0]));

    printList(head);
    result = determineTermination(head);
    printf("is cycle: %d\n", result);

    addCycle(&head, 1);
    result = determineTermination(head);
    printf("is cycle: %d\n", result);
}
