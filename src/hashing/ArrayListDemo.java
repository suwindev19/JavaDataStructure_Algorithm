package hashing;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(20);
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        arr1.add(10);
        arr1.add(0, 5);
        arr1.addAll(arr2);
        arr1.add(5,70);
//        System.out.println(arr1);
//        System.out.println(arr1.get(5));
//        System.out.println(arr1.indexOf(70));
//        System.out.println(arr1.lastIndexOf(70));
//        arr1.set(6, 100);
//        System.out.println(arr1);
//        arr1.remove(5);
//        System.out.println(arr1);
//        for(int i = 0; i < arr1.size(); i++){
//            System.out.print(arr1.get(i) + " ");
//        }
//
//        for(Integer x : arr1) {
//            System.out.print(x + " ");
//        }

//        for(Iterator<Integer> it = arr1.iterator(); it.hasNext();){
//            java.lang.Integer x = it.next();
//            System.out.println(x);
//        }

//        Iterator<Integer> it = arr1.iterator();
//        while(it.hasNext()){
//            System.out.print(it.hasNext());
//        }

//        ListIterator<Integer> it = arr1.listIterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        for(ListIterator<Integer> it = arr1.listIterator(); it.hasNext();){
//            System.out.println(it.next());
//        }
        arr1.forEach(n -> System.out.print(n + " "));
        arr1.forEach(System.out::print);
        arr1.forEach(n->show(n));
    }

    static void show(int n){
        if(n>60) System.out.println(n);
    }
}
