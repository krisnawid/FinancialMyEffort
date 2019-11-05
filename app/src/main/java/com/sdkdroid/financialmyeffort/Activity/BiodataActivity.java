package com.sdkdroid.financialmyeffort.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sdkdroid.financialmyeffort.MainActivity;
import com.sdkdroid.financialmyeffort.R;
import com.sdkdroid.financialmyeffort.data.AppDbProvider;
import com.sdkdroid.financialmyeffort.data.Perusahaan;
import com.sdkdroid.financialmyeffort.data.PerusahaanDao;

public class BiodataActivity extends AppCompatActivity {

    private Perusahaan currentPerusahaan;

    private EditText edtNamaPerusahaan;
    private EditText edtNamaPemilik;
    private EditText edtAlamatPerushaan;
    private Button btnSimpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        PerusahaanDao daoPerusahaan = AppDbProvider.getInstance(this).perusahaanDao();
        if (daoPerusahaan.selectOneDesc() == null){
            daoPerusahaan.insertAll(this.dataSetAwal());
        }

        this.loadData();
        this.initComponents();
    }

    private void initComponents() {

        this.edtNamaPerusahaan = this.findViewById(R.id.editText_nama);
        this.edtNamaPemilik = this.findViewById(R.id.editText_pemilik);
        this.edtAlamatPerushaan = this.findViewById(R.id.editText_alamat);
        this.btnSimpan = this.findViewById(R.id.btn_simpan);

        this.edtNamaPerusahaan.setText(this.currentPerusahaan.nama_perusahaan);
        this.edtNamaPemilik.setText(this.currentPerusahaan.pemilik_perusahaan);
        this.edtAlamatPerushaan.setText(this.currentPerusahaan.alamat_perusahaan);

    }

    private void loadData(){
        PerusahaanDao daoPerusahaan = AppDbProvider.getInstance(this).perusahaanDao();

        this.currentPerusahaan = daoPerusahaan.selectOneDesc();
    }

    public void Btn_Simpan(View view) {
        syncData();

        PerusahaanDao daoPerusahaan = AppDbProvider.getInstance(this).perusahaanDao();
        daoPerusahaan.delete(this.currentPerusahaan);
        daoPerusahaan.insertAll(this.makePerusahaan());

        Toast.makeText(this, "Your data has been Saved", Toast.LENGTH_SHORT).show();
        finish();

    }

    private Perusahaan makePerusahaan(){
        Perusahaan p = new Perusahaan();
        p.alamat_perusahaan = this.edtAlamatPerushaan.getText().toString();
        p.pemilik_perusahaan = edtNamaPemilik.getText().toString();
        p.nama_perusahaan = edtNamaPerusahaan.getText().toString();

        return p;
    }

    public void syncData(){
        this.currentPerusahaan.nama_perusahaan = this.edtNamaPerusahaan.getText().toString();
        this.currentPerusahaan.pemilik_perusahaan = this.edtNamaPemilik.getText().toString();
        this.currentPerusahaan.alamat_perusahaan = this.edtAlamatPerushaan.getText().toString();
    }

    private Perusahaan dataSetAwal(){
        Perusahaan p = new Perusahaan();
        p.nama_perusahaan = "";
        p.pemilik_perusahaan = "";
        p.alamat_perusahaan = "";

        return p;
    }

}
