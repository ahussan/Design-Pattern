package factorypattern.factories;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class Rectangle implements Shape {
    public void draw() {
        int x=7;
        int y=4;
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
