package com.nvh.login_logup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CustListView extends AppCompatActivity {
    ListView listView;
    String mTitle[]={"Facebook","Whatsap","Twitter","Instasgram","Youtobe"};
    String mTitle2[]={"Facebook Description","Whatsap Description","Twitter Description","Instasgram Description","Youtobe Description"};
    int img[]={R.drawable.facebook,R.drawable.whatsapp,R.drawable.twitter,R.drawable.instagram,R.drawable.youtube};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_list_view);
        listView=findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(this,mTitle, mTitle2,img);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent , View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(CustListView.this, "Facebook Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Whatsapp Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Twitter Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Instagram Description", Toast.LENGTH_SHORT).show();
                }
                if ( position == 0) {
                    Toast.makeText(CustListView.this, "Youtube Description", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rTitle2[];
        int rimg[];
        MyAdapter(Context c,String title[],String title2[], int img[] ){
            super(c,R.layout.row,title);
            this.context=c;
            this.rTitle=title;
            this.rTitle2=title2;
            this.rimg=img;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent, false);
            ImageView images = row.findViewById(R.id.img);
            TextView myTitle = row.findViewById(R.id.text1);
            TextView myTitle2 = row.findViewById(R.id.text2);

            images.setImageResource(rimg[position]);
            myTitle.setText(rTitle[position]);
            myTitle2.setText(rTitle2[position]);

            return row;
        }
    }


}