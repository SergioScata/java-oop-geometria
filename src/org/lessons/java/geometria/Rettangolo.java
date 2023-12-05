package org.lessons.java.geometria;

public class Rettangolo {
    int height;
    int width;

    public Rettangolo(int height, int width) {
        this.height = height;
        this.width = width;
    }

    int rectanglePerimeter(){
        return 2*(height + width);
    }

    int rectangleArea(){
        return height * width;
    }

    String draw (){
        String newDraw = new String();
        for (int i = 1; i <= width; i++) {
            System.out.print("0");
        }
        System.out.println();
        for (int x = 1; x <= height - 2; x++) {
            System.out.print("0");
            for (int i = 1; i <= width - 2; i++) {
                System.out.print(" ");
            }
            System.out.println("0");
        }
        for (int i = 1; i <= width; i++) {
            System.out.print("0");
        }
        return newDraw;

    }
}
