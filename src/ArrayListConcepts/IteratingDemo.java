package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratingDemo {
    public static void main(String[] args) {
        // default capacity of ArrayList is 10.
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("Tim");
        studentList.add("Anna");
        studentList.add("Rochella");
        studentList.add("Steve");

        // for loop
//        for(int i = 0; i < studentList.size(); i++){
//            System.out.print(studentList.get(i) + " ");
//        }

        // for each loop
//        for(String s : studentList){
//            System.out.print(s + " ");
//        }

        // Use Lambda function
        // JDK 8 - Stream with Lambda
//        studentList.stream().forEach(ele -> System.out.print(ele  + " "));

        // Iterator
//       Iterator<String> it =  studentList.iterator();
//       while(it.hasNext()){
//           System.out.print(it.next() + " ");
//       }

        //List with other collections
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
        System.out.println(numbers);
        System.out.println(numbers.size());
     }
}
