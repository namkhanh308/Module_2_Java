import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = new Object[capacity];
    }
    void add(int index , E element){
        if(index == elements.length-1){
            ensureCapa();
        }
        for (int i = 0; i < elements.length-1; i++) {
            if(i == index){
                for (int j = elements.length-1; j > index ; j--) {
                        elements[j] = elements[j-1];
                }
                elements[index] = element;
            }
            }
        }
    public E remove(int index){
        E value = (E) elements[index];
        for (int i = 0; i < elements.length-1; i++) {
            if(i == index){
                for (int j = index; j < elements.length-1 ; j++) {
                    elements[j] = elements[j+1];
                }
            }
        }
        return value;
    }
    public E clone(){
        Object newEle[] = new Object[elements.length];
        int count = 0;
        for (Object ele: elements) {
            newEle[count] = ele;
        }
        return (E) newEle;
    }
    public boolean contain(E o){
        for (Object ele:elements) {
            if(o == ele){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i <  elements.length; i++) {
            if(elements[i] == o){
                return i;
            }
        }
        return -1;
    }
    public void add(E e){
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public int size(){
        return elements.length;
    }
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void ensureCapacity(int minCapacity){
        elements = new Object[minCapacity];
    }
    public E get(int i) {
        if (i>= elements.length || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    void clear(){
        Object [] newArr = new Object[0];
        elements = newArr;
    }
}