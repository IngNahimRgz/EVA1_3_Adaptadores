package com.example.nahim.eva1_3_adaptadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<Student> adpater = new ArrayAdapter<Student>
                (this,R.layout.item_adapter, R.id.txtItem,Student.getStudents());

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adpater);
    }
}
