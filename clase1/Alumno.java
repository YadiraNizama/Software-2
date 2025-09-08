package ulima.clase1;

import java.io.Serializable;

public class Alumno implements Serializable{
    private String codigo;
    private String nombre;
    private String carrera;
    
    //Constructor

    //Constructir vacio
    public Alumno() {
    }
    
    //Constructir con codigo
    public Alumno(String codigo) {
        this.codigo = codigo;
    }
    
    //Constructir con todo
    public Alumno(String codigo, String nombre, String carrera) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    //Cuando hagas System.out.println(a1);, muestre los datos de forma bonita
    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", carrera=" + carrera + '}';
    }
    
}

