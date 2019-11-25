package com.example.cpsc411hw2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cpsc411hw2.R;
import com.example.cpsc411hw2.Student;
import com.example.cpsc411hw2.StudentDB;

public class SummaryListAdapter extends BaseAdapter {


    @Override
    public int getCount() {
        return StudentDB.getInstance().getStudentList().size();
    }

    @Override
    public Object getItem(int position) {
        return StudentDB.getInstance().getStudentList().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View row_view;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            row_view = inflater.inflate(R.layout.student_row, parent, false);
        }else row_view = convertView;

        final Student s = StudentDB.getInstance().getStudentList().get(position);

        ((TextView) row_view.findViewById(R.id.first_name)).setText(s.getFirstName());
        ((TextView) row_view.findViewById(R.id.last_name)).setText(s.getLastName());
        ((TextView) row_view.findViewById(R.id.CWID)).setText(s.getCWID().toString());

        //If row is clicked then show course information
        row_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Show code
                Toast.makeText(view.getContext(), "Courses:", Toast.LENGTH_SHORT).show();
                Integer courseListSize = s.getCourseList().size();
                for(int i = 0; i<courseListSize; i++){
                    Toast.makeText(view.getContext(), "Class: "+s.getCourseList().get(i).getCourseID()+"  |  Grade:"+s.getCourseList().get(i).getGrade(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return row_view;
    }


}
