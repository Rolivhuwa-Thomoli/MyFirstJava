import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        Scanner inputobj = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.print("What is your name? : ");
        name = inputobj.nextLine();
        System.out.println("Thank you " + name+"! Nice to meet you.");
    }
}