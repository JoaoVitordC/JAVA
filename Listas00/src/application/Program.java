package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

            List<Employee> list = new ArrayList<>();



            System.out.println("How many employees will be registered ?");
            int N = teclado.nextInt();

            for(int i=0; i< N; i++)

                System.out.println("Employee " + (i + 1) +" : ");
                System.out.println("Id : ");
                Integer Id = teclado.nextInt();
                System.out.println("Name :");
                teclado.nextLine();
                String Name = teclado.nextLine();
                System.out.println("Salary :");
                Double Salary = teclado.nextDouble();

                Employee emp = new Employee(Id, Name, Salary);
                list.add(emp);
        teclado.close();
    }
}