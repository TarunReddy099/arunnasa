package com.example.np;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NectarHome extends AppCompatActivity {
     Button buy,donate;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nectar_home);

buy = findViewById(R.id.buy);
donate = findViewById(R.id.donate);
buy.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(NectarHome.this,BuyHome.class);
        startActivity(i);

    }
});
donate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(NectarHome.this,DonateHome.class);
        startActivity(intent);
    }
});

    }
}
