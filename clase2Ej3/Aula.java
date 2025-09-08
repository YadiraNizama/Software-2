package ulima.clase2Ej3;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    
    private String seccion;
    
    private List<Alumno> la;

    public Aula(String seccion) {
        this.seccion = seccion;
        
        la = new ArrayList<>();
    }
    
    public void agregarAlumno(Alumno a){
        la.add(a);
    }

    public List<Alumno> getLa() {
        return la;
    }
    
    
}
