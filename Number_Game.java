package CodSoft.Number;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void random(){
        Scanner sc = new Scanner(System.in);
        //Instance of Random class
        Random rand = new Random();
        //Generating random integers in range 1 to 100
        int rand_num = rand.nextInt(100) + 1;

        System.out.println("Number generated successfully...!! ");
        System.out.println("Guess limit upto 10 Times\n");

        int i = 0;
        while (i < 10) {
            System.out.print("Guess... What is the number: ");
            int num = sc.nextInt();
            if (num < rand_num) {
                System.out.println("Sorry,Too low");
            }else if (num > rand_num) {
                System.out.println("Sorry,Too High");
            }else if (num == rand_num) {
                System.out.println("\nHurry UP, Your guess is Prefect!!! \n....>>>>.... WIN ....<<<<....");
                i++;
                break;
            }
            i++;
            if (i == 10) {
                System.out.println("\nSORRY!!! You already achieve your limit of guess");
            }
        }
        System.out.println("And your number of attempts: " + i);
        int score = ((10-i)/10)*100;
        System.out.println("So your score is " + score + "%");
    }
    public static void main(String[] args) {
        //Instance of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you ready to start (Y/N): ");
        String choice = sc.next() ;
        while (Objects.equals(choice, "Y") || Objects.equals(choice, "y")) {
            random();
            System.out.print("\nWould you want to play again for next round(Y/N): ");
            choice = sc.next();
//            System.out.println(choice);
            if (Objects.equals(choice, "n") || Objects.equals(choice, "N")) {
                System.out.print("\nThanks for playing.......... ");
               break;
            }
        }
        if(Objects.equals(choice, "n") || Objects.equals(choice, "N")){
            System.out.print("\nThanks for choosing us.......... See you again............. ");
        }


    }
}
