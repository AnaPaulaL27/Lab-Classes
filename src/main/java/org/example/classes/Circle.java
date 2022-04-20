package org.example.classes;

public class Circle {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getCircumference() {
        //return statement is equal to
        return (this.radius * this.radius * Math.PI);
    }
    public double getRadius(){
        return (radius);
    }

}





