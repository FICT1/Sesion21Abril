package ni.edu.uam.servicios;

import ni.edu.uam.interfaces.ProductoInterfaces;
import ni.edu.uam.modelos.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio implements ProductoInterfaces {

    private List<Producto> productos;

    public ProductoServicio() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(String nombre, double precio, int cantidad) {
        this.productos.add(new Producto(nombre, cantidad, precio));
    }

    @Override
    public List<Producto> getProductos() {
        return productos;
    }

    @Override
    public boolean eliminarProducto(String nombre) {
        return false;
    }

    @Override
    public boolean editarProducto(String nombre, double precio, int cantidad) {
        return false;
    }

    @Override
    public boolean buscarProducto(String nombre, int cantidad, int precio) {
        return false;
    }

    @Override
    public String buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto.toString();
            }
        }
        return "Producto no encontrado";
    }

    public double getMonto() {
        double total = 0, monto = 0;
        for (Producto producto : productos) {
            total = producto.getCantidad() * producto.getPrecio();
            monto += total;
        }
        return monto;
    }

    public StringBuilder getFactura() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Factura\n");

        for (Producto prod : productos) {
            mensaje.append(prod.getNombre()).append(" - ")
                    .append(prod.getPrecio()).append(" - ")
                    .append(prod.getCantidad()).append(" - ")
                    .append(prod.getPrecio() * prod.getCantidad())
                    .append("\n");
        }

        mensaje.append("Total: ").append(this.getMonto());
        return mensaje;
    }
}