import java.util.Arrays;
import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        int []array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        int max = array[0];
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]> max){
                max =array[i];
                pos = i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + pos);
    }
}
