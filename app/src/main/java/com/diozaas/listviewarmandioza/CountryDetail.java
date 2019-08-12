package com.diozaas.listviewarmandioza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryDetail extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_NEGARA = "negara";
    public static final String EXTRA_ICON = "icon";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        String negara = getIntent().getStringExtra(EXTRA_NEGARA);
        String icon = getIntent().getStringExtra(EXTRA_ICON);
//        TextView tvDataReceived = findViewById(R.id.tv_data_received);

        TextView ngr = findViewById(R.id.negara);
        ngr.setText(negara);

        ImageView play = (ImageView)findViewById(R.id.image_detail);
        play.setImageResource(R.drawable.malaysia);



//        int position = getIntent().getIntExtra(EXTRA_POSITION, 0);

//        Toast.makeText(this,"Hello"+negara,Toast.LENGTH_SHORT).show();
        this.setTitle(negara);

//        String text = "Name : " + name + ",\nYour Age : " + age;
//        tvDataReceived.setText(text);
    }
}
