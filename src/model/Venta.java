package model;

public class Venta {
    private String fechaVenta;
    public Venta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

}
