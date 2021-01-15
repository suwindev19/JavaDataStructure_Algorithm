package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        // add
        ll.add("Kochi");
        ll.add("Ichi Ken");
        ll.add("Hokkaido");
        ll.add("Nagoya");
        ll.add("Nagano");

        System.out.print("Contents of LinkedList " + ll + " ");
        ll.addFirst("Shinagawa");
        ll.addLast("Tohoku");
//        System.out.println();
//        System.out.print("Contents of LinkedList " + ll + " ");

        //get
//        System.out.println(ll.get(0));

        // set
        ll.set(0,"Kanazawa");
//        System.out.println(ll.get(0));

//        // remove first and last elements
//        ll.removeFirst();
//        ll.removeLast();
//        System.out.print("Contents of LinkedList " + ll + " ");
//
//        ll.remove(3);
//        System.out.print("Contents of LinkedList " + ll + " ");

        // printing all items in the LinkedList
        // for loop
        // advanced for loop
        // Iterator
        // while loop

        System.out.println("Using for loop");
//        for(int n = 0; n < ll.size(); n++){
//            System.out.println(ll.get(n));
//        }

        // Enhanced for loop
        System.out.println("*******************");
//        for(String str : ll){
//            System.out.println(str);
//        }
        System.out.println("****** Using Iterator *******");

        Iterator<String> it = ll.iterator();
//       while(it.hasNext()){
//           System.out.println(it.next());
//       }

       // While loop
        System.out.println("****** While loop ******");
        int num = 0;
        while(ll.size() > num){
            System.out.println(ll.get(num));
            num++;
        }

    }
}
