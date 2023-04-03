import java.util.Scanner;

public class Calculator {

    double number1 = Math.random()*100;
    double number2 = Math.random()*100;
    double result;
    char operator;

    public void calculateNumbers () {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        number1 = Math.random()*100;
        number2 = Math.random()*100;
        System.out.println("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        switch (operator) {
            case '+': result = number1 + number2;
                break;
            case '-': result = number1 - number2;
                break;
            case '*': result = number1 * number2;
                break;
            case '/': result = number1/number2;
                if (number2 == 0) {
                    System.out.println("You have NullPointerException");
                }
                else
                    break;
            default:
                System.out.println("Enter correct operator");
                return;
        }
        System.out.println("The result is:" + result);
    }

    public double addition(double number1, double number2) {
        return number1+number2;
    }

    public double subtraction(double number1, double number2) {
        return number1 - number2;
    }
    public double multiplication (double number1, double number2) {
        return number1*number2;
    }
    public double division (double number1, double number2) {
        return number1/number2;
    }
}



