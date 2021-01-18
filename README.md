# Java - Data Structure and Algorithms and LeetCode Problems

This repo contains the collection of java collections notes and leetcode coding challenges exercises that I am currently studying to learn more about Data Structure and Algorithms. This repo will be updated progressively.

<img src="./img/dsa.png" alt="Java Coding" width="600"/>

## Table of Contents 

The data structure and algorithms concepts and theories, and java methods, core java learnt from each week are detailed under each **_Weekly Learning Summary_**.

**Table of Contents**

```
      Bitwise Operation
      Recursion
      
```

## Bitwise Operation 

- Java data types signed two complement 
  - <img src="./img/bitwise_twoComplement.png" alt="bitwise_twoComplement" />
  
  - <img src="./img/bitwise_javaDataTypes.png" alt="bitwise_javaDataTypes" width = "400"/>
- Bitwise Operators 
  
| Bitwise Operator | Symbol | 
|---|---|
| AND | & | 
| OR | I |
|XOR | ^ |
| << | Signed left shift |
| >> | Signed right shift |
| <<< | There is no unsigned left shift in Java |
| >>> | Unsigned right shift |
- Hamming weight - count of number of set bits it contains 
- Vocabularies 
  - Set bit - 1
  - clear bit - 0
  - most significant bit - left most bit
  - least significant bit - right most bit 
- Unsigned vs Signed integer
  - Signed integer can store both positive and negative.
  - Unsigned integer can store only positive numbers 

**References**
1. Hamming weight, https://en.wikipedia.org/wiki/Hamming_weight
2. Summary of Operators, https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
3. Twos complement: Negative numbers in binary, https://www.youtube.com/watch?v=4qH4unVtJkE

## Recursion

- **Recursion :** A function calls itself directly or indirectly 
  - Direct 
  - Indirect - from another function - not common 
- **Base case :** There should be at someone , the function should stop calling itself, it is called base case.
- **Recursion basic format :** {
  - function(...)
  - base cases (one or many)
  - some code.....
  - recursive call(i.e. call for function())
  - With at least one change in parameter 
  - ....
  - }
- **Applications :** Many algorithms techniques are based on recursion. Any problems which can be solved by iteration can also be solved by recursion. They are:
  - Dynamic Programming
    - Memoisation 
    - Tabulation 
  - Backtracking 
  - Divide and Conquer
    - Binary Search
    - Quick Sort 
    - Merge sort 
  - Many problems are inheritly recursive 
    - Tower of Hanoi
    - Depth First Search based traversals(DFS of graph, Inorder, Preorder and Postorder traversal of tree)
      - Finding folders, or files in computer - DFS 

## References

- Data Structures in Java - Part I (+INTERVIEW QUESTIONS) , https://www.udemy.com/course/algorithms-and-data-structures/
- Nick White YouTube channel, https://www.youtube.com/watch?v=U6-X_QOwPcs&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-
- Kevin Naughton Jr YouTubr channel, https://www.youtube.com/c/KevinNaughtonJr/playlists
- Programming Notes, https://www3.ntu.edu.sg/home/ehchua/programming/index.html#Java

  
