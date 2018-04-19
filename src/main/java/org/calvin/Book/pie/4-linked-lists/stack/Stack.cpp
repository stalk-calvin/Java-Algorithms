#include <iostream>
using namespace std;

typedef long INT;

class Stack {
public:
    Stack() : head(NULL) {};
    ~Stack();
    void push(void *data);
    void *pop();

protected:
    class Element {
    public:
        Element(Element *n, void *d) : next(n), data(d) {}
        Element *getNext() const { return next; }
        void *value() const { return data; }
    private:
        Element *next;
        void    *data;
    };
    Element *head;
};

Stack::~Stack() {
    while(head) {
        Element *next = head->getNext();
        delete head;
        head = next;
    }
}

void Stack::push(void *data) {
    Element *element = new Element(head, data);
    head = element;
}

void *Stack::pop() {
    Element *popElement = head;
    void *data;

    if (head == NULL)
        throw ; // StackError(E_EMPTY);

    data = head->value();
    head = head->getNext();
    delete popElement;
    return data;
}

int main(int argc, char const *argv[]) {
    Stack stack;
    INT count = 5;
    INT i;
    bool result;
    INT val;
    cout << "==== push test ====" << endl;
    for (i = 0 ; i < count; i++) {
        stack.push((void *)i);
        cout << i << " -> ";
    }
    cout << "\n==== pop test ====" << endl;
    for (i = 0 ; i < count; i++) {
        try {
            val = (INT)stack.pop();
            cout << val << " -> ";
        } catch (exception& e) {
            cout << "can't pop from empty stack.";
        }
    }
    cout << endl;
}
