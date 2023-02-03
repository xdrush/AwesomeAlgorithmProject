package xdrush.leetcode.others;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Reference: https://juejin.cn/post/6959192029372874759
 *
 * Implemention of LRU cache
 */
public class LRUCache {

    static class Node {
        public int key, val;
        public Node(int k, int v) {
            this.key = k;
            this.val = v;
        }
    }

    // LRU容量
    int capacity;
    HashMap<Integer, Node> map;
    LinkedList<Node> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        cache = new LinkedList<>();
    }

    public int get(int key) {
        if (!this.map.containsKey(key)) {
            return -1;
        }
        Node node = this.map.get(key);
        // 获取到元素之后，要把获取的元素排到队列的最上面
        cache.remove(node);
        cache.addFirst(node);
        return node.val;
    }

    public void put(int key, int val) {
        Node node = new Node(key, val);
        if (map.containsKey(key)) {
            cache.remove(map.get(key));
        } else if (capacity == map.size()) {
            Node last = cache.removeLast();
            map.remove(last.key);
        }

        cache.addFirst(node);
        map.put(key, node);
    }
}
