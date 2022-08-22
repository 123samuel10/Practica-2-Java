package model;

import javax.swing.*;

public class DetalleVenta extends Venta{

    Juguete juguete;

    public DetalleVenta(String fechaVenta) {
        super(fechaVenta);
    }
    public void setJuguete(Juguete juguete){this.juguete=juguete;}


    public Juguete getJuguete() {
        return juguete;
    }







}
