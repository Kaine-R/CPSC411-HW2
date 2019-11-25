package com.example.cpsc411hw2;

import java.util.ArrayList;

public class StudentDB {
    private static final StudentDB ourInstance = new StudentDB();

    private ArrayList<Student> mStudentList;

    static public StudentDB getInstance() { return ourInstance;}

    private StudentDB(){createStudentObjects();}

    public ArrayList<Student> getStudentList(){return mStudentList;}

    public void setStudentList(ArrayList<Student> studentList){mStudentList = studentList;}

    protected void createStudentObjects(){

        mStudentList = new ArrayList<Student>();

        Student student = new Student("Kaine", "Rubalcava", 123456789);
        ArrayList<CourseEnrollment> courseList = new ArrayList<CourseEnrollment>();
        courseList.add(new CourseEnrollment("CPSC411", "A"));
        courseList.add(new CourseEnrollment("CPSC349", "A"));
        student.setCourseList(courseList);
        mStudentList.add(student);


        student = new Student("Cole", "McGraph", 987654321);
        courseList = new ArrayList<CourseEnrollment>();
        courseList.add(new CourseEnrollment("CPSC411", "B"));
        courseList.add(new CourseEnrollment("CPSC349", "B"));
        student.setCourseList(courseList);
        mStudentList.add(student);
    }
}

