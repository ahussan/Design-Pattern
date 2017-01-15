package com.company.factorypattern.factories;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class Square implements Shape {
    public void draw() {
        int x=5;
        int y=5;
        for (int i = 0; i < y; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < x - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < y - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < y; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
