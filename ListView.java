package com.example.ifpb.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class ListView extends Activity implements TextWatcher {

    ArrayList <String> listaImutavel = new ArrayList <CharSequence>();
    ArrayList <String> listaNomes = new ArrayList <CharSequence>();
    ListView listView = (ListView) findViewById(R.id.nomes);
    EditText pesquisa = (EditText) findViewById(R.id.Pesqui);

    listaImutavel.add("Lorena");
    listaImutavel.add("Dedeguinho");
    listaImutavel.add("Sarah");
    listaImutavel.add("Leon");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        for (int i = 0; i < listaImutavel.size(); i++){
            for (int j = 0; j < ListaImutavel.size(); j++){
                if(searchListView.getText().toString() == listaImutavel[i].charAt(j)){
                    listaNomes.add(listaImutavel[i]);
                }
            }
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNomes);
        listView.setAdapter(adapter);

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}


