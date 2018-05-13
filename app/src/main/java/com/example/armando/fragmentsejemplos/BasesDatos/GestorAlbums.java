package com.example.armando.fragmentsejemplos.BasesDatos;

import android.content.ContentValues;
import android.content.Context;

import com.example.armando.fragmentsejemplos.R;
import com.example.armando.fragmentsejemplos.RecyclerViewMusica.DetalleMusica;

import java.util.ArrayList;

public class GestorAlbums {

    private Context context;
    public GestorAlbums(Context context)
    {
        this.context = context;

    }

    /*albums.add(new DetalleMusica("Rola el Deep","Adele","Rolando",R.drawable.adele));
        albums.add(new DetalleMusica("beatles Song","Beatles","Let it be",R.drawable.beatles));
        albums.add(new DetalleMusica("Elvis 60","Elvis","Jailhouse Rock",R.drawable.elvis));
        albums.add(new DetalleMusica("Emmanuel 80s","Emmanuel","La chica de humo",R.drawable.emmanuel));
        albums.add(new DetalleMusica("Jackson 80s","Michael Jacson","Smooth Criminal",R.drawable.jackson));
        albums.add(new DetalleMusica("Less Miserables","Basado en la Novela de Victor Hugo","I Dreamed a Dream",R.drawable.lesmiserables));
        albums.add(new DetalleMusica("Mi Cárcel","Marco Antonio Solis","Mi Cárcel",R.drawable.marcosolis));
        albums.add(new DetalleMusica("Elements of life","Tiesto","Elements of life",R.drawable.tiesto));
   */




    public ArrayList<DetalleMusica> AsignarAlbums()
    {
        ManejoBasesDatos db = new ManejoBasesDatos(context);
        InsertarCuatroAlbums(db);
        return db.extraerAlbumsDataBase();
    }

    public void InsertarCuatroAlbums(ManejoBasesDatos db)
    {
        ContentValues contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_NOMBRE_ALBUM,"Rola el Deep");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_ARTISTA,"Adele");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_CANCION,"Rolando");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_FOTO, R.drawable.adele);
        db.InsertarAlbum(contentValues);
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_NOMBRE_ALBUM,"Beatles Song");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_ARTISTA,"Beatles");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_CANCION,"Let it be");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_FOTO, R.drawable.beatles);
        db.InsertarAlbum(contentValues);
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_NOMBRE_ALBUM,"Elements of Life");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_ARTISTA,"Tiesto");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_CANCION,"Elements of Life");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_FOTO, R.drawable.tiesto);
        db.InsertarAlbum(contentValues);
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_NOMBRE_ALBUM,"Mi Carcel");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_ARTISTA,"Marco Antonio Solis");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_CANCION,"Mi Carcel");
        contentValues.put(ConstantesBaseDatos.TABLE_ALBUMS_FOTO, R.drawable.marcosolis);
        db.InsertarAlbum(contentValues);

    }
}
