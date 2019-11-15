package com.diozaas.listviewarmandioza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView simpleList;

    //    String[] countryList = {"Indonesia", "Malaysia", "Singapura", "Thailand", "Brunei Darussalam", "Vietnam", "Laos", "Myanmar", "Kamboja", "Filipina"};
    int flags[] = {R.drawable.indonesia, R.drawable.malaysia,   R.drawable.singapura, R.drawable.thailand, R.drawable.brunei, R.drawable.vietnam, R.drawable.laos, R.drawable.myanmar, R.drawable.kamboja, R.drawable.filipina};

    Button btn_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        simpleList = (ListView)findViewById(R.id.simpleListView);

        Resources res = getResources();
        String[] countryList = res.getStringArray(R.array.countryList);
        String[] countryDesc = res.getStringArray(R.array.countryDesc);
        String[] countryCity = res.getStringArray(R.array.countryCity);
        String[] countryLang = res.getStringArray(R.array.countryLang);
        String[] countryArea = res.getStringArray(R.array.countryArea);
        String[] countryCitizen = res.getStringArray(R.array.countryCitizen);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags, countryDesc, countryCity, countryLang, countryArea, countryCitizen);
        simpleList.setAdapter(customAdapter);

        btn_about = (Button)findViewById(R.id.btn_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahKeAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(pindahKeAbout);
            }
        });
    }
}
