package listarcontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrián
 */
public class Libreta {

    /**
     * 2 * Ejemplo: Libreta de contactos . 3 * 4 * @author Adrián Abal Alonso 5
     * * @version 12.03.2016 6
     */
    public static void main(String[] args) {

        Metodos obx = new Metodos();
        boolean condicion = true;
        do {
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog("1)Engadir contacto\n2)Listar contactos\n3)Borrar contacto\n5)Crear grupo\n6)Añadir contacto a grupo\n7)Salir"));
            /**
             * * Menu con el cual acceder a los metodos alojados en la clase "Metodos"
             * 
             */
            switch (seleccion) {
                case 1:
                    obx.engadir();
                    break;
                case 2:
                    obx.listar();
                    break;
                case 3:
                    obx.borrar();
                    break;
                case 5:
                    obx.crearGrupo();
                    break;
                case 6:
                    obx.agregarAGrupo();
                    break;
                case 7:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (condicion);

    }

}
