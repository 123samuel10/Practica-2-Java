package model;

import javax.swing.*;

public class Menu {
    public int menuOpc(){
        int opcionesMenu=Integer.parseInt(JOptionPane.showInputDialog("MENU\n"+
                "1. Agregar un nuevo Juguete \n" +
                "2. Recibo\n"+
                "3. Disminuir existencias \n"+
                "4. Aumentar existencias \n"+
                "5. Observar cuanto productos hay por categoria\n"+
                "6. Infromar la cantidad total de juguetes\n"+
                "7. Informar el tipo del cual hay mas juguetes \n"+
                "8. Informar el tipo del cual hay menos juguetes \n"+
                "9. Obtener los juguetes con mayor valor a un precio de 10.000\n" +
                "10. Informe del cliente con mas cantidad de juguetes ha comprado en la tienda\n"+
                "11. Informe del mejor empleado\n"+
                "12. Crear Provedor\n"+
                "13. Salir"));

        return opcionesMenu;
    }
}
