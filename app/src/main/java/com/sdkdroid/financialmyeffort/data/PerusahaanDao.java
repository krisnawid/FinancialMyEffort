package com.sdkdroid.financialmyeffort.data;

import android.database.Cursor;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PerusahaanDao {
    @Query("SELECT * FROM perusahaan")
    List<Perusahaan> getAll();

    @Query("SELECT * FROM perusahaan WHERE nama_perusahaan IN (:namaList)")
    List<Perusahaan> loadAllByIds(String[] namaList);

    @Query("SELECT * FROM perusahaan LIMIT 1")
    Perusahaan selectOne();

    @Query("SELECT * FROM perusahaan ORDER BY id_perusahaan DESC LIMIT 1")
    Perusahaan selectOneDesc();

    @Query("SELECT * FROM perusahaan WHERE nama_perusahaan = :nama_perusahaan AND pemilik_perusahaan = :pemilik_perusahaan LIMIT 1")
    Perusahaan findByNameAndOwner(String nama_perusahaan, String pemilik_perusahaan);

    @Query("SELECT * FROM perusahaan")
    Cursor getCursorAll();

    @Insert
    void insertAll(Perusahaan... perusahaans);

    @Delete
    void delete(Perusahaan perusahaan);

    @Update
    void update(Perusahaan perusahaan);
}
