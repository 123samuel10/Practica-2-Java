package model;

import java.security.PrivateKey;

public class Provedor{


    private String nombreProveedor;
    private String codigo;
    private String fechaIngreso;
    private String fechaEntregaProducto;
    private String material;

    public Provedor(String nombreProveedor,String codigo,String fechaIngreso,String fechaEntregaProducto,String  material) {
        this.nombreProveedor=nombreProveedor;
        this.codigo = codigo;
        this.fechaIngreso=fechaIngreso;
        this.fechaEntregaProducto=fechaEntregaProducto;
        this.material=material;

    }
}


