public class LinkedList {

    /**
     * Inset a node in the front.
     * Note: keeping tracking the head.
     * The caller should updates its reference to the new head element from the method.
     *  eg: head = insertInFront(head, data);
     */
    public ListElement<Integer> insertInFront(ListElement<Integer> list, int data) {
        ListElement<Integer> l = new ListElement<Integer>(data);
        l.setNext(list);
        return l;
    }

    /**
     * Travering a List: find a value in the list.
     * Note: If not found, it will return null.
     * The caller must detect an error condition by checking for a null return value.
     */
    public ListElement<Integer> find(ListElement<Integer> head, int data) {
        ListElement<Integer> elem = head;
        while (elem != null && elem.value() != data) {
            elem = elem.next();
        }
        return elem;
    }
}
