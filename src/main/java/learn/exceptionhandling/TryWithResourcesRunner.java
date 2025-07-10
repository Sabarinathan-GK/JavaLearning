package learn.exceptionhandling;


import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int[] i = {1,2,3,4};
            System.out.println(i[6]);
        }
    }
}
