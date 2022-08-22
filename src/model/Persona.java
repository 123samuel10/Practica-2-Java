package model;

import javax.swing.*;

public class Persona {
    private String cedela;
    private String nombre;
    private String telefono;
    private String dirreccionDeResidencia;


    public Persona(String cedela,String nombre,String telefono,String dirreccionDeResidencia) {
        this.cedela = cedela;
        this.nombre=nombre;
        this.telefono=telefono;
        this.dirreccionDeResidencia=dirreccionDeResidencia;
    }

    public Persona() {

    }

    public String getCedela() {
        return cedela;
    }

    public void setCedela(String cedela) {
        this.cedela = cedela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirreccionDeResidencia() {
        return dirreccionDeResidencia;
    }

    public void setDirreccionDeResidencia(String dirreccionDeResidencia) {
        this.dirreccionDeResidencia = dirreccionDeResidencia;
    }

}
