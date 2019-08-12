package com.diozaas.listviewarmandioza;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String countryList[];
    int flags[];
    LayoutInflater inflter;

//    private final Context context;

    public CustomAdapter(Context applicationContext, String[] countryList, int[] flags) {
        this.context = context;
        this.countryList = countryList;
        this.flags = flags;
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
//        View row = view;
        final int number = i;
        view = inflter.inflate(R.layout.activity_listview, null);
        final TextView country = (TextView) view.findViewById(R.id.textView);
        final ImageView icon = (ImageView) view.findViewById(R.id.icon);
        country.setText(countryList[i]);
        icon.setImageResource(flags[i]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Hello"+number,Toast.LENGTH_SHORT).show();
//                {"Indonesia", "Malaysia", "Singapura", "Thailand", "Brunei Darussalam", "Vietnam", "Laos", "Myanmar", "Kamboja", "Filipina"}
//                switch (number){
//                    case 0:
//                        //Indonesia
//                        break;
//                    case 1:
//                        //Malaysia
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                    case 2:
//                        // Singapura
//                        break;
//                }

                Intent moveIntent=new Intent(view.getContext(),CountryDetail.class);
                moveIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                moveIntent.putExtra("position",number);
                moveIntent.putExtra("negara",countryList[number]);
                moveIntent.putExtra("icon",flags[number]);
                view.getContext().startActivity(moveIntent);

//                context.startActivity(new Intent(CustomAdapter.this, CountryDetail.class));

//                Intent moveIntent = new Intent(MainActivity.this, CountryDetail.class);
//                startActivity(moveIntent);
            }
        });

        return view;
    }
}