package DataStructures;

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
    
}
