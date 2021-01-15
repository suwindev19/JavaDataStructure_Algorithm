package hashing;
import java.util.TreeSet;

class Point implements Comparable{
    int x; // my point
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x = " + x + ", y = " + y + "\n";
    }

    public int compareTo(Object o)
    {
        Point p = (Point) o;
        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else{
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }


}

public class ComparableDemo {
    public static void main(String[] args) {
        TreeSet<Point> treeSet = new TreeSet<>();

        treeSet.add(new Point(1, 1));
        treeSet.add(new Point(5, 5));
        treeSet.add(new Point(5, 2));
        System.out.println(treeSet);
    }
}
