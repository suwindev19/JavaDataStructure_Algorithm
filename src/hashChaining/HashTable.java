package hashChaining;

public class HashTable {
    // Store reference to Hashitem
    private HashItem[] hashTable;

    public HashTable(){
        hashTable = new HashItem[Constants.TABLE_SIZE];
    }


    public void put(int key, int value){
        int hashArrayIndex = hashFunction(key);
        if(hashTable[hashArrayIndex] != null){
            System.out.println("No collision, This is simple insertion " + key);
            hashTable[hashArrayIndex] = new HashItem(key, value);
        }
        else{
            System.out.println("Collision when inserting with key "+ key);
            HashItem hashItem = hashTable[hashArrayIndex];
            while(hashItem.getNextHashItem() != null){
                System.out.println("Considering the next item in the LinkedList " + hashItem.getValue());
                hashItem = hashItem.getNextHashItem();
            }
            System.out.println("Finally we have found the place to insert!");
            hashItem.setNextHashItem(new HashItem(key, value));
        }
    }

    public int get(int key){
        int generatedArrayIndex = hashFunction(key);
        if(hashTable[generatedArrayIndex] == null){
            return -1;
        }
        else{
            HashItem hashItem = hashTable[generatedArrayIndex];
            while(hashItem != null && hashItem.getKey() != key){
                hashItem = hashItem.getNextHashItem();
            }
            if(hashItem == null){
                return -1;
            } else{
                return hashItem.getValue();
            }
        }
    }
    // Hash function to get the key
    private int hashFunction(int key){
        return key % Constants.TABLE_SIZE;
//        return 1;
    }
}
