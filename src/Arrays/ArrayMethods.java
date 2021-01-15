package Arrays;

/**
 *
 */
@SuppressWarnings("unchecked") // to block generic warnings in java
public class ArrayMethods<T> implements Iterable<T> {
    private T[] arr;
    private int len = 0; // length user thinks array is
    private int capacity = 0; // Actual array size

    // ---------- CONSTRUCTORS -----------------------

    public ArrayMethods(){
        this(16);
    }

    public ArrayMethods(int capacity){
        if(capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity]; // initialise it and cast it to type T
    }

    //------------METHODS   ----------------------------

    public int size() {return len;}
    public boolean isEmpty() {return size() == 0;}

    public T get(int index){ return arr[index]; }
    public void set(int index, T elem) { arr[index] = elem;}

    /**
     * clear(): remove all data in the array and set the length to 0
     */
    public void clear(){
        for(int i = 0; i < capacity; i++){
            arr[i] = null;
            len = 0;
        }
    }

    public void add(T elem){
        // time to resize
        if(len+1 >= capacity){
            if(capacity == 0) capacity = 1;
            else capacity *= 2; // double the size
            T[] new_arr = (T[]) new Object[capacity];
            for(int i = 0; i < len; i++)
                new_arr[i] = arr[i];
            arr = new_arr;
        }
        arr[len++] = elem;
    }

    // Remove the elements at the specified index in this list
    public T removeAt(int rm_index){
        if(rm_index >= len && rm_index < 0) throw new IndexOutOfBoundsException();
        T data = arr[rm_index]; // get the data at the removed index
        T[] new_arr = (T[]) new Object[len-1]; // copy everything into new array, except the removed index data
        for(int i = 0, j = 0; i < len; i++, j++)
            if(i == rm_index) j--; // skip over rm_index by fixing j temporarily. so j will be lagged behind.
            else new_arr[j] = arr[i];
            arr = new_arr;
            capacity = --len; // reset the capacity to the newly reduced length
            return data;
    }

    public boolean remove(Object obj){
        for(int i = 0; i < len; i ++){
            if(arr[i].equals(obj)){
                removeAt(i); return true;
            }
        }
        return false;
    }

    public int indexOf(Object obj){
        for(int i = 0; i < len; i++){
            if(arr[i].equals(obj))
                return i;
        }
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }


    // Iterator is still fast but not as fast as iterative for loop
    @Override public java.util.Iterator <T> iterator() {
        return new java.util.Iterator<T>() { // concurrent modification
            int index = 0;

            public boolean hasNext() {
                return index < len;
            }

            public T next() { // return next element in the iterator
                return arr[index++]; }
        };
    }

    @Override
    public String toString(){
        if (len == 0){
            return "[]";
        }
        else{
            StringBuilder sb = new StringBuilder(len).append("[");
            for(int i = 0; i < len - 1; i++){
                sb.append(arr[i] + ", ");
            }
            return sb.append(arr[len-1] + "]").toString();
        }

    }
}
