package LinkedStack;

import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T> {

    private LinkedList<T> list = new LinkedList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T element) {
        list.addToFront(element);
    }

    @Override
    public T pop() throws EmptyStackException {
        try {
            return list.removeFirst();
        } catch (EmptyListException e) {
            throw new EmptyStackException();
        }
    }
}
