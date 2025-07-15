package learn.exceptionhandling;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionHandlePuzzle {
    public static void main(String[] args) throws SQLException, InterruptedException {
        method2();
    }

    private static void method2() throws SQLException, InterruptedException {
        //Connection con = new Connection();
        Scanner scn = new Scanner(System.in);
        try{
            String str = null;
            str.toString();
            return;
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            scn.close();
        }

    }
}
