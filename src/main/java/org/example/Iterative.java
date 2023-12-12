package org.example;

public class Iterative {
    public static int fibIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        long result = fibIterative(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}
