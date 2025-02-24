import java.util.Scanner;

public class Main {

    //clear function
     public static void clear() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
        }
    }
    public static void timedelay(int millisec){
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String name;
        Scanner inputobj = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.print("What is your name? : ");
        name = inputobj.nextLine();
        System.out.println("Thank you " + name+"! Nice to meet you.");
        // Wait for 3 seconds (3000 milliseconds)
        timedelay(3000);
        //
        clear();
        System.out.println("Now lets try adding 3 integers OK!");
        //Wait for 2 seconds (2000 millisecons)
        timedelay(2000);
        //
        System.out.print("Please Enter num1: ");
        int num1 = inputobj.nextInt();
        System.out.print("Please Enter num2: ");
        int num2 = inputobj.nextInt();
        System.out.print("Please Enter num3: ");
        int num3 = inputobj.nextInt();
        System.out.println("your sum is : "+ (num1+num2+num3));
        timedelay(4000);
        clear();
        System.out.println("Thank you");
    }
}