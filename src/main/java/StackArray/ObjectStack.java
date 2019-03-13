package stackarray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    private final int maxnumberOfElements;
    private int length = 0;

    public ObjectStack() {
        this(100);
    }

    public ObjectStack(int maxnumberOfElements) {
        this.maxnumberOfElements = maxnumberOfElements;
        elements = (E[])new Object[maxnumberOfElements];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(E element) {
        elements[length] = element;
        length++;
    }

    public E pop() {
        length --;
        return (E)elements[length];
    }
}
