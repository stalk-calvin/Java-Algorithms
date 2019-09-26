typedef int ElemType;
typedef struct ListElement {
    struct ListElement *next;
    ElemType           data;
} ListElement;
