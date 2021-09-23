public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(10);

        ll.add(4,9);
        ll.add(3,3);
        ll.add(1,6);
        ll.addLast(20);
        ll.printList();
        System.out.println("--");
        System.out.println(ll.size());
        System.out.println("--");
        ll.remove(20);
        ll.printList();
        ll.clear();
        System.out.println("--");
        ll.printList();
    }
}