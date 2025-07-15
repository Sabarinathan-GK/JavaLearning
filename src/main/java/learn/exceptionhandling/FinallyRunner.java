package learn.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int[] arr = {1,3,4,4};
            System.out.println(arr[8]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(sc!=null){
                sc.close();
            }
            System.out.println("Before Scanner Close");
        }
        System.out.println("Just before closing out main");
    }
}
