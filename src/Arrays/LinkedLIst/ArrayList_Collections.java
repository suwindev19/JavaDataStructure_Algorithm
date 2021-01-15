package Arrays.LinkedLIst;

public class ArrayList_Collections {
    /**
     * This is one of the most implementations of the List interface!
     * An array stores the values in the background
     * int[ ] array = new int[10];
     * random access / very fast O(1) -> random access: accessing items by their indexes e.g. list.get(0)
     * it is equivalent to Vector but arraylist is not synchronised.
     * All operations run in O(n) Time
     * But if you want to remove items, operation is not so efficient.
     * You have to shift each item in the list : Time O(n)
     * If the application is just about adding elements to a list and getting elements with known indexes, use ArrayList
     * Capacity:
     *      - It is a parameter we can define when we instantiate ArrayList
     *      - It is the initial array size.
     *      - If you know that you will store 5 million items list, you should use it
     *      - list = new ArrayList(5000000)
     *      - Since this may reduce the amount of incremental reallocation
     *
     */
    public static void main(String[] args) {

    }

}
