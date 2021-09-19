public class AllPrimeLess100 {
    public static void main(String[] args) {
        int count = 0;
        int d = 2;
        while (d <= 100){
            boolean check = true;
            for (int i = 2; i < d; i++) {
                if(d%i ==0){
                    check = false;
                }
            }
            if(check == true){
                System.out.println(d);
            }
            d++;
        }
    }
}
