package hashing;

public class H11_HashTable {
    private H10_HashItem[] hashTable;

    public H11_HashTable(){
        hashTable = new H10_HashItem[H9_Constants.TABLE_SIZE];
    }
    private int hashFunction(int key){
        return key % H9_Constants.TABLE_SIZE;
    }

    public void put(int key, int value){
        int hashArrayIndex = hashFunction(key);
        if (hashTable[hashArrayIndex] == null){
            System.out.println("No collision situation : Simple Insertion");
            hashTable[hashArrayIndex] = new H10_HashItem(key, value);
        } else{
            System.out.println("Collision when inserting with key " + key);
            H10_HashItem hashItem = hashTable[hashArrayIndex];
            while (hashItem.getNextHashItem() != null){
                hashItem = hashItem.getNextHashItem();
                System.out.println("Considering the next item in LinkedList " + hashItem.getValue());
            }
            System.out.println("Finally, we have found the place to insert: ");
            hashItem.setNextHashItem(new H10_HashItem(key, value));
        }
    }

    public int get(int key){
        int generatedArrayIndex = hashFunction(key);
        if (hashTable[generatedArrayIndex] == null){
            return -1;
        } else {
            H10_HashItem hashItem = hashTable[generatedArrayIndex];
            while (hashItem != null && hashItem.getKey() != key){
                hashItem = hashItem.getNextHashItem();
            }
            if (hashItem == null){
                return -1;
            }else {
                return hashItem.getValue();
            }
        }
    }
}
