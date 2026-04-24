package ni.edu.uam;

import ni.edu.uam.servicios.ProductoServicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ProductoServicio productos = new ProductoServicio();

        productos.agregarProducto("Coca-cola", 35, 2);
        productos.agregarProducto("Cuajada", 30, 2);
        productos.agregarProducto("Pan", 10, 3);

        String menu = "Jaguar Coffee \n1. Agregar producto \n2. Ver productos \n3. Buscar \n4. Salir \nOpcion: ";
        String nombre, precio, cantidad, opcion = "0";

        do {
            opcion = JOptionPane.showInputDialog(null, menu);

            if (opcion == null) break; // cerrar con X

            switch (opcion) {

                case "1" -> {
                    nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto: ");
                    precio = JOptionPane.showInputDialog(null, "Ingrese el precio del producto: ");
                    cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto: ");

                    productos.agregarProducto(nombre, Double.parseDouble(precio), Integer.parseInt(cantidad));
                }

                case "2" -> {
                    JOptionPane.showMessageDialog(null, productos.getFactura());
                }

                case "3" -> {
                    nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto: ");
                    JOptionPane.showMessageDialog(null, productos.buscarProducto(nombre));
                }

                case "4" -> {
                    JOptionPane.showMessageDialog(null, "Gracias por su compra");
                }

                default -> JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        } while (!opcion.equals("4"));
    }
}