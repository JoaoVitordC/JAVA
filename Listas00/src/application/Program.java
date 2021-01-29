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

            for(int i=0; i< N; i++) {

                System.out.println("Employee " + (i + 1) + " : ");
                System.out.println("Id : ");
                Integer Id = teclado.nextInt();
                System.out.println("Name :");
                teclado.nextLine();
                String Name = teclado.nextLine();
                System.out.println("Salary :");
                Double Salary = teclado.nextDouble();


                Employee emp = new Employee(Id, Name, Salary);
                list.add(emp);
            }
        System.out.println("Enter the Employee id that will increase : ");
            int Idslry = teclado.nextInt();
            Integer position = hasId(list, Idslry);
            if(position == null) {
                System.out.println("This Id dosen't exist");
            }
            else {
                System.out.println("Enter the percentege :");
                double percent = teclado.nextDouble();
                list.get(position).increaseSalary(percent);
            }
                System.out.println();
                System.out.println("Lit of employees: ");
                for(Employee emp: list ){
                    System.out.println(emp);
                }

        teclado.close();
    }
    public static Integer hasId(List<Employee> list, int id){
        for ( int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id ) {
                return i;
            }
        }
        return null;
    }
}