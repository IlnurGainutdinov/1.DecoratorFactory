package calculator;

//
public class Main {
    public static void main(String[] args) {
        CalculableFactory calculableFactory = new CalculableFactory();
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
