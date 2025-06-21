package app;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stu = new Student();

        System.out.println("Digite o seu nome: ");
        stu.name = sc.nextLine();
        System.out.println("Digite suas 3 notas: ");
        stu.n1 = sc.nextDouble();
        stu.n2 = sc.nextDouble();
        stu.n3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", stu.finalGrade());

        if(stu.finalGrade() > 60.0){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.println("MISSING POINTS: " + stu.missingPoints());
        }

        sc.close();
    }
}
