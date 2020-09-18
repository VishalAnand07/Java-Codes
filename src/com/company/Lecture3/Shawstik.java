package com.company.Lecture3;

import java.util.Scanner;

public class Shawstik {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        if (n >= 5) {
            int r = 0;
            while (r < n) {
                int c = 0;
                while (c < n) {
                    if ((r == 0 && c >= n / 2)
                            || (r == n - 1 && c <= n / 2)
                            || (c == 0 && r <= n / 2)
                            || (c == n - 1 && r >= n / 2)
                            || (c == n / 2) || (r == n / 2)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    c++;
                }
                System.out.println();
                r++;
            }
        }
    }
}