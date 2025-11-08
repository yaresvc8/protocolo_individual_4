class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() { return nombre; }
    public double getPrecioBase() { return precioBase; }
    public double getImpuesto() { return impuesto; }
}

class CalculadoraPrecio {
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}

class EtiquetaProducto {
    public void imprimir(Producto producto, double precioFinal) {
        System.out.println("PRODUCTO: " + producto.getNombre());
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("-----------------------------");
    }
}

public class Compra {
    public static void main(String[] args) {
        Producto producto = new Producto("Audífonos Bluetooth", 80.0, 0.19);

        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        EtiquetaProducto etiqueta = new EtiquetaProducto();

        double precioFinal = calculadora.calcularPrecioFinal(producto);
        etiqueta.imprimir(producto, precioFinal);
    }
}
