package linkedList;

public class LinkedList {
    Node startnode;

    public LinkedList() {
        this.startnode = null;
    }

    public void addNodeToStart(int value) {
        if (startnode == null) {
            startnode = new Node(value);
        } else {
            Node tempNode = new Node(value);
            tempNode.nextNode = startnode;
            startnode = tempNode;
        }
    }

    public void addNodeToLast(int data) {
        if (startnode == null) {
            startnode = new Node(data);
        } else {
            Node currentNode = startnode;
            while ((currentNode.nextNode != null)) {
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = new Node(data);
        }
    }

    public void addNodeAfter(int data1, int data2) {
        Node currentNode = startnode;
        while ( currentNode != null && currentNode.data != data1) {
            currentNode = currentNode.nextNode;
        }
        if (currentNode == null) {
            System.out.println(data1 + "  does not exist.");
        } else {
            Node next = currentNode.nextNode;
            Node temp = new Node(data2);
            currentNode.nextNode = temp;
            temp.nextNode = next;
        }
    }

    public void addNodeBefore(int data1, int data2) {
        Node currentNode = startnode;
        while (currentNode.nextNode !=null && currentNode.nextNode.data != data1) {
            currentNode = currentNode.nextNode;
        }

        if (currentNode == null) {
            System.out.println(data1 + " does not exist.");
        } else {
            Node next = currentNode.nextNode;
            Node temp = new Node(data2);
            currentNode.nextNode = temp;
            temp.nextNode = next;
        }
    }

    public void printList() {
        Node current = startnode;
        while (current != null) {
            System.out.println(current.data);
            current = current.nextNode;
        }
    }
}
