package LinkedList;

import java.util.LinkedList;


public class LinkedList_Node_Driver {
    public static void main(String[] args) {

        LinkedList_Implement_1 list = new LinkedList_Implement_1();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertAtStart(25);

        list.insertAtAnyLocation(0, 55);
        list.deleteAt(2);
        list.show();

    }
}
