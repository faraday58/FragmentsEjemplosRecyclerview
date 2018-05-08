package com.example.armando.fragmentsejemplos.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.armando.fragmentsejemplos.R;
import com.example.armando.fragmentsejemplos.RecyclerViewMusica.AlbumAdaptador;
import com.example.armando.fragmentsejemplos.RecyclerViewMusica.DetalleMusica;

import java.util.ArrayList;

public class DosFragment extends Fragment {

    ArrayList<DetalleMusica> albums;
    private RecyclerView listaAlbums;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_dos,container,false);

        listaAlbums= v.findViewById(R.id.rcListaContactos);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaAlbums.setLayoutManager(llm);

        IniciarlizarListaContactos();
        IniciarAdaptador();


        return v;
    }

    private void IniciarAdaptador()
    {
        AlbumAdaptador miAdaptador = new AlbumAdaptador(albums);
        listaAlbums.setAdapter(miAdaptador);


    }

    private void IniciarlizarListaContactos() {
        albums = new ArrayList<>();

        albums.add(new DetalleMusica("Rola el Deep","Adele","Rolando",R.drawable.adele));
        albums.add(new DetalleMusica("beatles Song","Beatles","Let it be",R.drawable.beatles));
        albums.add(new DetalleMusica("Elvis 60","Elvis","Jailhouse Rock",R.drawable.elvis));
        albums.add(new DetalleMusica("Emmanuel 80s","Emmanuel","La chica de humo",R.drawable.emmanuel));
        albums.add(new DetalleMusica("Jackson 80s","Michael Jacson","Smooth Criminal",R.drawable.jackson));
        albums.add(new DetalleMusica("Less Miserables","Basado en la Novela de Victor Hugo","I Dreamed a Dream",R.drawable.lesmiserables));
        albums.add(new DetalleMusica("Mi Cárcel","Marco Antonio Solis","Mi Cárcel",R.drawable.marcosolis));
        albums.add(new DetalleMusica("Elements of life","Tiesto","Elements of life",R.drawable.tiesto));


    }


}
