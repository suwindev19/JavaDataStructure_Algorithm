package hashing;

import java.util.Scanner;
import java.io.*;

/*
        Open Addressing
        ================

        1. Use single arrays only , not to form any form of any other data structure
        2. Requirements
            no. of slots in Hash table >= no. of keys to be inserted
            It is cache friendly
            Hash(key) = key % 7
        3. Multiple way of implementing open addressing
            (i) Linear probing
            (ii) Quadratic probing
            (iii) Double hashing
        4. Linear probing Example
            50, 51, 49, 16, 56, 15, 19
            Divide them by 7
            hash(key) = key % 7

            linearly search for the next empty slot and put it in that slot.

            49 % 7 = 0, therefore, goes to 0 slot
            7 slots
            when collision happens, use linear probing
            0   49
            1   50
            2   51
            3   16
            4   56
            5   15
            6   19

            If the last slot is occupied, it goes back to the first slot and search again.

            48, 42, 50, 55, 53
            0   42
            1   50
            2   55
            3
            4   53
            5
            6   48

            How to handle deletion in open addressing?

            insert(50)
            insert(51)
            insert(15)
            search(15)
            delete(15)
            search(15)

            Search the key
                - find the hash function.
                - go to the slot. If you cannot find it in that slot, then linearly search
                    - if you find 15, stop the search and return true.
                    - if you cannot find the value you are looking for
                        empty slot, then stop
                        if you go through all the slots in the table and then come back to the original slot, then you stop.
                    - search
                        Computer hash function
                        Go to that index and compare the value
                        If you find the key, stop search. return true or corresponding value
                        else
                            consider three cases
                                empty slot
                                key found
                                traverse through the whole table and then come back to the original slot



             Delete the key
             Issues with simply making the slot empty when we delete
                Search for the key and mark the slot as deleted.
                Stop the search only when you see the empty slot
                Insert can be done at the deleted slot

 Clustering (Problem with linear probing and open addressing)
        hash(key, i) = (h(key) + i ) % 7
        h(key) = key % 7
    - one collision, cluster will keep growing
    - impact the performance of linear probing

    To solve this problem,
        1. Quadratic probing
        hash(key, i) = (h(key) + l^2) % m

        2. Double hashing
        hash(key, i) = (h1(key) + i*h2(key)) % m


Double Hashing
    hash(key, i) = (h1(key) + ih2(key)) % m
    if h2(key) is relatively prime to m, then it always find a free slot if there is one
    Distributs keys more uniformly than linear probing and quadratic hashing
    no clustering


Open Addressing
    hash(key, i) = (h1(key) + ih2(key)) % m
    49, 63, 56, 52, 54, 48
    m = 7
    h1(key) = key % 7
    h2(key) = 6 - (key %6)      //hash2 function should never be 0

    49 = 49 % 7 = 0
    63 = 63 % 7 = 0, therefore use h2 key
        = 6 - (63 % 6) = 6 - 3 = 3
    56 = 56 % 7 = 8
        = 6 - (56 % 6) = 6 - 2 = 4
    52 = 52 % 7 = 3
        (3 + 2) % 7 = 5
    54 = h1 = 54 % 7 = 5
        h2 = 6 - (54 % 6) = 6 - 6 = 0
        (5 + 6 * 2)% 7 = 3
        (5 + 6 * 3 ) % 7 = 2 , free slot
    48 = 48 % 7 = 6

    0   49
    1
    2   54
    3   63
    4   56
    5   52
    6   48


    h2 and m should be relatively prime
    -----------------------------------
    h2(key) = 6

    1. (1 x 6) % 7 = 6
    2. (2 x 6) % 7 = 5
    3. (3 x 6) % 7 = 4
    4. (4 x 6) % 7 = 3
    5. (5 x 6) % 7 = 3
    6. (6 x 6) % 7 = 1

    void doubleHashing(key)
        if (table is full)
            return error
        probe = h1(key), offset = h2(key) // linear probing, offset is 1.
        while(table[probe] is occupied)
            probe = (probe + offset) % m;
        table[probe] = key;

    Performance Analysis of search
     alpha = n/m (should be <= 1)
     Assumption: Every probe, sequence looks at a random location
     (i - alpha) fraction of the table is empty 


 */
public class H2_Open_Addressing {
    public static void main(String[] args) {

    }
}

