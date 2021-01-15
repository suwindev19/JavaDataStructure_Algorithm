package LinkedList;

public class LL_LinkedList1<T extends Comparable<T>> implements LL_List1<T> {

    private LL_Node1<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data){
        this.sizeOfList++;
        if(root == null){
            this.root = new LL_Node1<>(data);
        }else{
            insertDataAtBeginning(data);
        }
    }

    private void insertDataAtBeginning(T data){
        LL_Node1<T> newNode = new LL_Node1<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }
    // O(n)
    private void insertDataAtEng(T data, LL_Node1<T> node){
        if(node.getNextNode() != null){
            insertDataAtEng(data, node.getNextNode());
        }else{
            LL_Node1<T> newNode = new LL_Node1<>(data);
            node.setNextNode(newNode);
        }
    }


    @Override
    public void remove(T data){
        if(this.root == null) return;
        this.sizeOfList--;
        if(this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        }else{
            remove(data, root, root.getNextNode());
        }
    }

    private void remove(T dataToRemove, LL_Node1<T> previousNode, LL_Node1<T> actualNode){
        while(actualNode != null){
            if(actualNode.getData().compareTo(dataToRemove) == 0){
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    // iterative approach
    public void traverseList(){
        if(this.root == null) return;
        LL_Node1<T> actualNode = this.root;
        while(actualNode != null){
            System.out.print(actualNode + "->");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size(){
        return this.sizeOfList;
    }
}
