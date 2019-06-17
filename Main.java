package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        double rad = r.nextDouble();
        Circle newCircle = new Circle(10, 12, rad);
        double perim = newCircle.getPerimetr();
        System.out.println("The perimeter of you circle - " + perim);
    }

}

