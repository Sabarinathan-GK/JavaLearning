package learn.basics;

public class StudentRunner {

    public static void main(String[] args) {
        int[] marks = { 98, 98, 96, 98, 87 };
        Student student = new Student("Billa", marks);
        int numberOfMarks = student.getNumberOfMarks();
        System.out.println("The Number of Marks is : " + numberOfMarks);
        int sum = student.getTotalMark();
        System.out.println("The Total Number of Mark is: " + sum);
        double aver = student.getAverageMark();
        System.out.println("Average of the Marks: " + aver);
        int maxi = student.getMaximumMark();
        System.out.println("The Maximum Marks is: " + maxi);
        int mini = student.getMinimumMark();
        System.out.println("The Minimum Marks is: " + mini);

    }

}
