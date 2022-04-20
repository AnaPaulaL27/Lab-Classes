package org.example.classes;

public class Rectangle {
        private float length;
        private float width;

    public Rectangle ( float length,  float width){
        this.length = length;
        this.width = width;
    }
    public double getArea() {

        return (this.length*this.width);
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow((length),2) + Math.pow((width),2));
    }

    public float getLength(){
        return (length);

    }

    public double getPerimeter(){
        return (2 * this.length + 2 * this.width);

    }
    public float getWidth() {
        return (this.width);
    }



}




//Math.sqrt()
//Math.pow(a,b), where a =  b= power