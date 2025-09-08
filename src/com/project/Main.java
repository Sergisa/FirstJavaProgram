package com.project;

import com.project.geometry.Circle;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(fact(3));
        Circle c = new Circle(4,5,4);
        System.out.println(c.getArea());

    }

    public static int fact(int x) {
        return (x != 0) ? x * (x - 1) : 1;
    }
}