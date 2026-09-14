class MyLinkedList {

    private class Node{

        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public MyLinkedList() {

        head = null;
        size = 0;
        
    }
    
    public int get(int index) {

        if(index < 0 || index >= size){
        
            return -1;
        }
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
        
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
        
    }
    
    public void addAtTail(int val) {

        addAtIndex(size, val);
        
    }
    
    public void addAtIndex(int index, int val) {

        Node newNode = new Node(val);

        if(index < 0 || index > size){

            return;
        }

        // if insert at the index 0, beginning
        if(index == 0){
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        // start from the head
        Node current = head;

        // move to the node just before the required index
        for(int i = 0; i < index - 1; i++){

           current = current.next;
       }
        // connect new node to the next node
        newNode.next = current.next;
        // connect current node to new node
        current.next = newNode;
        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        
        if(index < 0 || index >= size){

            return;
        }
        // empty list
        if(head == null){
            return;
        }
        // only head/single node
        if(index == 0){

            head = head.next;
            size--;
            return;
        }

        Node current = head;
        for(int i = 0; i < index - 1; i++){
            current = current.next;
        }

        current.next = current.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */