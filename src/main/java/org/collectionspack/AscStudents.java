package org.collectionspack;

import java.util.Comparator;

public class AscStudents implements Comparator<StudentList> {

    @Override
    public int compare(StudentList o1, StudentList o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
