package com.restrepo.ricardo.practica4;

/**
 * Created by Usuario on 05/10/2015.
 */
public class Lista_Entrada {

    private int idImagen;
    private String nombreh;
    private String direccionh;
    private String telefono;

    public Lista_Entrada(int idImagen, String nombreh, String direccionh, String telefono) {
        this.idImagen = idImagen;
        this.nombreh = nombreh;
        this.direccionh = direccionh;
        this.telefono = telefono;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getNombreh() {
        return nombreh;
    }

    public String getDireccionh() {
        return direccionh;
    }

    public String getTelefono() {
        return telefono;
    }
}
