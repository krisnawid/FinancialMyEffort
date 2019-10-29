package com.sdkdroid.financialmyeffort.models;

public class LaporanModels {
    public String tanggal;
    public String pengeluaran, pemasukan;

    public LaporanModels(String tanggal, String pengeluaran, String pemasukan) {
        this.tanggal = tanggal;
        this.pengeluaran = pengeluaran;
        this.pemasukan = pemasukan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(String pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public String getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(String pemasukan) {
        this.pemasukan = pemasukan;
    }
}
