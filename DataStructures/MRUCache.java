package DataStructures;

public class MRUCache {  // Most Recently Used Cache

    /*  
    
    How it works: Evicts the item that has been accessed the most recently.
    Similar to LFU?:
    Both track item usage, but LRU focuses on recency rather than frequency.
    Use case: When the most recently accessed items are more likely to be accessed again.
    Limitation: Requires more memory to store access times and may not adapt well to changing access patterns. 
    
    How it works: Evicts the most recently accessed item.
    Similar to LRU?:
    It is the opposite of LRU, targeting the most recently used item instead of the least.
    Use case: When the most recently used data becomes irrelevant quickly, such as in multimedia streaming.
    Limitation: Ineffective for general-purpose caching.

    
    */
    
}
