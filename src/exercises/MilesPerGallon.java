package exercises;
import java.util.Scanner;


public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        Double miles = input.nextDouble();
        System.out.println("How many gallons have you used:");
        Double gallons = input.nextDouble();
        Double milesPerGallon = miles/gallons;
        System.out.println("Miles per gallon: "+milesPerGallon);
    }
}