package interview;

public class Set<E> {
    private int size;
    private Object[] elements;
    private int capacity;
    private int loadFactor;

    private final int DEFAULT_CAPACITY = 10;
    private final int DEFAULT_FACTOR = 2;

    public Set() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.loadFactor = DEFAULT_FACTOR;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E element) {
        if(size == capacity) {
            shrink();
        }
        if(!contains(element)) {
            elements[size++] = element;
        }
    }

    public boolean contains(Object element) {
        boolean result = false;
        for (int j = 0; j < size; j++) {
            if(elements[j] == element){
                result = true;
                break;
            }
        }
        return result;
    }

    public int size() {
        return size;
    }

    private void shrink() {
        capacity = size * DEFAULT_FACTOR;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;
    }

    public void remove(Object element) {
        for (int i = 0; i < size; i++) {
            if(elements[i].equals(element)){
                elements[i] = null;
                --size;
            }
        }
    }
}
