package com.example.climapp.Activiti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.climapp.Activiti.Adapter.TommorowAdapter;
import com.example.climapp.Activiti.Domains.TommorowDomain;
import com.example.climapp.R;

import java.util.ArrayList;

public class TommorowActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTommorow;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tommorow);

        try {
            initRecyclerView();
            setVariable();
        }catch (Exception e) {

            Toast.makeText(TommorowActivity.this, "ERROR MIRA MIRA:" + e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    private void setVariable() {
        ConstraintLayout backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> startActivity(new Intent(TommorowActivity.this, MainActivity.class)));
    }

    private void initRecyclerView() {

        ArrayList <TommorowDomain> items = new ArrayList<>();

        items.add(new TommorowDomain("Lun", "cloudy_3", "Nublado", "29", "12"));
        items.add(new TommorowDomain("Mar", "cloudy_sunny", "Nublado con Sol", "22", "13"));
        items.add(new TommorowDomain("Mie", "sol", "Sol", "28", "11"));
        items.add(new TommorowDomain("Jue", "lluvioso", "Lluvioso", "23", "12"));
        items.add(new TommorowDomain("Vie", "lluvioso", "Lluvioso", "23", "12"));
        items.add(new TommorowDomain("Sab", "tormenta", "Tormenta", "25", "10"));
        items.add(new TommorowDomain("Dom", "cloudy_sunny", "Nublado con Sol", "23", "12"));

        recyclerView = findViewById(R.id.view2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapterTommorow = new TommorowAdapter(items);
        recyclerView.setAdapter(adapterTommorow);


    }
}