package LinkedList;

import java.lang.reflect.Array;
import java.util.*;

// Iterator<E> interface
// E next()
// boolean hasNext()
// void remove()
public class Iterator_Demo {
    public static void main(String[] args) {
        List<String> list;
        list = new ArrayList<String>();
        list.add("Japan");
        list.add("Taiwan");
        list.add("Norway");
        print(list);
        remove(list, "Japan");
//
//        Iterator<String> cities =  list.iterator();
//        System.out.println(cities.next());// even though it said next(), it will give you the first element in the list.
//        System.out.println(cities.next());
//        System.out.println(cities.next());
//        System.out.println(cities.hasNext()); // no more element so , NoSuchElementException error


    }

    public static void print(List<String> list){ // Set<String> , set is not indexed
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i)); // very slow, runs in linear time
////        }
//        Iterator<String> cities = list.iterator();
//        while(cities.hasNext()){ // true
//            System.out.println(cities.next());
//        }


//        Iterator<String> it = list.iterator();
//        String x = cities.next();
//        while(x != null){
//            System.out.println(x);
//            x = it.next(); // does not return null at the end. It crashes.
//        }

//        Iterator<String> it1 = new Iterator<String>(list); // Iterator is an interface, not a class. To implement this, make an instance of a class.

        Iterator<String> it2 = list.iterator();
//        while(it2.hasNext()){
//            if(it2.next().equalsIgnoreCase("Japan")){
//                System.out.println(it2.next());
//            }
//        }

        //---------------------------

//        String s = it2.next();
//        if(s.equalsIgnoreCase("Japan")){
//            System.out.println(s);
//        }

        //---------------------------
//
//        while(list.iterator().hasNext()){
//            System.out.println(list.iterator().next());
//        }
    }

    public static void remove(List<String> list, String s){
        Iterator<String> it = list.iterator();
        int index = 0;
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase(s))
                list.remove(index);
            else
                index++;
        }
    }


}
