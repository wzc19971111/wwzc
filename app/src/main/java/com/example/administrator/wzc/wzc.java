package com.example.administrator.wzc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class wzc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wzc);
        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v){
              Intent intent=new Intent(wzc.this,Second.class);
              startActivity(intent);
          }

        });
    }
}
