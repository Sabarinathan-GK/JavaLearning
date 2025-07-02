package learn.collectionspack;

import java.util.*;

public class StudentList {
    private int id;
    private String name;

    public StudentList(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+ " " + name;
    }
}

class StudentRunner{
    public static void main(String[] args) {
        List<StudentList> stuList = List.of(new StudentList(100,"Anand"), new StudentList(20,"Bala"),new StudentList(39,"Dinesh"));
        List<StudentList> Students = new ArrayList<>(stuList);
        System.out.println(Students);
        Collections.sort(Students,new AscStudents());
        System.out.println("Ascending Students : "+Students);
        Collections.sort(Students,new DescStudents());
        System.out.println("Descending Students : "+Students);
        Students.sort(new AscStudents());
        System.out.println("Ascending Students By Student.sort : "+Students);
        Students.sort(new DescStudents());
        System.out.println("Descending Students By Student.sort : "+Students);
    }
}
