/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaStock;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class MainStock {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz 1kg", 850.0, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares Bluetooth", 2999.0, 12, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera algodón", 2200.0, 25, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Set de sábanas", 4200.0, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche entera 1L", 450.0, 50, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println();

        System.out.println("Tarea 2: Listar todos los productos");
        inventario.listarProductos();

        System.out.println("Tarea 3: Buscar producto por ID 'P002'");
        Producto buscado = inventario.buscarProductoPorId("P002");
        if (buscado != null) {
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("Tarea 4: Filtrar por categoría ELECTRONICA");
        List<Producto> electronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : electronica) {
            p.mostrarInfo();
        }

        System.out.println("Tarea 5: Eliminar producto 'P003' y listar restantes");
        inventario.eliminarProducto("P003");
        inventario.listarProductos();

        System.out.println("Tarea 6: Actualizar stock de 'P001' a 20");
        inventario.actualizarStock("P001", 20);
        Producto pActualizado = inventario.buscarProductoPorId("P001");
        if (pActualizado != null) {
            pActualizado.mostrarInfo();
        }

        System.out.println("Tarea 7: Total de stock disponible: " + inventario.obtenerTotalStock());

        System.out.println("Tarea 8: Producto con mayor stock:");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) {
            mayor.mostrarInfo();
        }
        System.out.println("Tarea 9: Productos con precio entre $1000 y $3000");
        List<Producto> rango = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        for (Producto p : rango) {
            p.mostrarInfo();
        }
        
       
        System.out.println("Tarea 10: Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}
