public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
//        ll.addFirst(11);
//        ll.addFirst(12);
//        ll.addFirst(13);
//
//        ll.add(4,9);
        ll.add(3,3);
        ll.add(1,6);
        ll.get(2);
        ll.printList();
    }
}