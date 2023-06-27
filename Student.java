package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.score;

public class Student {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                score grade = new score();
        grade.name = sc.nextLine();
        grade.score1 = sc.nextDouble();
        grade.score2 = sc.nextDouble();
        grade.score3 = sc.nextDouble();
        System.out.printf("Final grade = %.2f%n", grade.sumscore());
        if (grade.sumscore() > 60){
            System.out.println("PASS");
        }
            else{
                System.out.printf("Failed%nMISSING = %.2f POINTS", grade.missing());
            }
            sc.close();


    }
}