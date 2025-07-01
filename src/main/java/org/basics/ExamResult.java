package org.basics;

public class ExamResult {
    public static boolean isPass(int marks) {

        // Update Code : If the student's marks are greater than 50, they have passed
        // the exam.
        if (marks > 50 && marks <= 100) {
            return true;
        }
        return false;
    }

    public static boolean isPass1(int marks) {

        // Update Code : If the student's marks are greater than 50, they have passed
        // the exam.
        return marks > 50;
    }

    public static void main(String[] args) {
        System.out.println(ExamResult.isPass(50));
    }

}
