package com.company.factorypattern.factories;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class Circle implements Shape {

    public void draw() {
        int posX = 5;
        int posY = 10;
        int radius = 2;

        for (int i = 0;i <= posX + radius; i++) {
            for (int j = 1;j <=posY + radius; j++) {
                int xSquared = (i - posX)*(i - posX);
                int ySquared = (j - posY)*(j - posY);
                if (Math.abs(xSquared + ySquared - radius * radius) < radius) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
