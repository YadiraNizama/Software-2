package ulima.lab1Ej2;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList();
    
    public void agregarProducto(Producto producto){
        if(producto.hayStock()){
            productos.add(producto);
            producto.reducirStock();
            System.out.println("Se agregó producto al carrito");
        }else{
            System.out.println("No hay stock disponible");
        }
    }
    
    public void mostrarCarrito(){
        double total = 0;
        System.out.println("\n--- Resumen del Carrito --");
        for(Producto p:productos){
            p.mostrarInfo();
            total += p.getPrecio();
        }
        System.out.println("Total a pagar: "+total);
    }
    
}
