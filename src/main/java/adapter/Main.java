package adapter;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new CalculatorAdapter();
        System.out.println(intsCalc.sum(2, 7));
        System.out.println(intsCalc.sum(10, 42));
        System.out.println(intsCalc.pow(2, 100));
    }
}