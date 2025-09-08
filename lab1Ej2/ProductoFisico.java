package ulima.lab1Ej2;

public class ProductoFisico extends Producto {
    private double peso;
    
    public ProductoFisico(String nombre, double precio, int stock, double peso){
        super(nombre,precio,stock);
        this.peso = peso;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Producto: " + nombre+ " Precio: " + precio + " Peso: " + peso + " Stock: " + stock);
    }
}
