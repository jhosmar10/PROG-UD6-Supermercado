import java.util.Queue;

public class Cajero {
    private int numero;
    private Queue<Cliente> colaClientes;
    private boolean cajaAbierta;

    //Constructor
    public Cajero(int numero, Queue<Cliente> colaClientes, boolean cajaAbierta) {
        this.numero = numero;
        this.colaClientes = colaClientes;
        this.cajaAbierta = cajaAbierta;
    }

    public Cajero(int i) {
        //TODO Auto-generated constructor stub
    }

    //Getters y Setters
    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Queue<Cliente> getColaClientes() {
        return colaClientes;
    }


    public void setColaClientes(Queue<Cliente> colaClientes) {
        this.colaClientes = colaClientes;
    }


    public boolean isCajaAbierta() {
        return cajaAbierta;
    }


    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }

    public void abrirCaja() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abrirCaja'");
    }

    public void agregarCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarCliente'");
    }

    public void atenderCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atenderCliente'");
    }

    public void verClientesPendientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verClientesPendientes'");
    }

    public void cerrarCaja() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cerrarCaja'");
    }
}
