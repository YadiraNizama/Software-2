package ulima.lab1Ej2;

public class Main {
    public static void main(String[] args) {
        ProductoFisico libro = new ProductoFisico("Libro Java", 50.0, 5, 0.5);
        ProductoDigital curso = new ProductoDigital("cursos.com/java","Curso de Java", 80.0, 3);
        
        Carrito carrito = new Carrito();
        carrito.agregarProducto(curso);
        carrito.agregarProducto(libro);
        
        carrito.mostrarCarrito();
    }
}