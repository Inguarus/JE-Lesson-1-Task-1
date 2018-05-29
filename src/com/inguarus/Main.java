package com.inguarus;

public class Main {

    public static void main(String[] args) {
        shapeString();

    }

    private static void shapeString() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.print("test" + ",");
            } else if (i % 3 == 0) {
                System.out.print(i + ",");
            } else if (i == 100) {
                System.out.print(" " + "test" + ".");
            } else System.out.print(" ");

        }
    }
}