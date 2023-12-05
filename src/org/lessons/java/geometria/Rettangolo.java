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


}
