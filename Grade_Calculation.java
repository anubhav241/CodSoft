package CodSoft.Grade;

import java.util.Scanner;

public class Grade_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many subject you have: ");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for (int i = 0 ; i < marks.length ; i++){
            System.out.print("Enter mark for sub["+(i+1)+"] : ");
            marks[i] = sc.nextInt();
        }

        System.out.print("Full mark of individual subject: ");
        int full_mark = sc.nextInt();
        int full_marks = 0;
        for (int i = 0; i<size ; i++){
            full_marks += full_mark;
        }
//        System.out.println(full_marks);

        int total_marks = 0;
        for (int i = 0 ; i < marks.length ; i++){
            total_marks += marks[i];
        }
        int percentage = (total_marks/full_marks)*100;

        System.out.println("\nSo the total mark is : "+total_marks);
        System.out.println("The average percentage is : "+percentage+"%");

        if(90 < percentage && percentage <=100){
            System.out.println("And your GRADE is \'O\'");
        } else if (80 < percentage && percentage <= 90) {
            System.out.println("And your GRADE is \'A\'");
        }else if (70 < percentage && percentage <= 80) {
            System.out.println("And your GRADE is \'B\'");
        }else if (60 < percentage && percentage <= 70) {
            System.out.println("And your GRADE is \'c\'");
        }else if (50 < percentage && percentage <= 60) {
            System.out.println("And your GRADE is \'D\'");
        }else if (40 <= percentage && percentage <= 50) {
            System.out.println("ANd your GRADE is \'E\'");
        }else if ( percentage < 40) {
            System.out.println("And your GRADE is \'F\'");
        }


    }
}
