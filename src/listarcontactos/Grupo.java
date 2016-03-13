package listarcontactos;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Grupo {
    private String nombre;
    private Contacto[] contactos;
    
    public Grupo(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    
          }
