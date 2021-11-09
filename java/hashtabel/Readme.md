# Hash Table Implementation

A hash table is a data structure and it is an array of list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method

## Challenge

Implement a Hashtable Clas

## API

* `add(K key, V value)`: add the key and value pair to the table.

* `get(K key)`: Returns value associated with that key in the table

* `contains`: Returns boolean, indicating if the key exists in the table already.

* `remove(K key)`: remove the value from the table based on the key.

* `isEmpty()`: check the hash table is empty or not.



# hashmap-repeated-word challenge 31

Write a function that accepted a string parameter which  finds the first word to occur more than once in a string and return a string.

## Whiteboard Process

![](code-challeng-31.png)


# hashmap-tree-intersection challenge 32

Create a method that takes two binary trees as a parameter and return an array of nodes that are similar in two trees.

## Whiteboard Process

![hashmap-tree-intersection](code-challeng-32.png)



# Hashmap LEFT JOIN challenge 33

Implement a simplified LEFT JOIN for 2 Hashmaps.

## Challenge

Write a method called `leftJoin` accepts two hash maps as a parameters and return a single data structure. It will add the first hash map to the list and then loop through second hash map to check if the key is in the list, if it exist in the list it will add the value of the key to the same key in the list.

## Whiteboard

![leftJoin](code-challeng-33.png)

## Approach and Efficiency

* Time: O(n)

* Space: O(n)

