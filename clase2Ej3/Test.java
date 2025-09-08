package ulima.clase2Ej3;

public class Test {
    
    public static void main(String[] args) {
    
        Alumno a1 = new Alumno ("Erick");
        Alumno a2 = new Alumno ("Thomas");
        Alumno a3 = new Alumno ("Alvaro");
        
        Aula aula = new Aula ("O2-202");
        aula.agregarAlumno(a1);
        aula.agregarAlumno(a2);
        aula.agregarAlumno(a3);
        
        //para imprimir el contenido
        for(Alumno a: aula.getLa()){
            System.out.println(a);
        }
        
    }
    
}
