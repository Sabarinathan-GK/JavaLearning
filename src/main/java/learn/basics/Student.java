package learn.basics;

public class Student {
    private String stuName;
    private int listOfMarks[];

    public Student(String name, int marks[]) {
        this.stuName = name;
        this.listOfMarks = marks;
    }

    public String getStuName() {
        return stuName;
    }

    public int[] getListOfMarks() {
        return this.listOfMarks;
    }

    public int getNumberOfMarks() {
        return this.listOfMarks.length;
    }

    public int getMaximumMark() {
        int maximum = Integer.MIN_VALUE;
        for (int mark : this.listOfMarks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getMinimumMark() {
        int minimum = Integer.MAX_VALUE;
        for (int mark : this.listOfMarks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }

    public int getTotalMark() {
        int total = 0;
        for (int marks : this.listOfMarks) {
            total = total + marks;
        }
        return total;

    }

    public double getAverageMark() {
        return getTotalMark() / getNumberOfMarks();
    }

}

