import java.util.Scanner;

public class drawTriangle {
    public static void main(String[] args) {
        int temp = 1;
        while(temp !=0){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("You chose: " + choose);
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("You chose: " + choose);
                    for(int i=1; i<=5; i++){
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("You chose: " + choose);
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("You chose: " + choose);
                    temp = 0 ;
                    break;
                default:
                    System.out.println("No value");
                    break;
            }
        }
    }
}
