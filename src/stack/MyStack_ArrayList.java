package stack;
/*
Time
Simple array - O(1)
ArrayList   - O(1)  Amortised time to the last position of the array , therefore, O(1) , for ArrayList, average amortised is O(1)
 */
import java.util.ArrayList;

class MyStack_ArrayList {
    ArrayList<Integer> al = new ArrayList<>();
    void push(int data) {
        al.add(data);
    }

    int pop() {
        int result = al.get(al.size()-1);
        al.remove(al.size()-1);
        return result;
    }

    int peek() {
        return al.get(al.size()-1);
    }

    boolean isEmpty(){
        return al.isEmpty();
    }

    int size(){
        return al.size();
    }
}
