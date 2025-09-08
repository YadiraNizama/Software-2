package ulima.clase1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hola {
    
    private int i;
    private String nombre;   
    private boolean flag;
    private char c;
    /*Definir un diccionario
    private Map<String,String> mapa = new HashMap<>();*/
            
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        //Creo un objeto hola
        Hola hola=new Hola();
        //Llamo a los metodos
        hola.crearAlumnos();
        hola.listarAlumnos();
    }
    
    public void demo1() {
        c = 'A';
        nombre="Mi nombre";
        
        if(c=='B'){
            System.out.println("c no tiene el valor de B");
        }else if (c=='C'){
            System.out.println("c no tiene el valor de C");
        }else{
            System.out.println("c tiene el valor de A");
        }
    }
    
    public void crearAlumnos(){
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno("Pepito");
        String codigo = "20205016";
        String nombre = "Pepito";
        String carrera = "CIS";
        Alumno a3 = new Alumno("XYZ","123","Java");
        Alumno a4 = new Alumno(nombre,carrera,codigo);
        
        a4.setCarrera("CIS");
        System.out.println(a4);
    }
    
    public void listarAlumnos(){
        List<Alumno> la = new ArrayList<>();
        Alumno a1 = new Alumno("2025001","Nombre-1","CIS");
        Alumno a2 = new Alumno("2025001","Nombre-2","CII");
        Alumno a3 = new Alumno("2025001","Nombre-3","ARQ");
        
        //Agregar objetos a la lista
        la.add(a1);
        la.add(a2);
        la.add(a3);
        
        //Recorrer la lista
        for(int i=0;i<la.size();i++){
            System.out.println(la.get(i));
        }
        
        System.out.println("--------------------------");
        
        //Otra manera de recorrer la lista
        for (Alumno a : la){
            System.out.println(a);
        }
    }
}
