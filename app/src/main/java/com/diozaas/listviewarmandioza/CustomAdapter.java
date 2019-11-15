package com.diozaas.listviewarmandioza;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[], countryDesc[], countryCity[], countryLang[], countryArea[], countryCitizen[];
    int flags[];
    LayoutInflater inflter;


    public CustomAdapter(Context applicationContext, String[] countryList, int[] flags, String[] countryDesc, String[] countryCity, String[] countryLang, String[] countryArea, String[] countryCitizen) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
        this.countryDesc = countryDesc;
        this.countryCity = countryCity;
        this.countryLang = countryLang;
        this.countryArea = countryArea;
        this.countryCitizen = countryCitizen;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int number = i;
        view = inflter.inflate(R.layout.activity_listview, null);
        final TextView country = (TextView) view.findViewById(R.id.textView);
        final ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(countryList[i]);
        icon.setImageResource(flags[i]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent moveIntent=new Intent(view.getContext(),CountryDetail.class);

                moveIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                moveIntent.putExtra("position",number);
                moveIntent.putExtra("negara",countryList[number]);
                moveIntent.putExtra("desc",countryDesc[number]);
                moveIntent.putExtra("ibukota",countryCity[number]);
                moveIntent.putExtra("bahasa",countryLang[number]);
                moveIntent.putExtra("area",countryArea[number]);
                moveIntent.putExtra("penduduk",countryCitizen[number]);
                moveIntent.putExtra("flag",flags[number]);
                view.getContext().startActivity(moveIntent);

            }
        });

        return view;
    }
}