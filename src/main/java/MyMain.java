import java.util.Scanner;

public class MyMain {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scan.next();
        System.out.println("Hello, " + name + "! It's nice to meet you!");
        // System.out.print("What kind of music do you listen to? ");
        // String music = scan.next();
        // System.out.println("Cool. I like " + music + " music too.");
        // System.out.print("What did you eat for breakfast today? ");
        // String breakfast = scan.next();
        // System.out.println(breakfast + " sound good!");
        // System.out.print("What is your favorite plant? ");
        // String plant = scan.next();
        // System.out.println(plant + "s are very pretty!");
        // System.out.print("What is your favorite day of the week? ");
        // String day = scan.next();
        // System.out.println(day + "s are so relaxing.");
        scan.close();
    }
}
