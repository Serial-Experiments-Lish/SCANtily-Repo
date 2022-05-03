import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there!  How are you doing today?");
        String response = scanner.nextLine();
        System.out.println("Wow - Interesting!  Tell me more about yourself!");
        response = scanner.nextLine();
        System.out.println("Gnarly, my dude/my dudette/my non-dudinary individual!  Keep shreddin' sweet gnar! ;) ");
    }
}