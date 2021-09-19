import java.util.Arrays;
import java.util.Scanner;

public class CreateMutiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int i = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        int j = scanner.nextInt();
        int [][] arr = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.println("Phần tử ở dòng "+ k + " "+ "cột "+ l);
                int temp = scanner.nextInt();
                arr[k][l] = temp;
            }
        }
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(arr[k][l]+", ");
            }
            System.out.println();
        }

    }
}
