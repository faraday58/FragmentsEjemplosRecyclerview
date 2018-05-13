package com.example.armando.fragmentsejemplos.BasesDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ManejoBasesDatos extends SQLiteOpenHelper{

    Context context;

    public ManejoBasesDatos(Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME,null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context =context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
