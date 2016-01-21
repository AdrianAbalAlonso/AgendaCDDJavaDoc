package listarcontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Libreta {
    Contacto propietario = new Contacto();
    Contacto [] arrayContactos = new Contacto [10];
    //for(int i=0;i<arrayContactos.length;i++){
        //arrayContactos[i].setNombre("");
    int libre= cualLibre();
    public void engadir (){
    
     if(libre<0){
         JOptionPane.showMessageDialog(null,"No hay hueco.");
     } else {
         PedirDatos();
     }   
    }
    public int cualLibre(){
    for(int i=0;i<arrayContactos.length;i++){      
    if(arrayContactos[i].equals("")){
        return i;
    }
    }
        return -1;
}
 public Contacto PedirDatos(){
     String aux_nombre = JOptionPane.showInputDialog("Introduce el nombre:");
     String aux_apellido = JOptionPane.showInputDialog("Introduce el apellido:");
     String aux_telefono = JOptionPane.showInputDialog("Introduce el telefono:");
     String aux_email = JOptionPane.showInputDialog("Introduce el email:");
     Contacto contacto = new Contacto();
        return contacto;
    
 }
}
