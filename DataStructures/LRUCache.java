package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {  // Least Recently Used Cache

    /*  
	
	How it works: Evicts the item that has been accessed the least recently.
	Similar to MRU?:
	Both track item usage, but LRU focuses on recency rather than frequency.
	Use case: When the least recently accessed items are more likely to be accessed again.
	Limitation: Requires more memory to store access times and may not adapt well to changing access patterns.  

	An LRU (Least Recently Used) Cache is a caching mechanism that removes the least recently used items first when the cache reaches its maximum capacity. It ensures that frequently accessed data is retained while less frequently accessed data is discarded, maintaining a balance between memory usage and access efficiency.

	How it works:
	It uses a doubly linked list and a hash map for efficient access and updates.
	When data is accessed, it is marked as recently used by moving it to the front of the list.
	
	If the cache is full, the item at the end of the list (least recently used) is evicted.

	Complexity:
		Access: 𝑂(1)
		Insertion/Update: 𝑂(1)
		Eviction: 𝑂(1)
	
     */
    public static class Node {

        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    private final int MAX_SIZE;
    private Map<Integer, Node> map = null;

    private Node head = null;
    private Node tail = null;

    public LRUCache(int capacity) {

        MAX_SIZE = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {

        if (map.containsKey(key)) {

            Node node = map.get(key);
            remove(node);
            addToHead(node);

            return node.value;
        }

        return -1;

    }

	public void set(int key, int value) {

		if(map.containsKey(key)){

			Node node = map.get(key);
            remove(node);
            addToHead(node);

			node.value = value;

		}else{

			if(map.size() == MAX_SIZE){

				Node node = tail.prev;
				remove(node);
				map.remove(node.key);

			}

			Node newNode = new Node(key, value);
			addToHead(newNode);
			map.put(key, newNode);
		}

    }

    private void addToHead(Node node) {
        
		node.next = head.next;
		node.prev = head;

		head.next.prev = node;
		head.next = node;
		
    }

    private void remove(Node node) {
        
		node.prev.next = node.next;
		node.next.prev = node.prev;

    }

	public void printCache() {

        Node current = head.next;

        while (current != tail) {

            System.out.print("[" + current.key + "-" + current.value + "] ");
            current = current.next;

        }

        System.out.println();

    }

    
    public static void main(String[] args) {

		LRUCache cache = new LRUCache(4); // Initialize the cache with a capacity of 4

        cache.set(5, 13);
        cache.set(9, 6);
        cache.set(4, 1);

        System.out.println(cache.get(4)); // Output: 1

        cache.set(6, 1);
        cache.set(8, 11); // This will evict key 5

        System.out.println(cache.get(13)); // Output: -1
        System.out.println(cache.get(1)); // Output: -1

        cache.set(12, 12); // Evicts key 9

        System.out.println(cache.get(10)); // Output: -1

        cache.set(15, 13); // Evicts key 4
        cache.set(2, 13); // Evicts key 6
        cache.set(7, 5); // Evicts key 8
        cache.set(10, 3); // Evicts key 12

        System.out.println(cache.get(6)); // Output: -1
        System.out.println(cache.get(10)); // Output: 3

        cache.set(15, 14); // Updates key 15
        cache.set(5, 12); // Updates key 5

        System.out.println(cache.get(5)); // Output: 12
        System.out.println(cache.get(7)); // Output: 5
        System.out.println(cache.get(15)); // Output: 14
        System.out.println(cache.get(5)); // Output: 12

        cache.printCache(); // Print the current state of the cache

    }

}
