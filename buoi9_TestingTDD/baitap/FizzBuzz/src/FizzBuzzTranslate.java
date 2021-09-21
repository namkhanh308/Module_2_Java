public class FizzBuzzTranslate {
    public static String checkFizzBuzz(int num){
        if(num % 3 ==0 && num % 5 ==0){
            return "FizzBuzz";
        }
        else if(num % 3 == 0){
            return "Fizz";
        }
        else if(num % 5 == 0){
            return "Buzz";
        }
        else {
            String s[] = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
            String num1=String.valueOf(num);
            int a = num1.charAt(0);
            int b = num1.charAt(1);
            if(num1.length() == 1){
                return s[a-48];
            }
            else {
                return s[a-48] + " " + s[b-48];
            }
        }
    }
}
