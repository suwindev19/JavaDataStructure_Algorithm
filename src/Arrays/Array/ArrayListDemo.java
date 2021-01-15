package Arrays.Array;

import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Su");
        list.add("Win");
        list.add("San");
        list.add("Ramen");
        list.add("Tempura");
        list.remove(0);
        for(String s : list){
            System.out.println(s);
        }

//        System.out.println(list.get(3));
//        System.out.println(list.isEmpty());

        Object[] array = list.toArray();
        for(Object o : array){
            System.out.println(o);
        }
    }
}
