package demo;

public class Calculator {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        if (y == 0) {
            System.out.println("Error");
            return Double.NaN;
        }
        return (double) x / y;
    }

}
