package com.company;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        try {
            while (i < 10) {
                if (i == 5) {
                    throw new RuntimeException("AAA");
                }
                i++;

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }



    }
}
