package Controladores;

import model.Cliente;
import model.DetalleVenta;
import model.Empleado;
import model.Juguete;

import javax.swing.*;

public class ControladorJuguete {

    Juguete arregloJuguete[] = new Juguete[100];

    int sumarCantidadJuguetes = 0;





    public void Recibo(){
        String nombre = JOptionPane.showInputDialog("ingrese el nombre para buscar");

        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null && arregloJuguete[i].getEmpleado().getNombre().equals(nombre)) {
                JOptionPane.showMessageDialog(null, "NOMBRE CLIENTE: " + arregloJuguete[i].getCliente().getNombre() + " " + "JUGUETE: " + " " + arregloJuguete[i].getNombreJuguete() + " " + "CANTIDAD: " + " " + arregloJuguete[i].getCantidad() + " " + " Precio: " + " " + arregloJuguete[i].getPrecio());
            }
        }
    }

    public void DisminuirExistencias(){
        int total = 0;
        for (int i = 0; i < arregloJuguete.length; i++) {
            total = arregloJuguete.length-sumarCantidadJuguetes;
        }
        JOptionPane.showMessageDialog(null, "EL TOTAL DE JUGUETES QUE QUEDAN EN LA EMPRESA SON: " + total);
    }

    public void aumentarExistencias(){
        String nombreProductosAumentar = JOptionPane.showInputDialog("digite el nombre del producto que desea aumentar");

        for (int i=0;i<arregloJuguete.length;i++){
            if (arregloJuguete[i]!=null && arregloJuguete[i].getNombreJuguete().equals(nombreProductosAumentar)) {
                int cambiarCantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese para aumentar la cantidad"));
                arregloJuguete[i].setCantidad(cambiarCantidad);
            }
        }
    }
    public void obsrvarCantidadProductosPorCategoria(){
        String nombreCategoriaProducto = JOptionPane.showInputDialog("ingrese la categoria del productos, para observar cuantos han comprado");
        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null && arregloJuguete[i].getMaterial().equals(nombreCategoriaProducto)) {
                JOptionPane.showMessageDialog(null, "las cantidades que hay de ese producto son: " + arregloJuguete[i].getCantidad());
            }
        }
    }
    int mostrarTOTALJUGUETES=0;
    public void informarLaCantidadTotalDeJuguetes(){

        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null) {
                JOptionPane.showMessageDialog(null, "la cantidad total de juguetes es:" + " " +arregloJuguete[i].getCantidad());
            }
        }
    }

    public void informarEltipoMaterialQueHayMasJuguetes(){
        int mos =arregloJuguete[0].getCantidad();
        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null && arregloJuguete[i].getCantidad() > mos) {
                mos = arregloJuguete[i].getCantidad();

            }
        }
        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null && arregloJuguete[i].getCantidad() == mos) {
                JOptionPane.showMessageDialog(null, "la cantidad mayor es: " + "" + mos + "obtenido por el material" + " " + arregloJuguete[i].getMaterial());
            }
        }
    }

    public void informarTipoMaterialMenosJuguetes(){
        int cantidadMenor = arregloJuguete[0].getCantidad();
        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null && arregloJuguete[i].getCantidad() < cantidadMenor) {
                cantidadMenor = arregloJuguete[i].getCantidad();
            }
        }
        for (int i = 0; i < arregloJuguete.length; i++) {
            if (arregloJuguete[i] != null && arregloJuguete[i].getCantidad() == cantidadMenor) {
                JOptionPane.showMessageDialog(null, "la cantidad menor es: " + " " + cantidadMenor + " " + "obtenida por el material: " + " " + arregloJuguete[i].getMaterial());
            }
        }
    }
    int descuento=5000;
    int mostrarDescuento=0;
    public void Descuento(){



        for (int i = 0; i <arregloJuguete.length; i++) {

            if (arregloJuguete[i] != null && arregloJuguete[i].getPrecio()> 10000) {
                JOptionPane.showMessageDialog(null,"se ha ganado un descuento, por superar la compra un producto mayor a 10.000");
                mostrarDescuento=arregloJuguete[i].getPrecio()-descuento;
                JOptionPane.showMessageDialog(null, "PRODUCTO" + " " + arregloJuguete[i].getNombreJuguete() + " Material: " + " " + arregloJuguete[i].getMaterial() + " " + "Precio: " + " " +arregloJuguete[i].getPrecio() + " " + "Cantidad: " + arregloJuguete[i].getCantidad()+" "+"Descuento: "+mostrarDescuento);
            }else if (arregloJuguete[i]!=null && arregloJuguete[i].getPrecio()<10000){
                JOptionPane.showMessageDialog(null,"no se ha ganado el descuento");

            }
        }
    }

}
