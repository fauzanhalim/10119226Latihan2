package com.example.a10119226latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostThereActifity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.almosthere);
        Button veri = (Button) findViewById(R.id.veri);
        veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AlmostThereActifity.this,VeryAccActifity.class);
                startActivity(intent);
            }
        });
    }
}