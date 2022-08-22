package Application;

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
        int suma = 0;
        int sumarCantidadJuguetes = 0;
        int valorTotalProductosComprados = 0;

        Persona persona = new Persona();
        Juguete arregloJuguete[] = new Juguete[100];
        Empleado arregloEmpleado[] = new Empleado[20];
        Cliente mostrarCliente = new Cliente();
        Empleado mostrarEmpleado = new Empleado();
        Juguete juguete2=new Juguete();




//                    for (int i=0;i< arreCantidad.length;i++){
//
//                    }
//        JOptionPane.showMessageDialog(null,arreCantidad.length);
//


        int cantidadJuguetes = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de juguetes"));

        while (bandera) {
            int menuPrincipal = opc.menuOpc();
            switch (menuPrincipal) {
                case 1:

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
                        String materialJuguete = JOptionPane.showInputDialog("ingrese el material del juguete");

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
                    break;
                case 2:
                    String nombre = JOptionPane.showInputDialog("ingrese el nombre para buscar");

                    for (int i = 0; i < arregloJuguete.length; i++) {
                        if (arregloJuguete[i] != null && arregloJuguete[i].getEmpleado().getNombre().equals(nombre)) {
                            JOptionPane.showMessageDialog(null, "NOMBRE CLIENTE: " + arregloJuguete[i].getCliente().getNombre() + " " + "JUGUETE: " + " " + arregloJuguete[i].getNombreJuguete() + " " + "CANTIDAD: " + " " + arregloJuguete[i].getCantidad() + " " + " Precio: " + " " + arregloJuguete[i].getPrecio());
                        }
                    }
                    break;
                case 3:

                    int total = 0;
                    for (int i = 0; i < arregloJuguete.length; i++) {
                        total = arregloJuguete.length-sumarCantidadJuguetes;
                    }
                    JOptionPane.showMessageDialog(null, "EL TOTAL DE JUGUETES QUE QUEDAN EN LA EMPRESA SON: " + total);
                    break;

                case 4:

                    int mostrarDos = 0;
                    boolean modificado=false;

                    String nombreProductosAumentar = JOptionPane.showInputDialog("digite el nombre del producto que desea aumentar");


                    for (int i=0;i<arregloJuguete.length;i++){
                        if (arregloJuguete[i]!=null && arregloJuguete[i].getNombreJuguete().equals(nombreProductosAumentar)) {
                            int cambiarCantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese para aumentar la cantidad"));
                             arregloJuguete[i].setCantidad(cambiarCantidad);
                        }
                    }
                    break;
                case 5:
                    String nombreCategoriaProducto = JOptionPane.showInputDialog("ingrese la categoria del productos, para observar cuantos han comprado");
                    for (int i = 0; i < arregloJuguete.length; i++) {
                        if (arregloJuguete[i] != null && arregloJuguete[i].getMaterial().equals(nombreCategoriaProducto)) {
                            JOptionPane.showMessageDialog(null, "las cantidades que hay de ese producto son: " + arregloJuguete[i].getCantidad());
                        }
                    }
                    break;
                case 6:

                    for (int i = 0; i < arregloJuguete.length; i++) {
                        if (arregloJuguete[i] != null) {
                            JOptionPane.showMessageDialog(null, "la cantidad total de juguetes es:" + " " + arregloJuguete[i].getCantidad());
                        }
                    }
                    break;
                case 7:
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
                    break;
                case 8:
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
                    break;
                case 9:
                    for (int i = 0; i < arregloJuguete.length; i++) {
                        if (arregloJuguete[i] != null && arregloJuguete[i].getPrecio() > 10000) {
                            JOptionPane.showMessageDialog(null, "PRODUCTO" + " " + arregloJuguete[i].getNombreJuguete() + " Material: " + " " + arregloJuguete[i].getMaterial() + " " + "Precio: " + " " + arregloJuguete[i].getPrecio() + " " + "Cantidad: " + arregloJuguete[i].getCantidad());
                        }
                    }
                    break;

                case 10:
                    bandera=false;
            }
}


    }
}