package calculator;

import java.util.Scanner;

public class ViewCalculator {

    private CalculableFactory calculableFactory;

    public ViewCalculator(CalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        Calculator complex1;
        Calculator complex2;
        Calculator complex3;
        float a;
        float b;
        int choice = 0;

        System.out.println("\n==========================");
        while(choice != 5){
            System.out.println("\nВыберете действие\n");
            System.out.println("1: Сумма");
            System.out.println("2: Вычитание");
            System.out.println("3: Умножение");
            System.out.println("4: Деление");
            System.out.println("5: Выход\n");
            choice = input.nextInt();
            //Сумма
            if(choice == 1){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("(a + bi) + (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Calculator(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите:");
                b = input.nextFloat();
                complex2 = new Calculator(a, b);
                complex3 = (Calculator) complex1.sum(complex2);
                System.out.println("Ответ: " + complex3.getResult());
            }
            //Разность
            if(choice == 2){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("(a + bi) - (c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Calculator(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new Calculator(a, b);
                complex3 = (Calculator) complex1.subtract(complex2);
                System.out.println("Ответ: " + complex3.getResult());
            }
            //Умножение
            if(choice == 3){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("(a + bi)(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Calculator(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new Calculator(a, b);
                complex3 = (Calculator) complex1.multi(complex2);
                System.out.println("Ответ: " + complex3.getResult());
            }
            //Деление
            if(choice == 4){
                System.out.println("\ni = (-1)^1/2,\n");
                System.out.println("(a + bi)/(c + di)\n");
                System.out.println("Введите a:");
                a = input.nextFloat();
                System.out.println("Введите b:");
                b = input.nextFloat();
                complex1 = new Calculator(a, b);
                System.out.println("Введите c:");
                a = input.nextFloat();
                System.out.println("Введите d:");
                b = input.nextFloat();
                complex2 = new Calculator(a, b);
                complex3 = (Calculator) complex1.divide(complex2);
                System.out.println("Ответ: " + complex3.getResult());
            }
        }
        System.out.println("\nДо свидания!\n");
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
