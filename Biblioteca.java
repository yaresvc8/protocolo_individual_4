class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecio() { return precio; }

    public String getDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", Precio: $" + precio;
    }
}

class LibroReporte {
    public void generar(Libro libro) {
        System.out.println("Reporte del libro:");
        System.out.println(libro.getDetalles());
    }
}

class LibroRepositorio {
    public void guardar(Libro libro) {
        System.out.println("Guardando en la base de datos: " + libro.getTitulo());
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 29.99);

        LibroReporte reporte = new LibroReporte();
        LibroRepositorio repositorio = new LibroRepositorio();

        
        reporte.generar(libro);
        repositorio.guardar(libro);
    }
}
