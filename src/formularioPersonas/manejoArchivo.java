package formularioPersonas;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;

public class manejoArchivo {
    
    public static void CrearArchivo(String nombreArchivo) {
       File archivo = new File(nombreArchivo);
       
       try {
           PrintWriter salida = new PrintWriter(archivo);
           
           salida.close();
           System.out.println("se creo el archivo");
       }catch(FileNotFoundException ex){
           ex.printStackTrace(System.out);
       }
       
        
    }
    
   
    public static void EscribirArchivo(String nombreArchivo, String contenido) {
       File archivo = new File(nombreArchivo);
       
       try {
           PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
           salida.println(contenido);
           salida.close();
           System.out.println("se escribio en el archivo");
           //System.out.println(contenido);
           
           
       }catch(FileNotFoundException ex){
           ex.printStackTrace(System.out);
       }catch(IOException ex){
           ex.printStackTrace(System.out);
       }
    }
    
    public static void LeerArchivo(String nombreArchivo){
        
        try{
            FileReader r = new FileReader(nombreArchivo);
            
            BufferedReader buffer = new BufferedReader(r);
            
            String temp = "";
            int cont =0;
            while(temp != null){
                temp = buffer.readLine();
                
                String x= temp;
                String z = x;
                
                String []arreglo = x.split(" ");
                   
                for(int i = 0;i < arreglo.length;i++ ){
                    System.out.println(arreglo[i]+"  arry: "+ i);
                    
                    cont +=1;
                    
                }
                    if(temp == null){
                        break;
                    }
                }
            }
            
        catch(Exception ex){
            ex.printStackTrace(System.out);
        }
    }
    
     
       
}

