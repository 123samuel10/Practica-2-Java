package model;

public class Cliente extends Persona{

    private  String diaCumpleaños;
    private String correoElectronico;


//    DetalleVenta detalleVenta;

    public Cliente(String cedela, String nombre, String telefono, String dirreccionDeResidencia,String diaCumpleaños,String correoElectronico) {
        super(cedela, nombre, telefono, dirreccionDeResidencia);
        this.diaCumpleaños=diaCumpleaños;
        this.correoElectronico=correoElectronico;

    }

    public Cliente() {

    }

    public String getDiaCumpleaños() {
        return diaCumpleaños;
    }

    public void setDiaCumpleaños(String diaCumpleaños) {
        this.diaCumpleaños = diaCumpleaños;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
//    public void setDetalleVenta(DetalleVenta detalleVenta){this.detalleVenta=detalleVenta;};
}
