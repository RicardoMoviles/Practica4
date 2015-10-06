package com.restrepo.ricardo.practica4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Usuario on 05/10/2015.
 */
public class AdapterBar extends ArrayAdapter<Lista_Bar> {

       private Lista_Bar[] bares =
            new Lista_Bar[] {
                    new Lista_Bar(R.drawable.la100,"La 100", "Calle 100 #103–49", "(574)828 15 88"),
                    new Lista_Bar(R.drawable.partyxtrem, "Party Xtrem", "Carrera 105 Barrio Ortiz","--"),
                    new Lista_Bar(R.drawable.pebblespizzeria, "Pebbles Pizzeria", "Carrera 105 #100f-01", "(574) 828 31 46") };




    public AdapterBar(Context context, Lista_Bar[] bares) {

        super(context, R.layout.layout_bares, bares);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater infla = LayoutInflater.from(getContext());
        View item = infla.inflate(R.layout.layout_bares, null);

        TextView nombre = (TextView) item.findViewById(R.id.tNombreb);
        nombre.setText(bares[position].getNombreb());

        TextView direccion = (TextView) item.findViewById(R.id.tdireccionb);
        direccion.setText(bares[position].getDireccionb());

        TextView telefono = (TextView) item.findViewById(R.id.ttelefonob);
        telefono.setText(bares[position].getTelefono());

        ImageView imagen = (ImageView) item.findViewById(R.id.imagenb);
        imagen.setImageResource(bares[position].getIdImagenb());

        return item;
    }

}

