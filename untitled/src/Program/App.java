package Program;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o número de aluno: ");
        int n = sc.nextInt();


         Aluno[] alunos = new Aluno[n];
        for(int i = 0; i< alunos.length ;i++ ) {
            System.out.println();
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println();
            System.out.println("E-mail: ");
            String eMail = sc.next();
            System.out.println();
            System.out.println("Quarto: ");
            Integer room = sc.nextInt();
            System.out.println();
            System.out.println("Preço: ");
            Double price = sc.nextDouble();
            System.out.println();
            alunos[i] = new Aluno(name, eMail ,room, price );


        }
        for(Aluno a : alunos){
            System.out.print(alunos);
        }

        sc.close();
    }



}
