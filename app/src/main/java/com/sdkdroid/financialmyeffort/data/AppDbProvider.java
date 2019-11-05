package com.sdkdroid.financialmyeffort.data;

import android.content.Context;

import androidx.room.Room;

public class AppDbProvider {
    private static FIMEAppDatabase instance;

    public static FIMEAppDatabase getInstance(Context context){
        if (AppDbProvider.instance == null){
            AppDbProvider.instance = Room.databaseBuilder(
                    context, FIMEAppDatabase.class,"fimeapp.db"
            ).allowMainThreadQueries().build();
        }

        return AppDbProvider.instance;

    }
}
