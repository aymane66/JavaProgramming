
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String valueStr = scan.nextLine();
        
        System.out.println("Give an integer:");
        int valueInt = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        double valueDoub = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        boolean valueBool = Boolean.valueOf(scan.nextLine());
        
        
        System.out.println("You gave the string " + valueStr);
        System.out.println("You gave the integer " + valueInt);
        System.out.println("You gave the double " + valueDoub);
        System.out.println("You gave the boolean " + valueBool);

        
    }
}
