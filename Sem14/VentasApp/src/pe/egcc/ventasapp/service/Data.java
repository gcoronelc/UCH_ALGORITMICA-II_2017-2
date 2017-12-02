package pe.egcc.ventasapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventasapp.model.Producto;
import pe.egcc.ventasapp.model.Venta;

class Data {

    private Data() {
    }

    static List<Producto> productos;
    
    static {
        
        productos = new ArrayList<>();
        
        productos.add(new Producto("Producto 01", 56.0));
        productos.add(new Producto("Producto 02", 12.0));
        productos.add(new Producto("Producto 03", 67.0));
        productos.add(new Producto("Producto 04", 87.0));
        productos.add(new Producto("Producto 05", 23.0));
        productos.add(new Producto("Producto 06", 45.0));
        productos.add(new Producto("Producto 07", 76.0));
        productos.add(new Producto("Producto 08", 12.0));
        productos.add(new Producto("Producto 09", 87.0));
        productos.add(new Producto("Producto 10", 37.0));
        productos.add(new Producto("Producto 11", 89.0));
        productos.add(new Producto("Producto 12", 99.0));
        productos.add(new Producto("Producto 13", 29.0));
        productos.add(new Producto("Producto 14", 49.0));
        productos.add(new Producto("Producto 15", 19.0));
        
    }
    
    
    
}
