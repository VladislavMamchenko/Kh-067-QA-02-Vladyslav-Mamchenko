import java.util.Scanner;

public class Java_task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter 3 or more words separated by commas");
            String enterWords = sc.nextLine();
            String[] words = enterWords.split(",");
        boolean loop_value = true;
        do {
            System.out.println("Choose an action with an array of words and enter a number: ");
            System.out.println("1 - maximum length;");
            System.out.println("2 - start with;");
            System.out.println("3 - end with;");
            System.out.println("4 - contains;");
            System.out.println("0 - exit");
            String action = sc.nextLine();
            switch (action) {
                case "1":
                    System.out.println("You Choose 1");
                    System.out.println("Maximum length...");
                    String maxLenght = sc.nextLine();
                    try{
                        int maxLenghtParsed = Integer.parseInt(maxLenght);
                    String longestWord = words[0];
                    System.out.println("Filtered words: ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].length() <= maxLenghtParsed){
                            System.out.println(words[i]);
                        }
                         }
                    }
                    catch (NumberFormatException ex){
                        ex.printStackTrace();
                    }
                    break;
                case "2":
                    System.out.println("You Choose 2");
                    System.out.println("Start with...");
                    String startWithChar = sc.nextLine();
                    System.out.println("Filtered words: ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].startsWith(startWithChar)){
                            System.out.println(words[i]);
                        }
                    }
                    break;
                case "3":
                    System.out.println("You Choose 3");
                    System.out.println("End with...");
                    String endWithChar = sc.nextLine();
                    System.out.println("Filtered words: ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].endsWith(endWithChar)){
                            System.out.println(words[i]);
                        }
                    }
                    break;
                case "4":
                    System.out.println("You Choose 4");
                    System.out.println("Contains...");
                    String contains = sc.nextLine();
                    System.out.println("Filtered words: ");
                    for (int i = 0; i < words.length; i++) {
                        if (words[i].contains(contains)){
                            System.out.println(words[i]);
                        }
                    }
                    break;
                case "0":
                    System.out.println("You Choose 0");
                    loop_value = false;
                    break;

            }
        } while (loop_value);
    }
}
