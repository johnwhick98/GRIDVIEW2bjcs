package com.isc.gridview2bjcs;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GridView gvdatos;
        contenido contenido;
        contenido contenido2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos=findViewById(R.id.gvcontenedor);

        ArrayList<String> arreglo= new ArrayList<String>();
        arreglo.add("Brandon");
        arreglo.add("Yayo");
        arreglo.add("Shio");
        arreglo.add("Simi");
        arreglo.add("Tecochi");
        arreglo.add("Pao");
        arreglo.add("Miguel");
        arreglo.add("Geralt");
        arreglo.add("Ciri");
        arreglo.add("Tris");
        arreglo.add("Jennifer");
        arreglo.add("Mar");
        arreglo.add("Setson");
        arreglo.add("Chivis");
        arreglo.add("gus");
        arreglo.add("China");







        contenido= new contenido(this,arreglo);
        gvdatos.setAdapter(contenido);

    }
}

