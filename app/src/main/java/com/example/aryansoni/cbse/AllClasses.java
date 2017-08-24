package com.example.aryansoni.cbse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AllClasses extends AppCompatActivity {
    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_classes);

        List<String> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(AllClasses.this, 3);
        RecyclerView rView = (RecyclerView)findViewById(R.id.rv);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);
        AllClassesAdapter rcAdapter = new AllClassesAdapter(AllClasses.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    private List<String> getAllItemList(){
        List<String> allItems = new ArrayList<String>();
        for(int i=1;i<=12;i++){
            allItems.add(""+i);
        }
        return allItems;
    }
}