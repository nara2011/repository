package nomnom;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }

        if (!Double.isNaN(result)) {
            System.out.println("Результат: " + result);
        }
    }
}