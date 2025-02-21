import java.util.Scanner;
public class ClearConsole {
    public static void clear() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        String name;
        Scanner inputobj = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.print("What is your name? : ");
        name = inputobj.nextLine();
        System.out.println("Thank you " + name+"! Nice to meet you.");
        // Wait for 3 seconds (3000 milliseconds)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clear();
        System.out.println("Now lets try adding 3 integers");
    }
}