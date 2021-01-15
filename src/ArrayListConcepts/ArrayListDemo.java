package ArrayListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // static array
//        int[] i = new int[4];
//        System.out.println(i[0]);
//        System.out.println(i[1]);
        // ArrayList is the default class
        // Dynamic Array
        // default arraylist
        // Raw type, you can add anything you want
//        ArrayList ar = new ArrayList();
        // ArrayList maintain the order.
        ArrayList<Object> ar = new ArrayList<>();
        ar.add(100);
        ar.add("Testing");
        ar.add(1.2);
        ar.add(true);
//        System.out.println(ar);
        System.out.println(ar.get(2));
//        System.out.println(ar.get(-1));// negative indexing is not allowed in java, but allowed in Python.
//        System.out.println(ar.size());
//        System.out.println(ar.get(0));
//        System.out.println(ar.size()-1);
        System.out.println(ar.add(100));
        System.out.println(ar.add(200));
        System.out.println(ar.size());





    }
}
