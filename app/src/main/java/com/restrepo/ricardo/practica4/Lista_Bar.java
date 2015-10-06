package com.restrepo.ricardo.practica4;


/**
 * Created by Usuario on 05/10/2015.
 */
public class Lista_Bar {


    private int idImagenb;
    private String nombreb;
    private String direccionb;
    private String telefono;

    public Lista_Bar(int idImagenb, String nombreb, String direccionb, String telefono) {
        this.idImagenb = idImagenb;
        this.nombreb = nombreb;
        this.direccionb = direccionb;
        this.telefono = telefono;
    }

    public int getIdImagenb() {
        return idImagenb;
    }

    public String getNombreb() {
        return nombreb;
    }

    public String getDireccionb() {
        return direccionb;
    }

    public String getTelefono() {
        return telefono;
    }
}
