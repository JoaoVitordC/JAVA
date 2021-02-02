package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        Products product = new Products();
        System.out.println("Enter the product data: ");
        System.out.println("Name");
        product.name = sc.nextLine();
        System.out.println("Enter the price: ");
        product.price =sc.nextDouble();
        System.out.println("Enter thee quantity :");
        product.quantity=sc.nextInt();
        sc.close();


    }
}
