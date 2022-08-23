package Application;

import Controladores.ControladorJuguete;
import Controladores.ControladorVenta;
import model.*;

import javax.swing.*;

public class MainService {

    public static void main(String[] args) {

//        Cliente cliente=new Cliente("12","samuel","344","23","3","s");
//        Empleado empleado=new Empleado("444","pepe","3","4",100,"3");
//
//        DetalleVenta detalleVenta=new DetalleVenta("lunes");
//
//
//        Juguete juguete=new Juguete(detalleVenta,empleado,cliente,"caroo","plastico",3,400);
//
//        System.out.println("Dia: "+" "+detalleVenta.getFechaVenta()+" "+"CEDULA: "+empleado.getCedela()+" "+"NOMBRE:"+empleado.getNombre()+" "+"TELEFONO "+empleado.getTelefono()+" "+"DIRRECION:  "+empleado.getDirreccionDeResidencia()+" "+"SALARIO:"+ " "+empleado.getSalario()+" "+"FECHA INGRESO LABORAL:"+" "+empleado.getFechaIngresoLaboral()+" "+"Juguete"+juguete.getNombreJuguete() +"MATERIAL: "+juguete.getMaterial() +"CANTIDAD: "+juguete.getCantidad() +"PRECIO: "+juguete.getCantidad() +"precio: "+juguete.getPrecio());
//        int p=juguete.getCantidad()*juguete.getPrecio();
//        System.out.println("el total es:"+p);
        //---------------------------------------------------------------------------------------------------------------
        Menu opc = new Menu();
        boolean bandera = true;
        Juguete juguete[]=new Juguete[100];
        ControladorJuguete controladorJuguete = new ControladorJuguete();
        ControladorVenta controladorVenta=new ControladorVenta();

        while (bandera) {
            int menuPrincipal = opc.menuOpc();
            switch (menuPrincipal) {
                case 1:
                    controladorJuguete.agregarHistorial();

                    break;
                case 2:
                    controladorJuguete.Recibo();
                    break;
                case 3:
                    controladorJuguete.DisminuirExistencias();
                    break;
                case 4:
                    controladorJuguete.aumentarExistencias();
                    break;
                case 5:
                    controladorJuguete.obsrvarCantidadProductosPorCategoria();
                    break;
                case 6:
                    controladorJuguete.informarLaCantidadTotalDeJuguetes();
                    break;
                case 7:
                    controladorJuguete.informarEltipoMaterialQueHayMasJuguetes();
                    break;
                case 8:
                    controladorJuguete.informarTipoMaterialMenosJuguetes();
                    break;
                case 9:
                    controladorJuguete.Descuento();
                    break;
                case 10:
                    bandera=false;


            }
        }
    }
}
