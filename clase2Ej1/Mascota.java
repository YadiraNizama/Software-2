package ulima.clase2Ej1;

public abstract class Mascota {
    private String nombre;

    //Vonstructor por defecto
    public Mascota() {
    }

    //Otro constructor
    public Mascota(String mascota) {
        this.nombre = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void comer(){
        System.out.println("Mascota comiendo...");
    }
}
