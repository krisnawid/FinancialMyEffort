package com.sdkdroid.financialmyeffort.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.w3c.dom.Text;

import java.util.Date;

@Entity
public class Perusahaan {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int id_perusahaan;

    @ColumnInfo(name = "nama_perusahaan")
    public String nama_perusahaan;

    @ColumnInfo(name = "pemilik_perusahaan")
    public String pemilik_perusahaan;

    @ColumnInfo(name = "alamat_perusahaan")
    public String alamat_perusahaan;
}
