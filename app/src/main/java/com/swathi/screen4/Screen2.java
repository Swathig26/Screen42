package com.swathi.screen4;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Swathi on 5/6/2018.
 */

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ramya on 4/21/2018.
 */

public class Screen2 extends AppCompatActivity {
    String school;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        TextView tv=(TextView)findViewById(R.id.edit1);
        tv.setText(getIntent().getStringExtra("Username"));
        SharedPreferences.Editor editor = getSharedPreferences(school, MODE_PRIVATE).edit();
        editor.putString("Schoolname", "School");
        editor.putInt("SchoolidName", 1);
        editor.putString("Jobname","Job");
        editor.putInt("JobId",2);
        editor.putString("instituteName","Institute");
        editor.putInt("instituteId",3);
        editor.apply();

    }

}
