package listarcontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class ListarContactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Libreta miLibreta = new Libreta();
    switch (Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: \n1. Añadir\n2. Editar\n3. Ver\n4. Borrar"))){
        case 1: miLibreta.engadir();
            break;
        case 2:
    }
    }
    
}
