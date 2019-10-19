package com.example.np;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ewaste extends AppCompatActivity {

    Button tq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewaste);
        tq =findViewById(R.id.button2);
        tq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Ewaste.this,Thanks.class);
                startActivity(intent);
            }
        });
    }
}
