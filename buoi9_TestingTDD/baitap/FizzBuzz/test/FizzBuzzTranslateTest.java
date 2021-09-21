import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void checkFizzBuzz1() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void checkFizzBuzz2() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void checkFizzBuzz3() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @org.junit.jupiter.api.Test
    void checkFizzBuzz4() {
        int number = 26;
        String expected = "hai sau";
        String result = FizzBuzzTranslate.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
}