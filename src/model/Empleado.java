package model;

import javax.swing.*;

public class Empleado extends Persona{
    private int Salario;
    private String fechaIngresoLaboral;

    Juguete juguete;


    public Empleado(String cedela, String nombre, String telefono, String dirreccionDeResidencia,int Salario,String fechaIngresoLaboral) {
        super(cedela, nombre, telefono, dirreccionDeResidencia);
        this.Salario=Salario;
        this.fechaIngresoLaboral=fechaIngresoLaboral;
    }

    public Empleado() {

    }

    public void setJugueteEm(Juguete juguete){this.juguete=juguete;}


    public int getSalario() {
        return Salario;
    }



    public void setSalario(int salario) {
        Salario = salario;
    }

    public String getFechaIngresoLaboral() {
        return fechaIngresoLaboral;
    }

    public void setFechaIngresoLaboral(String fechaIngresoLaboral) {
        this.fechaIngresoLaboral = fechaIngresoLaboral;
    }

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }
}
