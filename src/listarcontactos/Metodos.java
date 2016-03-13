/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarcontactos;

import javax.swing.JOptionPane;

/**
 *Clase que contiene los metodos llamados desde el main
 * @author Adrián
 */
public class Metodos {
    //private String nombre;
    //private String dni;
    private final Contacto[] contactos=new Contacto[10];
    private final Grupo[] grupos = new Grupo[10];
    /**
     13      * Constructor por defecto
     14     
     17      */
    public Metodos(){
        /*for(int i=0;i<contactos.length;i++){
            contactos[i]=new Contacto();
            contactos[i].setNombre("");
        }*/
    }
    /**
     13      * Método con el cual añadimos un nuevo contacto al array contactos,si el array esta completo , el boleano libretaLLena hara que salga del bucle,accedera al if y mostrara el mensaje "libreta llena"
     14      * @param contacto
     15      * 
     16      * 
     17      */
    public void engadir(Contacto contacto){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    /**
     13      * Añadir al contacto mediante el JoptionPane* nombre y apellidos
     17      */
    public void engadir(){
        boolean libretaLlena=true;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                Contacto contacto = new Contacto(JOptionPane.showInputDialog("Nombre:"),JOptionPane.showInputDialog("Apellidos:"));
                contactos[i]=contacto;
                libretaLlena=false;
                break;
            }
        }
        
        if(libretaLlena){
            JOptionPane.showMessageDialog(null, "Libreta llena");
        }
    }
    /**
     13      * 
     14      * Método que muestra el contenido del array contactos mediante una lista . 
     15      * 
     16      * 
     17      */
    public void listar(){
        String cadena="";
        for(Contacto elemento:contactos){
            if(elemento!=null){
                cadena+=elemento.toString()+"\n";
            }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    /**
     13      * Metodo que usa el id que le mete el usuario para volverlo null (que seria una manera de "eliminarlo")
     14      * @param id(int)
     15      * 
     16      * 
     17      */
    public void borrar(){
        boolean notFound = true;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que desea borrar:"));
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    contactos[i]=null;
                    notFound=false;
                    break;
                }
            }
        }
        if(notFound){
            JOptionPane.showMessageDialog(null, "Contacto no encontrado");
        }
    }
    /**
     13      * Método que crea un objeto llamado grupo de la clase Grupo y le da nombre.
     14      * @param nombre(String)
     15      * 
     16      * 
     17      */
    public void crearGrupo(){
        boolean grupoLleno = true;
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del grupo");
        Grupo grupo = new Grupo(nombre);
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]==null){
                grupos[i]=grupo;
                grupoLleno=false;
                break;
            }
        }
        if(grupoLleno){
            JOptionPane.showMessageDialog(null, "Límite de grupos alcanzado");
        }
    }
    /**
     * Método que añade 2 contadores , y el id con el cual se guardara, ademas del nombre que se le dara al grupo .
     * 
     * @return 
     */
    public void agregarAGrupo(){
        boolean contactoEncontrado = false ,grupoEncontrado = false;
        int indiceContactos = 0, indiceGrupos=0;
        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del contacto que quiere guardar en el grupo:"));
        String nombreGrupo = JOptionPane.showInputDialog("Nombre del grupo en el que quiere guardar el contacto:");
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                if(contactos[i].getId()==id){
                    indiceContactos=i;
                    contactoEncontrado=true;
                    break;
                }
            }
        }
        
        for(int i=0;i<grupos.length;i++){
            if(grupos[i]!=null){
                if(grupos[i].getNombre().equalsIgnoreCase(nombreGrupo)){
                    indiceGrupos=i;
                    grupoEncontrado=true;
                    break;
                }
            }
        }
        /**
         * Este último método se lo coji a Jorge tal cual porque es mas completo que el nuestro .
         * 
         */
        if(contactoEncontrado && grupoEncontrado){
            contactos[indiceContactos].setGrupo(grupos[indiceGrupos]);
        }
        else{
            JOptionPane.showMessageDialog(null, "Contacto o grupo no encontrado");
        }
    }
}
