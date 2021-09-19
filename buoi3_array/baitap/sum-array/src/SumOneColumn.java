import java.util.Scanner;

public class SumOneColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My chose column is: ");
        int j = scanner.nextInt();
        int [][]a = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,23,1,56,33},
        };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+= a[i][j];
        }
        System.out.println(sum);
    }
}
