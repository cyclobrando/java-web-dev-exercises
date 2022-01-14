package org.launchcode.java.demos.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the radius of your circle?");
        int radius = Integer.parseInt(input.nextLine());


        double area = Math.PI * radius * radius;
        System.out.println("Your circle has an area of " + area);
    }
}
