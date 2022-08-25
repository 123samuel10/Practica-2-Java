package Controladores;


import model.Cliente;
import model.DetalleVenta;
import model.Empleado;
import model.Juguete;

import javax.swing.*;

public class ControladorUsuario {

    Juguete arregloJuguete[]=new Juguete[100];
    int cantidadJuguetes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de juguetes"));
    int suma = 0;
    int valorTotalProductosComprados = 0;
    int sumarCantidadJuguetes = 0;
    public void agregarHistorial(){
        for (int i = 0; i < cantidadJuguetes; i++) {



            JOptionPane.showMessageDialog(null, "DATOS DEL EMPLEADO");

            String fecha = JOptionPane.showInputDialog("ingrese la fecha");
            String cedulaEmpleado = JOptionPane.showInputDialog("ingrese la cedula del empleado");
            String nombreEmpleado = JOptionPane.showInputDialog("ingrese el nombre del empleado");
            String telefonoEmpleado = JOptionPane.showInputDialog("ingrese el telefono del empleado");
            String dirreccionResidencia = JOptionPane.showInputDialog("ingrese la dirreccion del empleado");
            int salarioEmpleado = Integer.parseInt(JOptionPane.showInputDialog("ingrese el salario del empleado " + (i + 1)));
            String fechaIngresoLaboral = JOptionPane.showInputDialog("ingrese la fecha de ingreso laboral");

            JOptionPane.showMessageDialog(null, "DATOS DEL CLIENTE");
            String cedulaCliente = JOptionPane.showInputDialog("ingrese la cedula del cliente");
            String nombreClienete = JOptionPane.showInputDialog("ingrese el nombre del cliente");
            String telefonoCliente = JOptionPane.showInputDialog("ingrese el telefono del cliente");
            String dirrecionCliente = JOptionPane.showInputDialog("ingrese la dirreccion del cliente");
            String diaCumpleaños = JOptionPane.showInputDialog("dia de cumpleaños del cliente");
            String correoClienete = JOptionPane.showInputDialog("ingrese el correo del cliente");


            String nombreJuguete = JOptionPane.showInputDialog("ingrese el nombre del juguete");
            String materialJuguete = JOptionPane.showInputDialog("ingrese el material del juguete: plastico/tela/electronico");

            if (materialJuguete.equals("plastico")) {
                JOptionPane.showMessageDialog(null, "El juguete no requiere cuidados especiales");
            } else if (materialJuguete.equals("tela")) {
                JOptionPane.showMessageDialog(null, "El juguete no debe ser mojado");
            } else if (materialJuguete.equals("electronico")) {
                JOptionPane.showMessageDialog(null, "el juguete no debe ser mojdado y requiere baterias");
            }
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad"));
            //se suman las cantidades, para ver cuantos productos quedan en la tienda(caso3)
            sumarCantidadJuguetes += cantidad;




            int precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio"));
            DetalleVenta p1 = new DetalleVenta(fecha);
            Empleado empleado1 = new Empleado(cedulaEmpleado, nombreEmpleado, telefonoEmpleado, dirreccionResidencia, salarioEmpleado, fechaIngresoLaboral);
            Cliente cliente1 = new Cliente(cedulaCliente, nombreClienete, telefonoCliente, dirrecionCliente, diaCumpleaños, correoClienete);
            arregloJuguete[i] = new Juguete(p1, empleado1, cliente1, nombreJuguete, materialJuguete, cantidad, precio);


            JOptionPane.showMessageDialog(null, "RECIBO");
            JOptionPane.showMessageDialog(null, "CEDULA EMPLEADO: " + " " + empleado1.getCedela() + " " + "NOMBRE EMPLEADO " + empleado1.getNombre() + " " + "TELEFONO EMPLEADO: " + " " + empleado1.getTelefono() + " " + "DIRRECION EMPLEADO" + " " + empleado1.getDirreccionDeResidencia() + " " + "SALARIO EMPLEADO " + " " + empleado1.getSalario() + " " + "FECHA INGRESO LABORAL EMPLEADO: " + " " + empleado1.getFechaIngresoLaboral());
            JOptionPane.showMessageDialog(null, "CEDULA CLIENTE: " + " " + cliente1.getCedela() + " " + "NOMBRE CLIENTE: " + " " + cliente1.getNombre() + " " + "TELEFONO CLIENTE: " + " " + cliente1.getTelefono() + " " + "DIRRECION CLIENTE:" + " " + cliente1.getDirreccionDeResidencia() + " " + "CUMPLEAÑOS: " + " " + cliente1.getDiaCumpleaños() + " " + "CORREO: " + " " + cliente1.getCorreoElectronico());
            JOptionPane.showMessageDialog(null, "FECHA: " + p1.getFechaVenta() + " " + " JUGUETE: " + " " + arregloJuguete[i].getNombreJuguete() + " " + "MATERIAL " + arregloJuguete[i].getMaterial() + " " + "CANTIDAD:" + " " + arregloJuguete[i].getCantidad() + " " + "PRECIO:" + " " + arregloJuguete[i].getPrecio());
            suma = cantidad * precio;
            JOptionPane.showMessageDialog(null, "el total de esta factura es: " + " " + suma);

            valorTotalProductosComprados += suma;
        }
        JOptionPane.showMessageDialog(null, "EL TOTAL DE LA FACTURA ES: " + " " + valorTotalProductosComprados);

    }





}
