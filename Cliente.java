import java.util.ArrayList;

public class Cliente {
    
     private String nombre;
    private ArrayList<Producto> cestaCompra;

    public Cliente(Object generarNombreAleatorio) {
        //TODO Auto-generated constructor stub
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Constructor
    public ArrayList<Producto> getCestaCompra() {
        return cestaCompra;
    }
    public void setCestaCompra(ArrayList<Producto> cestaCompra) {
        this.cestaCompra = cestaCompra;
    }

    public Cliente(String nombre, ArrayList<Producto> cestaCompra) {
        this.nombre = nombre;
        this.cestaCompra = cestaCompra;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente\n");
        sb.append("===================================\n");
        sb.append("* Nombre: ").append(nombre).append("\n");
        sb.append("* Total de productos: ").append(cestaCompra.size()).append("\n");
        sb.append("* Lista de artículos en la cesta:\n");
        for (Producto producto : cestaCompra) {
            sb.append(producto.getNombre()).append("\n");
        }
        sb.append("===================================\n");
        return sb.toString();
    }
    public void agregarProducto(int generarNumeroProductosAleatorio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarProducto'");
    }
}
