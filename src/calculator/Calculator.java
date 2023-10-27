package calculator;

public final class Calculator implements Calculable {
    private float a;
    private float b;
    private float newA;
    private float newB;
    Calculator newCalculator;

    public Calculator(float _a, float _b) {
        this.a = _a;
        this.b = _b;
    }

    public Calculator() {
        
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    @Override
    public Calculable sum(Calculator otherNumber) {
        newA = a + otherNumber.getA();
        newB = b + otherNumber.getB();
        newCalculator = new Calculator(newA, newB);
        return newCalculator;
    }


    @Override
    public Calculable multi(Calculator otherNumber) {
        newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        newCalculator = new Calculator(newA, newB);
        return newCalculator;
    }

    @Override
    public Calculable subtract(Calculator otherNumber) {
        newA = a - otherNumber.getA();
        newB = b - otherNumber.getB();
        newCalculator = new Calculator(newA, newB);
        return newCalculator;
    }

    @Override
    public Calculable divide(Calculator otherNumber) {
        newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newCalculator = new Calculator(newA, newB);
        return newCalculator;
    }

    @Override
    public String getResult() {
        return "(" + a + ") + (" + b + ")i";
    }


}
