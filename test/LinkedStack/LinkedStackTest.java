package LinkedStack;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    LinkedStack stack;
    int testValue = 10;

    @BeforeEach
    void setup() {
        stack = new LinkedStack();
    }

    @Test
    void checkPushAndPopToStack() {

        stack.push(testValue);
        assertEquals(testValue, stack.pop());
    }

    @Test
    void checkIfEmpty() {
        assertEquals(true, stack.isEmpty());
    }

    @Test
    void checkIfNotEmpty() {
        stack.push(1);
        assertEquals(false, stack.isEmpty());
    }

    @Test
    void checkPopOnEmptyList() {
        assertThrows(EmptyStackException.class, stack::pop);
    }

}