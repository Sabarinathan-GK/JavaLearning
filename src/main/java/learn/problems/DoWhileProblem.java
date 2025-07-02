package learn.problems;

import java.util.Scanner;

public class DoWhileProblem {
    public static void cubeUntilNegativeInput(){
        Scanner sc = new Scanner(System.in);
        int input = -1;
        do{
            if(input != -1){
                System.out.println("Cube is "+ input * input * input);
            }
            System.out.println("Enter the number :");
            input = sc.nextInt();
        }while( input >= 0);
        System.out.println("Thank You! Have Fun!");
    }

    public static void main(String[] args) {
        DoWhileProblem.cubeUntilNegativeInput();
    }
}
