package ulima.lab1Ej2;

public abstract class Producto {
    
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        if(precio<0||stock<0){
            throw new IllegalArgumentException("Precio y stock no pueden ser negativos...");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public boolean hayStock(){
        return stock > 0;
    }
    
    public void reducirStock(){
        if(hayStock()){
            stock--;
        }
    }
    
    public abstract void mostrarInfo();
    
}
