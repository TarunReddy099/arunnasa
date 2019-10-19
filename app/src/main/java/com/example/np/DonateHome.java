package com.example.np;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonateHome extends AppCompatActivity {
Button pla,tex,ew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate_home);
        pla =findViewById(R.id.plastic);
        tex =findViewById(R.id.textile);
        ew =findViewById(R.id.ewaste);
        tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii=new Intent(DonateHome.this,TextileHome.class);
                startActivity(iii);
            }
        });

        pla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DonateHome.this,Plastic.class);
                startActivity(intent);
            }
        });
        ew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DonateHome.this,Ewaste.class);
                startActivity(intent);
            }
        });
    }
}
