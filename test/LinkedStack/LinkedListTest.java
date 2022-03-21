package LinkedStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void addToFrontCheck() throws EmptyListException {
        LinkedList list = new LinkedList();
        int testValue = 10;

        list.addToFront(testValue);
        assertEquals(testValue, list.removeFirst());
    }

    @Test
    void removeFromEmptyList() throws EmptyListException{
        LinkedList list = new LinkedList();
        assertThrows(EmptyListException.class, list::removeFirst);
    }

    @Test
    void checkSizeOfList() {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.addToFront(1);
        }
        assertEquals(10, list.size());

    }

    @Test
    void checkSizeOfListAfterRemoval() throws EmptyListException {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.addToFront(1);
        }
        list.removeFirst();

        assertEquals(9, list.size());
    }

    @Test
    void checkIfEmpty() {
        LinkedList list = new LinkedList();
        assertEquals(true, list.isEmpty());
    }

    @Test
    void checkIfNotEmpty() {
        LinkedList list = new LinkedList();
        list.addToFront(1);
        assertEquals(false, list.isEmpty());
    }
}