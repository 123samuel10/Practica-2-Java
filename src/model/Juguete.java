package model;

import javax.swing.*;

public class Juguete {
    private String nombreJuguete;
    private String material;
    private int cantidad;
    private int precio;

    DetalleVenta detalleVenta;
    Empleado empleado;
    Cliente cliente;
    Provedor provedor;
    public Juguete(DetalleVenta detalleVenta, Empleado empleado,Cliente cliente, String nombreJuguete, String material, int cantidad, int precio) {
        this.detalleVenta=detalleVenta;
        this.provedor=provedor;
        this.empleado=empleado;
        this.cliente=cliente;
        this.nombreJuguete = nombreJuguete;
        this.material=material;
        this.cantidad=cantidad;
        this.precio=precio;


    }

    public Juguete() {

    }


    public String getNombreJuguete() {
        return nombreJuguete;
    }

    public void setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }






    }




