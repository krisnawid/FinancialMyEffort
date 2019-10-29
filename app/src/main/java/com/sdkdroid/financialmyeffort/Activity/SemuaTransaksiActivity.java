package com.sdkdroid.financialmyeffort.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sdkdroid.financialmyeffort.R;
import com.sdkdroid.financialmyeffort.adapters.LaporanAdapters;
import com.sdkdroid.financialmyeffort.models.LaporanModels;

import java.util.ArrayList;
import java.util.List;

public class SemuaTransaksiActivity extends AppCompatActivity {

    RecyclerView rvLaporanModels;
    //instansiasi list
    List<LaporanModels> listLaporanModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semua_transaksi);

        rvLaporanModels = findViewById(R.id.rvLaporan);
        LaporanModels laporan = new LaporanModels("11 Jan.\n2019", "1000000", "1000000");
        listLaporanModels.add(laporan);

        laporan = new LaporanModels("12 Jan.\n2019", "1000000", "1000000");
        listLaporanModels.add(laporan);

        laporan = new LaporanModels("13 Jan.\n2019", "1000000", "1000000");
        listLaporanModels.add(laporan);

        LaporanAdapters laporanAdapters = new LaporanAdapters(listLaporanModels);

        rvLaporanModels.setAdapter(laporanAdapters);
        rvLaporanModels.setLayoutManager(new LinearLayoutManager(this));
//        rvLaporanModels.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false));
//          rvLaporanModels.setLayoutManager(new ConstraintLayout());
    }
}
