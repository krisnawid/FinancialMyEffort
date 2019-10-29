package com.sdkdroid.financialmyeffort.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sdkdroid.financialmyeffort.R;

public class PemasukanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemasukan);
    }

    public void handleTambahData(View view) {
        Intent intent = new Intent(this, TambahDataActivity.class);
        startActivity(intent);
    }
}
