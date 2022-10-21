package com.example.menukuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));

    }
    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Nasi Goreng",
                "12.000",
                "Nasi Goreng enak.",
                R.drawable.nasigoreng));

        listKuliner.add(new Kuliner("Ayam Goreng",
                "14.000",
                "Ayam goreng enak banget bro.",
                R.drawable.ayamgoyrng));

        listKuliner.add(new Kuliner("Chiken Steak",
                "10.000",
                "Chiken Steak enak bangget.",
                R.drawable.steakchiken));

        listKuliner.add(new Kuliner("Es Teh",
                "5.000",
                "Es Teh Manis brooo. ",
                R.drawable.esteh));
    }
}