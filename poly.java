import java.util.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


class AdvancedCalculator extends Calculator {

    int add(int a, int b) {
        System.out.println("Advanced Calculator: Performing addition");
        return super.add(a, b);
    }
}

public class poly {
    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));       
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));    
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));    

        System.out.println("Sum using Advanced Calculator: " + calc.add(5, 10)); 
    }
}