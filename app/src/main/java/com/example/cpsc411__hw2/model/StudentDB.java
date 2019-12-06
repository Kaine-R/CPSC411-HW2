package com.example.cpsc411__hw2.model;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    protected ArrayList<com.example.cpsc411__hw2.model.Student> mStudents;

    static public StudentDB getInstance() {
        return ourInstance;
    }

    private StudentDB() {
    }

    public ArrayList<com.example.cpsc411__hw2.model.Student> getStudents() {
        return mStudents;
    }

    public void setStudents(ArrayList<com.example.cpsc411__hw2.model.Student> students) {
        mStudents = students;
    }

    public void addStudent(com.example.cpsc411__hw2.model.Student student){
        mStudents.add(student);
    }
}
