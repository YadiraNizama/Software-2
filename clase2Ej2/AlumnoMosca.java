package ulima.clase2Ej2;

public class AlumnoMosca implements Alumno, Mosca {

    @Override
    public void bika() {
        System.out.println("en bika..");
    }

    @Override
    public void trika() {
        System.out.println("en trika..");
    }

    @Override
    public void estudiar() {
        System.out.println("en estudiar..");
    }

    @Override
    public void participar() {
        System.out.println("en participar..");
    }

    @Override
    public void volar() {
        System.out.println("en volar..");
    }

    @Override
    public void molestar() {
        System.out.println("en molestar..");
    }

    @Override
    public void mosquear() {
        System.out.println("en mosquear..");
    }
    
}
