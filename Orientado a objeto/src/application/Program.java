package application;

import OO.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        Locale.setDefault(Locale.US);
        Scanner KeyBoard = new Scanner(System.in);
        System.out.println("Enter the measures of triangle x");
        x.A = KeyBoard.nextDouble();
        x.B = KeyBoard.nextDouble();
        x.C = KeyBoard.nextDouble();

        System.out.println("Enter the measures of triangle y");
        y.A = KeyBoard.nextDouble();
        y.B = KeyBoard.nextDouble();
        y.C = KeyBoard.nextDouble();

        double p =(x.A + x.B+ x.C) / 2.0;
        double areaX = Math.sqrt(p*(p-x.A) * (p - x.B) * (p-x.C));
        p =(y.A + y.B+ y.C) / 2.0;
        double areaY = Math.sqrt(p*(p-y.A) * (p - y.B) * (p-y.C));


        System.out.printf("Triangle X area: %.4f%n" , areaX);
        System.out.printf("Triangle Y area: %.4f%n" , areaY);

        if (areaX>areaY){
            System.out.printf("Larger area is: " , areaX);
        } else {
            System.out.printf("Larger area is: " , areaY);
        }

        KeyBoard.close();
    }
}
