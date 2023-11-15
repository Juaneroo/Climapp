package com.example.climapp.Activiti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.climapp.Activiti.Adapter.HourlyAdapter;
import com.example.climapp.Activiti.Domains.Hourly;
import com.example.climapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {

        ArrayList<Hourly> items=new ArrayList<>();

        items.add(new Hourly("10 pm", 28,"cloudy"));
        items.add(new Hourly("11 pm", 29,"sun"));
        items.add(new Hourly("12 pm", 30,"wind"));
        items.add(new Hourly("1 am", 29,"rainy"));
        items.add(new Hourly("2 pm", 27,"storm"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapterHourly=new HourlyAdapter(items);
        recyclerView.setAdapter(adapterHourly);


    }
}