package pe.egcc.ventasapp.prueba;

import java.util.List;
import pe.egcc.ventasapp.model.Producto;
import pe.egcc.ventasapp.model.Venta;
import pe.egcc.ventasapp.service.VentaService;

public class Prueba03 {

    public static void main(String[] args) {
        
        // Proceso
        VentaService ventaService = new VentaService();
        List<Producto> productos = ventaService.leerProductos();
        
        // Reporte
        for (Producto p : productos) {
            System.out.println(p.getNombre() + "\t" + p.getPrecio());
        }
        
    }
    
}
