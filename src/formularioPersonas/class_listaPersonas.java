package formularioPersonas;

import java.util.ArrayList;

public class class_listaPersonas {
    
    private static ArrayList <Persona> lista;

     // Atributo que identifica un vector de personas

    public class_listaPersonas(){
        lista = new ArrayList<Persona>();
    }
    
    public void añadirPersona(Persona p) {
        lista.add(p);
    }
    
    public void eliminarPersona(int i) {
        lista.remove(i);

    }
    
    public void borrarLista() {
        lista.removeAll(lista);
    }

    void add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Persona get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
