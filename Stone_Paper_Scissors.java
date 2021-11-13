package com.company.beginer;
import java.util.Random;
import java.util.Scanner;
public class Stone_Paper_Scissors {
    static void spc(int userInput){
        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("You Win!");
        } else {
            System.out.println("Computer Win!");
        }
        // System.out.println("Computer choice: " + computerInput);
        if(computerInput==0){
            System.out.println("Computer choice: Rock");
        }
        else if(computerInput==1){
            System.out.println("Computer choice: Paper");
        }
        else{
            System.out.println("Computer choice: Scissors");
        }
    }
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        System.out.println("Enter no(Round 1): ");
        int n1 = sc.nextInt();
        spc(n1);
        System.out.println("Enter no(Round 2): ");
        int n2 = sc.nextInt();
        spc(n2);
        System.out.println("Enter no(Round 3): ");
        int n3 = sc.nextInt();
        spc(n3);
        System.out.println("Enter no(Round 4): ");
        int n4 = sc.nextInt();
        spc(n4);
        System.out.println("Enter no(Round 5): ");
        int n5 = sc.nextInt();
        spc(n5);
    }
}
