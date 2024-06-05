public class Calculator {
    
    // An application that creates calculator.

    public Calculator() {

    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
     
        Calculator myCalculator = new Calculator();
        
        int add = myCalculator.add(5, 7);
        System.out.println(add);

        int subtract = myCalculator.subtract(45,11);
        System.out.println(subtract);
     
    }
}