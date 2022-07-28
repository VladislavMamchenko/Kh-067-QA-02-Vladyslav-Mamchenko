import java.util.Scanner;

public class CalculatorClass {
    public static void main(String[] args) {
        boolean loopvalue = true;
            do {
                try {
                    double answerNum1;
                    double answerNum2;
                    double result;
                    String operation;

                    Scanner sc = new Scanner(System.in);
                    Scanner sc2 = new Scanner(System.in);

                    System.out.println("Type first value");
                    answerNum1 = sc.nextDouble();
                    System.out.println("Type operation");
                    operation = sc2.nextLine();
                    System.out.println("Type second value");
                    answerNum2 = sc.nextDouble();


                    switch (operation) {
                        case "+":
                            result = answerNum1 + answerNum2;
                            System.out.println("Result: " + result + "\n");
                            break;
                        case "-":
                            result = answerNum1 - answerNum2;
                            System.out.println("Result: " + result + "\n");
                            break;
                        case "*":
                            result = answerNum1 * answerNum2;
                            System.out.println("Result: " + result + "\n");
                            break;
                        case "/":
                            result = answerNum1 / answerNum2;
                            if (result == Double.POSITIVE_INFINITY ||
                                    result == Double.NEGATIVE_INFINITY)
                                throw new ArithmeticException();
                            System.out.println("Result: " + result + "\n");
                            break;
                        case "%":
                            result = answerNum1 % answerNum2;
                            System.out.println("Result: " + result + "\n");
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
