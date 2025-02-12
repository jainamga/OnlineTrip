package com.yrrhelp.controllers;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            try {
                System.out.println(arr[5]); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e.getMessage());
            }

            String str = null;
            try {
                System.out.println(str.length()); 
            } catch (NullPointerException e) {
                System.out.println("Null pointer exception: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("General exception caught: " + e.getMessage());
        }
    }
}
