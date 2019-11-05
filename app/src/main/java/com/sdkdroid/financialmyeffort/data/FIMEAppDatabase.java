package com.sdkdroid.financialmyeffort.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Perusahaan.class}, version = 1, exportSchema = false)
public abstract class FIMEAppDatabase extends RoomDatabase {
    public abstract PerusahaanDao perusahaanDao();
    public abstract LaporanDao laporanDao();
}
