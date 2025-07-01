package org.oopspackage.inheritance;

public class Student extends Person {
    private String college;
    private String degree;

    public Student(String Name, String college) {
        super(Name);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}

