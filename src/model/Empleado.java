package model;

import javax.swing.*;

public class Empleado extends Persona{
    private int Salario;
    private String fechaIngresoLaboral;




    public Empleado(String cedela, String nombre, String telefono, String dirreccionDeResidencia,int Salario,String fechaIngresoLaboral) {
        super(cedela, nombre, telefono, dirreccionDeResidencia);
        this.Salario=Salario;
        this.fechaIngresoLaboral=fechaIngresoLaboral;
    }

    public Empleado() {

    }




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


}
