package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.marketapp.adapter.SizinIcinAdapter;
import com.example.marketapp.model.SizinIcin;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView bestForYouRecycler;
    SizinIcinAdapter sizinIcinAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<SizinIcin> sizinIcinList = new ArrayList<>();
        sizinIcinList.add(new SizinIcin("Makarna", "4.0", "25 dk", "₺ 20", R.drawable.resim1));
        sizinIcinList.add(new SizinIcin("Pilav Tavuk", "4.2", "20 dk", "₺ 25", R.drawable.resim2));
        sizinIcinList.add(new SizinIcin("İskender", "4.8", "25 dk", "₺ 30", R.drawable.resim3));
        sizinIcinList.add(new SizinIcin("Çiğ Köfte", "3.8", "7 dk", "₺ 10", R.drawable.resim4));
        sizinIcinList.add(new SizinIcin("Döner", "4.0", "5 dk", "₺ 15", R.drawable.resim5));
        sizinIcinList.add(new SizinIcin("Kebap", "4.5", "25 dk", "₺ 25", R.drawable.resim6));

        setBestForYouRecycler(sizinIcinList);

    }


    private void setBestForYouRecycler(List<SizinIcin> sizinIcinList){


        bestForYouRecycler = findViewById(R.id.best_for_you_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        bestForYouRecycler.setLayoutManager(layoutManager);
        sizinIcinAdapter = new SizinIcinAdapter(this, sizinIcinList);
        bestForYouRecycler.setAdapter(sizinIcinAdapter);
    }



}