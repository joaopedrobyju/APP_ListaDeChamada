package com.example.listadechamada;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class AdicionarAlunoActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextTelefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_aluno);

        editTextNome = findViewById(R.id.editTextNome);
        editTextTelefone = findViewById(R.id.editTextTelefone);

        Toolbar toolbar = findViewById(R.id.toolbarCadastrar);
        setSupportActionBar(toolbar);
    }

   // @Override
   // public boolean onCreateOptionsMenu(Menu menu) {
    //    getMenuInflater().inflate(R.menu.menu_criar, menu);
    //    return true;
   ///// }

   // @Override
    //public boolean onOptionsItemSelected(@NonNull MenuItem item) {
  //      if (item.getItemId() == R.id.menu_criar_receita) {
   //        Aluno a = new Aluno(editTextNome.getText().toString(), editTextTelefone.getText().toString());
//
     //       FireBaseApi fireBaseApi = new FireBaseApi(this);
    ///       fireBaseApi.criarReceita(r, "Receita criada com sucesso");
//
     //   }

    //    return super.onOptionsItemSelected(item);
  //  }
}