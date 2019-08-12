package com.diozaas.listviewarmandioza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"Indonesia", "Malaysia", "Singapura", "Thailand", "Brunei Darussalam", "Vietnam", "Laos", "Myanmar", "Kamboja", "Filipina"};
    int flags[] = {R.drawable.indonesia, R.drawable.malaysia,   R.drawable.singapura, R.drawable.thailand, R.drawable.brunei, R.drawable.vietnam, R.drawable.laos, R.drawable.myanmar, R.drawable.kamboja, R.drawable.filipina};

//    String deskripsi[] = [""]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.simpleListView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
//        simpleList.setAdapter(arrayAdapter);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
