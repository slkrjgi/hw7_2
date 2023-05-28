public class Simple extends  Calculator {

    private double result;

    public double Add (double a, double b) {
        result = a + b;
        return result;
    }

    public double Substract (double a, double b) {
        return a - b;
    }

    public double Multiply (double a, double b) {
        return a * b;
    }

    public double Divide (double a, double b) {
        return a / b;
    }
}
