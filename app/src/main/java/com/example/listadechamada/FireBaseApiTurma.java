package com.example.listadechamada;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class FireBaseApiTurma {

    private static final String TABELA_NOME = "/turmas";

    public void buscaReceitas(){
        turmas = new ArrayList<>();

        FirebaseFirestore.getInstance().collection(TABELA_NOME).addSnapshotListener((value, error) -> {
            List<DocumentChange> dcs = value.getDocumentChanges();

            for (DocumentChange doc: dcs){
                if (doc.getType() == DocumentChange.Type.ADDED){
                    Turma t = doc.getDocument().toObject(Turma.class);
                    turmas.add(t);
                }
            }
            adapter = new ArrayAdapter<>(activity.getApplicationContext(), android.R.layout.simple_list_item_1, receitas);
            listViewReceitas.setAdapter(adapter);
        });
    }


}
