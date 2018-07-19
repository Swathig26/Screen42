package com.swathi.screen4;

import android.support.v7.app.AppCompatActivity;
package com.example.ramya.schoolapp;

import android.app.Dialog;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.Gravity.TOP;

/**
 * Created by ramya on 4/21/2018.
 */

public class Screen1 extends AppCompatActivity {
    Button button;
    EditText username;
    EditText email;
    EditText phno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
        button=(Button)findViewById(R.id.login);
        username=(EditText)findViewById(R.id.username);
        email=(EditText)findViewById(R.id.email);
        phno=(EditText)findViewById(R.id.phnum);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( TextUtils.isEmpty(username.getText())) {
                    Toast toast=new Toast(Screen1.this);
                    Toast.makeText(Screen1.this, "Enter all the fields", Toast.LENGTH_LONG).show();
                    toast.setGravity(Gravity.TOP|Gravity.LEFT, 20, 20);
                    username.setError("username");
                }
                else if(TextUtils.isEmpty(email.getText())){
                    Toast toast=new Toast(Screen1.this);
                    Toast.makeText(Screen1.this, "Enter all the fields", Toast.LENGTH_LONG).show();
                    toast.setGravity(Gravity.TOP|Gravity.LEFT,20, 20);
                    email.setError("email");
                }
                else if(TextUtils.isEmpty(phno.getText())){
                    Toast toast=new Toast(Screen1.this);
                    toast.makeText(Screen1.this, "Enter all the fields", Toast.LENGTH_LONG).show();
                    toast.setGravity(Gravity.TOP|Gravity.LEFT,20, 20);
                    phno.setError("phonenumber");
                }
                else{
                    Intent intent = new Intent(Screen1.this, Screen2.class);
                    intent.putExtra("Username", username.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }




}

/**
 * Created by Swathi on 5/6/2018.
 */



