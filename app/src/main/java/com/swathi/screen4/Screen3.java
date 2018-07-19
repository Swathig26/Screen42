package com.swathi.screen4;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Screen1 extends AppCompatActivity {
    ArrayList<Abc> arrayList;
    ListView list;
    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen3);
        arrayList = new ArrayList<>();
        list=(ListView)findViewById(R.id.list_item);
        inputSearch=(EditText)findViewById(R.id.inputSearch);
        Abc obj = new Abc();
        obj.SchoolName = "MARTIN LUTHER";
        obj.Address = "Girinagar";
        obj.ContactInfo ="swathig2605@gmail.com";
        Abc abj = new Abc();
        abj.SchoolName = "VIJAYA BHARATHI";
        abj.Address = "Vijaynagar";
        abj.ContactInfo = "ramyaraghunandan@gmail.com";
        arrayList.add(obj);
        arrayList.add(abj);
        int i;

        for (i = 0; i < arrayList.size(); i++) {

            Log.e("Listofarray", arrayList.get(i).ContactInfo + " " + arrayList.get(i).SchoolName + " " + arrayList.get(i).Address);
        }
        Adaptor adaptor = new Adaptor(Screen1.this, 0);
        list.setAdapter(adaptor);


    }
    class Adaptor extends ArrayAdapter  {
        TextView firstName,secondName,thr;
        ImageView image;
        public Adaptor(Context context, int resource)
        {
            super(context, resource);
        }

        @Override
        public int getCount() {
            return arrayList.size();

        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(Screen1.this);
            convertView =inflater.inflate(R.layout.adaptor,null);

            firstName=(TextView)convertView.findViewById(R.id.Schoolname);
            secondName=(TextView)convertView.findViewById(R.id.Addss);
            thr=(TextView)convertView.findViewById(R.id.contactinfo);
            image = (ImageView)convertView.findViewById(R.id.imageView1);

            firstName.setText(arrayList.get(position).SchoolName);
            secondName.setText(arrayList.get(position).Address);
            thr.setText(arrayList.get(position).ContactInfo);

            // image.setImageResource(R.mipmap.ic_launcher);
            return convertView;

        }


    }

}
class  Abc
{
    String SchoolName,Address;
    String ContactInfo;

}






