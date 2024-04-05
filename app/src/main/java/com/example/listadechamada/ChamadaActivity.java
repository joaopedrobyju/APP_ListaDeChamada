package com.example.listadechamada;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChamadaActivity extends AppCompatActivity {

    private ListView listViewListaAluno;

    private ArrayAdapter<Aluno> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamada);

        Toolbar toolbar = findViewById(R.id.toolbarListaAluno);
        setSupportActionBar(toolbar);

        listViewListaAluno = findViewById(R.id.listViewListaAluno);

    }
}