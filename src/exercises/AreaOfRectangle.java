package exercises;
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of your rectangle?");
        int length = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.println("What is the width of your rectangle?");
        int width = Integer.parseInt(input2.nextLine());

        int area = length * width;
        System.out.println("Your rectangle has an area of " + area);
    }

}
