import java.util.Scanner;

public class CalculatorClass {
    public static void main(String[] args) {
        boolean loopvalue = true;
            do {
                try {
                    double num1;
                    double num2;
                    double x;
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
                            System.out.println("Result: " + x + "\n");
                            break;
                        case "-":
                            x = num1 - num2;
                            System.out.println("Result: " + x + "\n");
                            break;
                        case "*":
                            x = num1 * num2;
                            System.out.println("Result: " + x + "\n");
                            break;
                        case "/":
                            x = num1 / num2;
                            if (x == Double.POSITIVE_INFINITY ||
                                    x == Double.NEGATIVE_INFINITY)
                                throw new ArithmeticException();
                            System.out.println("Result: " + x + "\n");
                            break;
                        case "%":
                            x = num1 % num2;
                            System.out.println("Result: " + x + "\n");
                            break;
                        default:
                            System.out.println("Calculator does not support this operation \n");
                            break;

                    }

                }
                catch (ArithmeticException ae) {
                    System.out.println("Arithmetic error! \n");
                }
                catch (Exception e) {
                    System.out.println("Input is wrong! \n");

                }

            }

            while (loopvalue=true);


}}
