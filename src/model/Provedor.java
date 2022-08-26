package model;

import java.security.PrivateKey;

public class Provedor{


    private String nombreProveedor;
    private String codigo;
    private String fechaIngreso;
    private String fechaEntregaProducto;
    private String material;
    Juguete juguete;

    public Provedor(String nombreProveedor,String codigo,String fechaIngreso,String fechaEntregaProducto,String  material,Juguete juguete) {
        this.nombreProveedor=nombreProveedor;
        this.codigo = codigo;
        this.fechaIngreso=fechaIngreso;
        this.fechaEntregaProducto=fechaEntregaProducto;
        this.material=material;
        this.juguete=juguete;
    }



    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEntregaProducto() {
        return fechaEntregaProducto;
    }

    public void setFechaEntregaProducto(String fechaEntregaProducto) {
        this.fechaEntregaProducto = fechaEntregaProducto;
    }
}


