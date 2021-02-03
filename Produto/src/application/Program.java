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
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Enter the price: ");
        product.price =sc.nextDouble();
        System.out.println("Quantity in the stock:");
        product.quantity=sc.nextInt();
        System.out.println();
        System.out.println("product data: " + product);

        System.out.println("Enter the number of products to be added in stock");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed in stock");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.println("Updated data: " + product);
        sc.close();



    }
}
