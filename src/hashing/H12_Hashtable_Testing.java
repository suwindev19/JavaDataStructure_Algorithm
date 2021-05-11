package hashing;

public class H12_Hashtable_Testing {
    public static void main(String[] args) {
        H11_HashTable hashTable = new H11_HashTable();
        hashTable.put(1, 10);
        System.out.println();
        hashTable.put(2, 100);
        System.out.println();
        hashTable.put(3, 1000);
        System.out.println();
        hashTable.put(4, 1000);

        System.out.println(hashTable.get(3));
    }
}
