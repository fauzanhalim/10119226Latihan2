package com.example.a10119226latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VeryAccActifity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.veri_acc);

        Button veryacc = (Button) findViewById(R.id.veryacc);
        veryacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VeryAccActifity.this,home.class);
                startActivity(intent);
            }
        });
    }
}