package com.app.painter;

import com.app.shapes.Circle;
import com.app.shapes.ShapesEnlarger;
import com.app.shapes.Background;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(4.5f);
        c.draw();
        ShapesEnlarger.enlargeCircle(c);
        c.draw();
    }
}
