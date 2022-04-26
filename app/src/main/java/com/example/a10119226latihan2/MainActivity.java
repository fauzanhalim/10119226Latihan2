package com.example.a10119226latihan2;
// Nama : Nur Fauzan Halim
// Kelas : IF-06
// NIM : 10119226
// Tanggal Pengerjaan : 26 April 2022

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRegister(View view){
        Intent intent = new Intent(this, RegisterAcitfity.class);
        startActivity(intent);
    }
}