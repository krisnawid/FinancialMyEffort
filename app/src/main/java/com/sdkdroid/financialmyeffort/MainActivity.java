package com.sdkdroid.financialmyeffort;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.sdkdroid.financialmyeffort.Activity.BiodataActivity;
import com.sdkdroid.financialmyeffort.Activity.CetakActivity;
import com.sdkdroid.financialmyeffort.Activity.LaporanActivity;
import com.sdkdroid.financialmyeffort.Activity.PemasukanActivity;

public class MainActivity extends AppCompatActivity {

    public String title = "FIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }

    public void handleBiodata(View view) {
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }

    public void handlePemasukan(View view) {
        Intent intent = new Intent(this, PemasukanActivity.class);
        startActivity(intent);
    }

    public void handleLaporan(View view) {
        Intent intent = new Intent(this, LaporanActivity.class);
        startActivity(intent);
    }

    public void handleCetak(View view) {
        Intent intent = new Intent(this, CetakActivity.class);
        startActivity(intent);
    }
}
