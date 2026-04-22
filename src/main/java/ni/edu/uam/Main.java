package ni.edu.uam;

import ni.edu.uam.modelos.Producto;
import ni.edu.uam.servicios.ProductoServicio;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
//hacer que los datos se soliciten
//hacer un menú
//con JOptionPane


public class Main {
    static void main() {
        ProductoServicio productos = new ProductoServicio();

        productos.agregarProducto("Coca-cola", 35, 2);
        productos.agregarProducto("Cuajada", 30, 2);
        productos.agregarProducto("Pan", 10, 3);

        String menu = "Jaguar Coffee \n1. Agregar producto \n2. Ver productos \n3. Salir \nOpcion: ";
        String nombre, precio, cantidad, opcion = "0";
        do {
            opcion = JOptionPane.showInputDialog(null, menu);
            switch (opcion) {
                case "1" ->{
                        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto: ");
                        precio = JOptionPane.showInputDialog(null, "Ingrese el precio del producto: ");
                        cantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad del producto: ");
                        productos.agregarProducto(nombre, Double.parseDouble(precio), Integer.parseInt(cantidad));
                }
                case "2" -> {
                    JOptionPane.showMessageDialog(null, productos.getFactura());


                }

                case "3" ->{
                    JOptionPane.showMessageDialog(null, "Gracias por su compra");
                }

                default -> JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        }while (!opcion.equals("3")) ;
    }
}
