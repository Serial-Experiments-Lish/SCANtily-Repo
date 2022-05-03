import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();
        
        System.out.println("Enter an integer:");
        int teger = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Enter a double:");
        double cheeseburger = Double.valueOf(scanner.nextLine());
        
        System.out.println("Enter a boolean value:");
        boolean shmoolean = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + teger);
        System.out.println("Your double is " + cheeseburger);
        System.out.println("Your boolean is " + shmoolean);
    }
}