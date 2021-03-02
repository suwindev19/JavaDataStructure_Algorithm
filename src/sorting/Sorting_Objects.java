package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Point1 implements Comparable<Point1>{
    int x, y;
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point1 p){
        return this.x - this.y;
    }
}

public class Sorting_Objects {
    public static void main(String[] args) {
        List<Point1> list = new ArrayList<>();
        list.add(new Point1(5, 10));
        list.add(new Point1(2, 20));
        list.add(new Point1(10, 30));
        Collections.sort(list);
        for(Point1 p : list){
            System.out.println(p.x+ " "+ p.y);
        }
    }
}
