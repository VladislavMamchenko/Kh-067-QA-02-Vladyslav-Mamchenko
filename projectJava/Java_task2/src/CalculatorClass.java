import java.util.Scanner;

public class CalculatorClass {
    public static void main(String[] args) {
        try {
            double answerNum1
            double answerNum2;
            double result;
            String operation;

            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);

            System.out.println("Type first value");
            num1 = sc.nextDouble();
            System.out.println("Type operation");
            operation = sc2.nextLine();
            System.out.println("Type second value");
            num2 = sc.nextDouble();

            switch (operation) {
                case "+":
                    x = num1 + num2;
                    System.out.println(x);
                    break;
                case "-":
                    x = num1 - num2;
                    System.out.println(x);
                    break;
                case "*":
                    x = num1 * num2;
                    System.out.println(x);
                    break;
                case "/":
                    x = num1 / num2;
                    System.out.println(x);
                    break;
                case "%":
                    x = num1 % num2;
                    System.out.println(x);
                    break;
                default:
                    System.out.println("Calculator does not support this operation");
                    break;
            }
        }
        catch (Exception e) {
            System.out.println("Input is wrong!");
        }
    }
}
