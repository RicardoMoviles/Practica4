package com.restrepo.ricardo.practica4;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Usuario on 05/10/2015.
 */
public class Adapter extends ArrayAdapter<Lista_Entrada> {

    private Lista_Entrada[] datos =
            new Lista_Entrada[] {
                    new Lista_Entrada(R.drawable.hotelembera, "Hotel Embera", "Calle 100 #103-49", "(574)828 15 88"),
                    new Lista_Entrada(R.drawable.hotelguateque, "Hotel Guatequ", "Carrera 102 #91-20","(574)828 84 34"),
                    new Lista_Entrada(R.drawable.hoteloscar, "Hotel el Osca", "Carrera 102 #98-10", "(574)828 81 84") };



    public Adapter(Context context, Lista_Entrada[] datos) {

        super(context, R.layout.layout_item, datos);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.layout_item, null);

        TextView nombre = (TextView) item.findViewById(R.id.tNombreh);
        nombre.setText(datos[position].getNombreh());

        TextView direccion = (TextView) item.findViewById(R.id.tdireccionh);
        direccion.setText(datos[position].getDireccionh());

        TextView telefono = (TextView) item.findViewById(R.id.ttelefonoh);
        telefono.setText(datos[position].getTelefono());

        ImageView imagen = (ImageView) item.findViewById(R.id.imagen);
        imagen.setImageResource(datos[position].getIdImagen());

        return item;
    }
}
