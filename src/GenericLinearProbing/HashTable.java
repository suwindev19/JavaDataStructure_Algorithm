package GenericLinearProbing;
@SuppressWarnings("unchecked")
public class HashTable <Key, Value>{
    private Key[] keys;
    private Value[] values;
    private int numOfItems;
    // Maximum capacity that can be inserted in the map
    private int capacity; // numOfItems will always be less than capacity

    public HashTable(){
        this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
        this.values = (Value[]) new Object[Constants.TABLE_SIZE];
        this.numOfItems = 0;
        this.capacity = Constants.TABLE_SIZE;
    }

    public HashTable(int newCapacity){
        this.keys= (Key[]) new Object[newCapacity];
        this.values= (Value[]) new Object[newCapacity];
        this.capacity = Constants.TABLE_SIZE;
        this.numOfItems = 0;
    }

    // O(1)
    public int size(){
        return this.numOfItems;
    }

    // O(1)
    public boolean isEmpty(){
        return this.numOfItems == 0;
    }

    public Value get(Key key){
        if(key == null) return null;
        int index = hashFunction(key);
        while(keys[index] != null){
            if(keys[index].equals(key)){
                return values[index];
            }
            index = (index+1) % capacity;
        }
        return null;
    }

    public void put(Key key, Value value){
        // cannot insert null key and null value to the table
        if(key == null || value == null) return;
        if(numOfItems >= capacity * 0.75){
            System.out.println("Doubling the size of the Hashtable");
            resize(2*capacity);
        }
        int index = hashFunction(key);
        while(keys[index] != null){
            if(keys[index].equals(key)){
                values[index] = value;
                return;
            }
            index = (index+1) % capacity;
        }
        keys[index] = key;
        values[index] = value;
        numOfItems++;
    }

    public void remove(Key key){
        if(key == null) return;
        int index = hashFunction(key);
        while(!keys[index].equals(key)){
            index = (index+1) % capacity;
        }
        keys[index] = null;
        values[index] = null;
        numOfItems--;

        // Reconstruct the table after deletion because there is a slot
        while(keys[index] != null){
            Key tempKey = keys[index];
            Value tempValue = values[index];
            keys[index] = null;
            values[index] = null;
            put(tempKey, tempValue);
            index = (index+1) % capacity;
        }
        // If the array is 33% full, resize it. Dividing the capacity by 3 is a good practice.

        if(numOfItems <= capacity /3){
            System.out.println("Resizing the able : halving the size");
            resize(capacity/2);
        }
    }

    // O(1) in best case
    private void resize(int newCapacity){
        HashTable<Key, Value> newTable = new HashTable<>(newCapacity);
        // rehashing
        for(int i = 0; i < capacity;i++){
            if(keys[i] != null){
                newTable.put(keys[i], values[i]);
            }
        }
        keys = newTable.getKeys();
        values = newTable.getValues();
        capacity = newTable.getCapacity();
    }

    //------ GETTERS AND SETTERS ------------------------
    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }

    public Value[] getValues() {
        return values;
    }

    public void setValues(Value[] values) {
        this.values = values;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int hashFunction(Key key){
        return Math.abs(key.hashCode())  % capacity; // hashCode is a java inbuilt function
    }
}
