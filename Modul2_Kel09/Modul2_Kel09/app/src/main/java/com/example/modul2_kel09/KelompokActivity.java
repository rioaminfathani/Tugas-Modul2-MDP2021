package com.example.modul2_kel09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.modul2_kel09.R;

import java.util.ArrayList;
import java.util.Collections;

public class KelompokActivity extends AppCompatActivity
{

    ListView listView;
    String anggota[] =
    {
            "Kelompok IX",
            "Anggota 1 : " + "\n\nDefin Friko Fahdani (21120119130054)",
            "Anggota 2 : " + "\n\nMoh. Taufik Afandi (21120119130050)",
            "Anggota 3 : " + "\n\nRio Amin Fathani (21120119130069)",
            "Anggota 4 : " + "\n\nApriyandro Triandito Kusumo (21120119140127)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_nim);

        listView = (ListView)findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, anggota);
        listView.setAdapter(arrayAdapter);
    }
}
