package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many miles have you driven?");
        int miles = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.println("How many gallons of gas did it consume?");
        int gas = Integer.parseInt(input.nextLine());

        int mpg = miles / gas;
        System.out.println("Your miles per gallon is " + mpg);
    }

}