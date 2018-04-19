# include <iostream>

template <class T>
class ListElement {
    public:
        ListElement(T value): next(NULL), data(value) {
        }
        ~ListElement() {
        }

        ListElement* getNext() const {
            return next;
        }
        const T& value() {
            return data; 
        }
        void setNext(ListElement* elem) {
            next = elem; 
        }
        void setValue(const T &value) {
            data = value; 
        }
    private:
        ListElement *next;
        T           data;
};
