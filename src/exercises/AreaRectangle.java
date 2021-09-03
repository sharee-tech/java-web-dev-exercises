package exercises;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle:");
        var length = input.nextDouble();
        System.out.println("What is the width of the rectangle:");
        var width = input.nextDouble();
        var area = length*width;
        System.out.println("Area of Rectangle is:"+area);

    }
}
