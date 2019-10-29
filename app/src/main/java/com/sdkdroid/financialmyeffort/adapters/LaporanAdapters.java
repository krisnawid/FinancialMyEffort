package com.sdkdroid.financialmyeffort.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sdkdroid.financialmyeffort.R;
import com.sdkdroid.financialmyeffort.models.LaporanModels;

import java.util.List;

public class LaporanAdapters extends RecyclerView.Adapter<LaporanAdapters.MyViewHolder> {

    List<LaporanModels> laporanModelsList;

    public LaporanAdapters(List<LaporanModels> laporanModelsList){
        this.laporanModelsList = laporanModelsList;
    }

    @NonNull
    @Override
    public LaporanAdapters.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View superHeroView = layoutInflater.inflate(R.layout.item_laporan_models,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(superHeroView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LaporanAdapters.MyViewHolder holder, int position) {
        //ambil satu item hero
        LaporanModels laporan = laporanModelsList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.tanggalLaporan.setText(laporan.getTanggal());
        holder.pemasukanLaporan.setText(laporan.getPemasukan());
        holder.pengeluaranLaporan.setText(laporan.getPengeluaran());
    }

    @Override
    public int getItemCount() {
        return (laporanModelsList != null) ? laporanModelsList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tanggalLaporan, pemasukanLaporan, pengeluaranLaporan;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tanggalLaporan = itemView.findViewById(R.id.text_value_tanggal);
            pemasukanLaporan = itemView.findViewById(R.id.text_value_pemasukan);
            pengeluaranLaporan = itemView.findViewById(R.id.text_value_pengeluaran);
        }
    }

}
