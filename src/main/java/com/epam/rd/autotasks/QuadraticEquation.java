package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D;
        double x1;
        double x2;
        double x;

        D = Math.pow(b, 2) - 4*a*c;
        if (D>0) {
            x1 = (-b + Math.sqrt(D))/(2*a);
            x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println(x1 + " " + x2);
        } else if (D==0) {
            x = (-b + Math.sqrt(D))/(2*a);
            System.out.println(x);
        } else {
            System.out.println("no roots");
        }
    }

}