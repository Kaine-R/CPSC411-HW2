package com.example.cpsc411__hw2.model;

import java.util.ArrayList;

public class Student {
    protected String mFirstName;
    protected String mLastName;
    protected String mCWID;
    protected ArrayList<com.example.cpsc411__hw2.model.CourseEnrollment> mCourses;

    public Student(String firstName, String lastName, String CWID) {
        mFirstName = firstName;
        mLastName = lastName;
        mCWID = CWID;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public ArrayList<com.example.cpsc411__hw2.model.CourseEnrollment> getCourses() {
        return mCourses;
    }

    public void setCourses(ArrayList<com.example.cpsc411__hw2.model.CourseEnrollment> courses) {
        mCourses = courses;
    }

    public String getCWID() {
        return mCWID;
    }

    public void setCWID(String CWID) {
        mCWID = CWID;
    }
}
