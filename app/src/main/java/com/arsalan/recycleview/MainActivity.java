package com.arsalan.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView ProductRecyclerView;
    List<productmodel> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProductRecyclerView = findViewById(R.id.recyclerview);
        productList = new ArrayList<>();
        productList.add(new productmodel(R.drawable.john, "John Snow","\n" +
                "Jon is introduced in 1996's A Game of Thrones as the illegitimate son of Ned Stark, lord of Winterfell in the North of Westeros."));
        productList.add(new productmodel(R.drawable.arya, "Arya Stark","Introduced in 1996's A Game of Thrones, Arya is the third child and youngest daughter of Lord Ned Stark and his wife Lady Catelyn Stark. "));
        productList.add(new productmodel(R.drawable.jame, "Jaime Lannister","Ser Jaime Lannister was the elder son of Lord Tywin Lannister, younger twin brother of Queen Cersei Lannister, and older brother of Tyrion Lannister."));
        productList.add(new productmodel(R.drawable.ned, "Ned Stark","Lord Eddard Stark was the head of House Stark."));
        productList.add(new productmodel(R.drawable.little, "Petyr Baelish","Lord Petyr Baelish, popularly called Littlefinger"));

        productadapter adapter = new productadapter(this, productList);
        LinearLayoutManager manager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        ProductRecyclerView.addItemDecoration(new
                DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        ProductRecyclerView.setAdapter(adapter);
        ProductRecyclerView.setLayoutManager(manager);
    }
}