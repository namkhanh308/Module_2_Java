import java.util.ArrayList;
import java.util.List;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(3, 4);
        listInteger.add(4, 5);
        listInteger.add(2, 100);

        System.out.println(listInteger.get(1));
//        for (Object x : listInteger.elements) {
//            System.out.println(x);
//        }
        listInteger.clear();
        System.out.println(listInteger.size());
    }
}
