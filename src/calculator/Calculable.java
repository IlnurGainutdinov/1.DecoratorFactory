package calculator;

public interface Calculable {


    Calculable sum(Calculator otherNumber);

    Calculable multi(Calculator otherNumber);

    Calculable subtract(Calculator otherNumber);

    Calculable divide(Calculator otherNumber);

    String getResult();
}
