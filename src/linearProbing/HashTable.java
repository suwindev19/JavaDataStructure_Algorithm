package linearProbing;

public class HashTable {
    private HashItem[] hashtable;

    public HashTable(){
        this.hashtable = new HashItem[Constants.TABLE_SIZE];
    }

    public void put(int key, int value){
        int generatedArrayIndex = hashFunction(key);
        System.out.println("put() method called with value " + value + " - generatedIndex: " + generatedArrayIndex);
        while(hashtable[generatedArrayIndex] != null){
            generatedArrayIndex = (generatedArrayIndex+1) % Constants.TABLE_SIZE;
            System.out.println("Collision -> nextIndex " + generatedArrayIndex);
        }
        System.out.println("Inserted finally with index " + generatedArrayIndex);
        hashtable[generatedArrayIndex] = new HashItem(key, value);
    }

    public int get(int key){
        int generatedArrayIndex = hashFunction(key);
        while(hashtable[generatedArrayIndex] != null && hashtable[generatedArrayIndex].getKey() != key){
            generatedArrayIndex = (generatedArrayIndex+1)% Constants.TABLE_SIZE;
            System.out.println("Hopping to the next index " + generatedArrayIndex);
        }

        if(hashtable[generatedArrayIndex] == null){
            return -1;
        }else{
            return hashtable[generatedArrayIndex].getValue();
        }
    }

    public int hashFunction(int key){
//        return key % Constants.TABLE_SIZE;
        return 0;
    }
}
