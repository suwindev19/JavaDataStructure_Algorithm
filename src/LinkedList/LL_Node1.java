package LinkedList;

import java.util.LinkedList;

public class LL_Node1 <T extends Comparable<T>> {
    private T data;
    private LL_Node1<T> nextNode;

    // constructor
    public LL_Node1(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public LL_Node1<T> getNextNode(){
        return nextNode;
    }

    public void setNextNode(LL_Node1<T> nextNode){
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
