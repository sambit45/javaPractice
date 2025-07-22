import java.util.*;

public class Main {

    static class Node {
        String key;
        Node prev, next;

        Node(String key) {
            this.key = key;
        }
    }

    static class CustomLRU {
        private final int capacity;
        private final Map<String, Node> map;
        private final Node head, tail;

        public CustomLRU(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();

            // Dummy nodes
            head = new Node("");
            tail = new Node("");
            head.next = tail;
            tail.prev = head;
        }

        public void put(String key) {
            if (map.containsKey(key)) {
                remove(map.get(key));
            } else if (map.size() == capacity) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key);
            insertToFront(newNode);
            map.put(key, newNode);
        }

        private void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insertToFront(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        public String[] getContents() {
            List<String> result = new ArrayList<>();
            Node curr = head.next;
            while (curr != tail) {
                result.add(curr.key);
                curr = curr.next;
            }
            return result.toArray(new String[0]);
        }
    }

    public static String[] LRUCache(String[] strArr) {
        CustomLRU lru = new CustomLRU(5);
        for (String ch : strArr) {
            lru.put(ch);
        }
        return lru.getContents();
    }

    public static void main(String[] args) {
        String[] input = {"A", "B", "C", "D", "A", "E", "D", "Z"};
        System.out.println(Arrays.toString(LRUCache(input)));
        // Output: [Z, D, E, A, C]
    }
}
