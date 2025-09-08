package ulima.clase2Ej1;

public class Perro extends Mascota {

    public Perro() {
    }

    public Perro(String mascota) {
        super(mascota);
    }
    
    //Sobre escritura
    @Override
    public void comer(){
        System.out.println( this.getNombre()+ "El perro esta comiendo...");
    }
    
}
