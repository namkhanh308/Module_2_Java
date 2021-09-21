public class Test {
    public static void main(String[] args) {
        int num = 21;
        String s[] = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        String num1= String.valueOf(num);
        System.out.println(num1.charAt(0));
        int a = num1.charAt(0);
        int b = num1.charAt(1);
        if(num1.length() == 1){
            System.out.println(s[a-48]);
        }
        else {
            System.out.println(s[a-48] + " " + s[b-48]);
        }
    }
}
