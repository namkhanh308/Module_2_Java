public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;
        public Node(){}
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data) {
        Node temp = head;
        for(int i=0;temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = null;
    }
//    public void remove(int index){
//        Node temp = head;
//        Node holder;
//        for(int i=0; i < index-1; i++) {
//            temp = temp.next;
//        }
//        holder = temp.next.next;
//        temp.next = holder;
//    }
    public void remove(Object e){
        int index = 0;
        Node temp = head;
        while(temp != null) {
            if(temp.data == e){
                break;
            }
            index++;
            temp = temp.next;
        }
        temp = head;
        Node holder;
        for(int i=0; i < index-1; i++) {
            temp = temp.next;
        }
        holder = temp.next.next;
        temp.next = holder;
    }
    public int size(){
        int index = 0;
        Node temp = head;
        while(temp != null) {
            index++;
            temp = temp.next;
        }
        return index;
    }

    public boolean contains(Object o){
        int index = 0;
        Node temp = head;
        while(temp != null) {
            if(temp.data == o){
                return true;
            }
            index++;
            temp = temp.next;
        }
        return false;
    }
    public Object indexOf(Object o){
        int index = 0;
        Node temp = head;
        while(temp != null) {
            if(temp.data == o){
                break;
            }
            index++;
            temp = temp.next;
        }
        return index;
    }
    public void ensureCapacity(int minCapacity){
        this.numNodes = minCapacity;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
            System.out.println(i);
        }
        return temp;
    }
    public Node getFirst(){
        Node temp=head;
        return temp;
    }
    public Node getLast(){
        int index = 0;
        Node temp = head;
        while(temp != null) {
            index++;
            temp = temp.next;
        }
        return temp;
    }
    public void clear(){
        MyLinkedList newList = new MyLinkedList();
        head = newList.head;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}