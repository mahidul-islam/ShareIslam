package com.example.zihan.shareislam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BookAdapter bookAdapter;

    List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        bookList.add(
                new Book(
                        1,
                        "Sirah",
                        "Catagory:Sirah",
                         R.drawable.sirah));

        bookList.add(
                new Book(
                        2,
                        "Rahiqul Makhtum",
                        "Catagory:Sirah",
                        R.drawable.rahiqulmakhtum));

        bookList.add(
                new Book(
                        3,
                        "Siratun Nabi",
                        "Catagory:Sirah",
                        R.drawable.siratunnabi));


        bookAdapter = new BookAdapter(this, bookList);
        recyclerView.setAdapter(bookAdapter);

    }
}
