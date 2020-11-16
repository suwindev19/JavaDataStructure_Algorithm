package DataStructure_CourseNotes.week1;

public class LinkedList {
    Node head;

    public  LinkedList() {
        this.head = null;
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void deleteFromStart(){
        if(null != head){
            head = head.next;
        } else {
            System.out.println("List is not available");
        }
    }

    public void deleteFromLast(){
        Node current = head;
        if( head != null){
            while(current.next != null &&  current.next.next != null){ // once you reach to current.next is null, break from the loop
                current = current.next;
            }
        }
        current.next = null;
    }


    public void insertBeforeData(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    public void insertAfterData(){

    }

    public void removeAfterData(){

    }

    public void printLinkedList( ){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("\n");
    }
}
