public interface MyList<T> {

    void add(T element);
    T pop();
    T remove(int index);
    T get(int index);
    int size();
}


