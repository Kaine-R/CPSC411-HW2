package com.example.cpsc411__hw2.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cpsc411__hw2.R;
import com.example.cpsc411__hw2.model.CourseEnrollment;
import com.example.cpsc411__hw2.model.Student;
import com.example.cpsc411__hw2.model.StudentDB;

import java.util.ArrayList;

public class SummaryLVAdapter extends BaseAdapter {
    @Override
    public int getCount() {
        return StudentDB.getInstance().getStudents().size();
    }

    @Override
    public Object getItem(int position) {
        return StudentDB.getInstance().getStudents().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row_view;

        if (convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            row_view = inflater.inflate(R.layout.person_row, parent, false);
        } else row_view = convertView;

        final Student s = StudentDB.getInstance().getStudents().get(position);

        final TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name_id);
        final TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name_id);
        final TextView CWID = (TextView) row_view.findViewById(R.id.CWID);
        firstNameView.setText(s.getFirstName());
        lastNameView.setText(s.getLastName());
        CWID.setText(s.getCWID());
        row_view.setTag(new Integer(position));

        row_view.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                        ArrayList<com.example.cpsc411__hw2.model.CourseEnrollment> courses = s.getCourses();
                        for (int i =0; i < courses.size(); i++)
                        {
                            Toast.makeText(view.getContext(), "Course:" +
                                    courses.get(i).getCourseID().toString() + "  |  Grade: " +
                                    courses.get(i).getGrade().toString() , Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );

        return row_view;
    }
}
