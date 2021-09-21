import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {


    @org.junit.jupiter.api.Test
    void triangleCheck0() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.triangleCheck(a,b,c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void triangleCheck1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.triangleCheck(a,b,c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void triangleCheck2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.triangleCheck(a,b,c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void triangleCheck3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.triangleCheck(a,b,c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void triangleCheck4() {
        int a = -1	;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.triangleCheck(a,b,c);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void triangleCheck5() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.triangleCheck(a,b,c);
        assertEquals(expected, result);
    }



}