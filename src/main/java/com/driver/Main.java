package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y)
        {
            return x*y;
        }
        public int product(int x, int y, int z)
        {
            return x*y*z;
        }
        public double product(double x, double y)
        {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println(p.product(3,4));
        System.out.println(p.product(3,4,6));
        System.out.println(p.product(3.5,4.5));
    }
}