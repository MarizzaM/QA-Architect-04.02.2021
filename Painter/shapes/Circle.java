package com.app.shapes;

public class Circle {
    Background background;
    private double radius;

    public Circle(double _radius)  // I wrote it for you... <- Thanks (^_^)
    {
        radius = _radius;
        background = new Background("Black", 0.99f);
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return background.color;
    }

    void enlarge(double scale){
        radius *= scale;
    }

    public void draw() // I wrote it for you <- Thanks (^_^)
    {
        System.out.println(String.format("Drawing the circle with %.2f radius in color: %s", radius, background));
    }

}
