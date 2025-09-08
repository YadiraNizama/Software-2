package ulima.lab1Ej2;

public class ProductoDigital extends Producto {
    private String urlDescarga;

    public ProductoDigital(String urlDescarga, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        this.urlDescarga = urlDescarga;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre+ " Precio: " + precio + " Enlace: " + urlDescarga + " Stock: " + stock);
    }    
    
}
