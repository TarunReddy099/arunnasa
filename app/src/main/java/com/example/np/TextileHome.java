package com.example.np;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextileHome extends AppCompatActivity {
Button tq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textile_home);
        tq =findViewById(R.id.texbt);
        tq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TextileHome.this,Thanks.class);
                startActivity(intent);
            }
        });
    }
}
