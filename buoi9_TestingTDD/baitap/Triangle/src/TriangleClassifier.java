public class TriangleClassifier {
    public static String triangleCheck(int a , int b , int c){
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
                return "tam giác đều";
            } else if ((a == b) || (a == c) || (b == c)) {
                return "tam giác cân";
            } else {
                return "tam giác thường";
            }
        } else {
            return "không phải là tam giác";
        }
    }
}
