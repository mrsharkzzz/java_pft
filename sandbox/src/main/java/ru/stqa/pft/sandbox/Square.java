package ru.stqa.pft.sandbox;

public class Square {
    public double a;
    public double b;

    public Square(double a, double b){
        this.a=a;
        this.b=b;

    }

    public double area(){
        return this.a*this.b;
    }
}
