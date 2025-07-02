package learn.collectionspack;

import java.util.Comparator;

public class DescStudents implements Comparator<StudentList> {

    @Override
    public int compare(StudentList o1, StudentList o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}