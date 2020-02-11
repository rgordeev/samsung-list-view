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

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));
        persons.add(new Person("a", "b"));



        ListView listView = findViewById(R.id.listView);

        ListAdapter listAdapter = new ArrayAdapter<Person>(this, android.R.layout.simple_list_item_checked, persons);

        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("LIST_VIEW", "position: " + position + ", id: " + id + ", view: " + view);
            }
        });

    }

    static class Person {
        private String name;
        private String age;
        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("name: %s, age: %s", name, age);
        }
    }
}
