package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
    Arrays.sort()
        Arrays.sort (for primitive data types - int , char, long, )
        stability is not required since they don't require any stability
        Dual Pivot and QuickSort

    Stable Sorting algorithms
        - original order is maintained.
        - Arrays of objects (String, Integer, Student, ...) , based on MergeSort adapation of TimeSort
        - MergeSort ensures stability

    Collections.sort()
        - for collections
        - for Lists (ArrayList, LinkedList, ...

    Arrays.sort() - sort normal arrays (either primitve or none primitive
 */
public class Sorting_Intro {
    public static void main(String[] args) {
        int[] arr1 = {5, 20, 12, 30};
        char[] arr2 = {'b', 'b', 'a', 'd', 'g', 'f'};
        Arrays.sort(arr1, 0, 2);
        for(int i: arr1){
            System.out.println(i);
        }
        Arrays.sort(arr2);
        System.out.println(arr2);

//        Point arr[] = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
//        Arrays.sort(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i].x + " " + arr[i].y);
//        }

        Point arr[] = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr, new MyCompare());
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].x + " " + arr[i].y);
        }

        Integer arr3[] = {5, 20, 10, 12};
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));

    }
}

//class Point implements Comparable<Point>{
//    int x, y;
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//
//    public int compareTo(Point p){
//        return this.x  - this.y;
//    }
//}

class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class MyCompare implements Comparator<Point>{
    public int compare(Point p1, Point p2){
        return p1.x - p2.x;
    }
}