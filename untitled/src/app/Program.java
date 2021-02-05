package app;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle retangulo = new Triangle();
        System.out.println("Enter the with and height");
        retangulo.width = sc.nextDouble();
        retangulo.height = sc.nextDouble();

        System.out.printf("Area: %2.f%n ", retangulo.area());
        System.out.printf("Perimeter: %2.f%n ", retangulo.perimeter());
        System.out.printf("Diagonal: %2.f%n ", retangulo.diagonal());


        sc.close();
    }


}
