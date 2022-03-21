package LinkedStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void dataSetAndGetCheck() {
        int testValue = 10;
        Node node = new Node();
        node.setData(testValue);

        assertEquals(testValue, node.getData());
    }

    @Test
    void nodeWithNoDataCheck() {
        Node node = new Node();
        assertEquals(null, node.getData());
    }

    @Test
    void nextSetAndGetCheck() {
        int firstTestValue = 10;
        int secondTestValue = 11;
        Node node1 = new Node();
        node1.setData(firstTestValue);
        Node node2 = new Node();
        node2.setData(secondTestValue);

        node1.setNext(node2);

        assertEquals(secondTestValue, node1.getNext().getData());
    }

    @Test
    void nodeWithNoNextCheck() {
        Node node = new Node();
        assertEquals(null, node.getNext());
    }
}