package Application;

import Controladores.ControladorJuguete;
import Controladores.ControladorUsuario;
import model.*;

public class MainService {

    public static void main(String[] args) {


        //---------------------------------------------------------------------------------------------------------------
        Menu opc = new Menu();
        boolean bandera = true;
        Juguete juguete[]=new Juguete[100];
        ControladorJuguete controladorJuguete = new ControladorJuguete();
        ControladorUsuario controladorUsuario=new ControladorUsuario();

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
                    controladorJuguete.clienteCantidadJuguetesMayor();
                    break;
                case 11:
                    controladorJuguete.informeDelMejorEmpleado();
                    break;
                case 12:
                    controladorJuguete.provedor();


            }
        }
    }
}
