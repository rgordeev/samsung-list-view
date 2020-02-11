package ru.rgordeev.samsung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> names = new ArrayList<>();
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");
        names.add("name5");



        ListView listView = findViewById(R.id.listView);

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, names);

        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("LIST_VIEW", "position: " + position + ", id: " + id + ", view: " + view);
            }
        });


    }
}
