package com.diozaas.listviewarmandioza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CountryDetail extends AppCompatActivity {
    public static final String EXTRA_NEGARA = "negara";
    public static final String EXTRA_DESC = "desc";
    public static final String EXTRA_IBUKOTA = "ibukota";
    public static final String EXTRA_BAHASA = "bahasa";
    public static final String EXTRA_AREA = "area";
    public static final String EXTRA_PENDUDUK = "penduduk";

    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_FLAG = "flag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_detail);

        String negara = getIntent().getStringExtra(EXTRA_NEGARA);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        String ibukota = getIntent().getStringExtra(EXTRA_IBUKOTA);
        String bahasa = getIntent().getStringExtra(EXTRA_BAHASA);
        String area = getIntent().getStringExtra(EXTRA_AREA);
        String penduduk = getIntent().getStringExtra(EXTRA_PENDUDUK);
        String flag = getIntent().getStringExtra(EXTRA_FLAG);

        Integer pos = getIntent().getIntExtra(EXTRA_POSITION, 0);

        TextView ngr = findViewById(R.id.negara);
        TextView dsc = findViewById(R.id.txt_desc);
        TextView ibukt = findViewById(R.id.txt_city);
        TextView bhs = findViewById(R.id.txt_lang);
        TextView ar = findViewById(R.id.txt_area);
        TextView pddk = findViewById(R.id.txt_citizen);

        ngr.setText(negara);
        dsc.setText(desc);
        ibukt.setText(ibukota);
        bhs.setText(bahasa);
        ar.setText(area);
        pddk.setText(penduduk);

        int flags[] = {R.drawable.indonesia, R.drawable.malaysia,   R.drawable.singapura, R.drawable.thailand, R.drawable.brunei, R.drawable.vietnam, R.drawable.laos, R.drawable.myanmar, R.drawable.kamboja, R.drawable.filipina};

        ImageView play = (ImageView)findViewById(R.id.image_detail);
        play.setImageResource(flags[pos]);

        this.setTitle(negara);

    }
}
