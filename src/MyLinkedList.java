public class MyLinkedList<T> implements MyList<T> {

    private static class Node<T> {
        T element;
        Node<T> next;
        public Node(T element) {
            this.element = element;
            next = null;
        }
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> actualNode = head;
            while (actualNode.next != null) {
                actualNode = actualNode.next;
            }
            actualNode.next = newNode;
        }
        size++;
    }

    @Override
    public T pop() {
        Node<T> temp = head;
        head = temp.next;
        size--;
        return temp.element;
    }

    @Override
    public T remove(int index) {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("Введите корректное число");
        }

        T obj = null;

        if (index == 0) {
            obj = pop();
        } else {
            Node<T> actualNode = head;
            Node<T> prevNode = null;
            for (int i = 0; i <= index; i++) {
                if (i == index) {
                    prevNode.next = actualNode.next;
                }
                prevNode = actualNode;
                actualNode = actualNode.next;
                obj = prevNode.element;
            }
        }
        size--;
        return obj;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index > size) {
            throw new IllegalArgumentException("Введите корректное число");
        }

        T obj = null;
        Node<T> actualNode = head;

        for (int i = 0; i < size; i++) {
            if (i == index) {
                obj = actualNode.element;
            }
            actualNode = actualNode.next;
        }
        return obj;
    }

    @Override
    public int size() {
        return size;
    }

    private Node<T> head;
    private int size;

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node<T> temp = head;
        str.append("[");
        while (temp != null) {
            str.append(temp.element);
            temp = temp.next;
            if (temp != null) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}

