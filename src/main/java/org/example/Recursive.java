package org.example;

public class Recursive {
    public static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 9;
        long result = fibRecursive(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}