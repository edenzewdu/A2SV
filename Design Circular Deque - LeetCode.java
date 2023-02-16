class MyCircularDeque {
    Node head, rear;
    int size, k;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.head = new Node(-1);
        this.rear = head;
        this.size = 0;
        this.k = k;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        Node toInsert = new Node(value);
        toInsert.next = head.next;
        this.head.next = toInsert;
        toInsert.pre = head;
        if (toInsert.next == null) {
            this.rear = toInsert;
        } else {
            toInsert.next.pre = toInsert;
        }
        this.size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        Node toInsert = new Node(value);
        toInsert.pre = rear;
        this.rear.next = toInsert;
        this.rear = toInsert;
        this.size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        Node toDelete = head.next;
        this.head.next = toDelete.next;
        if (toDelete == rear) {
            this.rear = head;
        } else {
            toDelete.next.pre = head;
        }
        toDelete.next = null;
        toDelete.pre = null;
        this.size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        Node toDeletePre = rear.pre;
        toDeletePre.next = null;
        if (toDeletePre == head) {
            this.rear = head;
        } else {
            this.rear = toDeletePre;
        }
        this.size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        return isEmpty() ? -1 : this.head.next.value;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        return isEmpty() ? -1 : this.rear.value;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return this.size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return this.size >= this.k;
    }
}

class Node {
    int value;
    Node next;
    Node pre;
    public Node(int value) {
        this.value = value;
        this.next = null;
        this.pre = null;
    }
}