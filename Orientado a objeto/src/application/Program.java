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

        double areaX = x.area();
        double areaY = x.area();


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
