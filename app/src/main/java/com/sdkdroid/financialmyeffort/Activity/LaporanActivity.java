package com.sdkdroid.financialmyeffort.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sdkdroid.financialmyeffort.R;

public class LaporanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laporan);
    }

    public void handleSemuaTransaksi(View view) {
        Intent intent = new Intent(this, SemuaTransaksiActivity.class);
        startActivity(intent);
    }
}
