package ni.edu.uam.interfaces;

import ni.edu.uam.modelos.Producto;

import java.util.List;

public interface ProductoInterfaces {

    public void agregarProducto(String nombre, double precio, int cantidad);
    public List<Producto> getProductos();

    public boolean eliminarProducto(String nombre);

    public boolean editarProducto(String nombre, double precio, int cantidad);

    public boolean buscarProducto (String nombre, int cantidad, int precio);

    String buscarProducto(String nombre);
}
