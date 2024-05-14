import java.util.EmptyStackException;

public class Stack21<T> {
    private int size;
    private int top;
    private T[] data;

    public Stack21(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(T item) {
        if (!isFull()) {
            top++;
            data[top] = item;
        } else {
            System.out.println("Stack is full");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T item = data[top];
            top--;
            return item;
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            throw new EmptyStackException();
        }
    }

    public void print() {
        System.out.println("Stack content: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
        System.out.println();
    }

    public void clear() {
        if (!isEmpty()) {
            top = -1;
            System.out.println("Stack is now empty");
        } else {
            System.out.println("Failed ! Stack is already empty ");
        }
    }
}
