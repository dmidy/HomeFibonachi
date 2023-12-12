package org.example;

public class Dynamic {
    public static int fibDynamic(int n) {
        int[] fib = new int[n + 1];
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

        public static void main(String[] args) {
            int n = 6;
            long result = fibDynamic(n);
            System.out.println("Fibonacci(" + n + ") = " + result);
        }
}