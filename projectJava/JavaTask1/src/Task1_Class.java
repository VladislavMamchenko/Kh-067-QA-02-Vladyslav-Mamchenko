import java.util.Scanner;

public class Task1_Class {
    public static void main(String[] args) {
        String name;
        String adress;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where are you live, " + name +"?");
        adress = sc.nextLine();
        System.out.println(name);
        System.out.println(adress);
    }
}
