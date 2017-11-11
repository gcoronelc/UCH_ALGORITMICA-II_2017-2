package pe.egcc.ventasapp.prueba;

import pe.egcc.ventasapp.model.Venta;
import pe.egcc.ventasapp.service.VentaService;

public class Prueba01 {

    public static void main(String[] args) {
        // Dato
        Venta venta = new Venta("Yo", "TV", 3500.0, 10);
        
        // Proceso
        VentaService ventaService = new VentaService();
        venta = ventaService.procesarVenta(venta);
        
        // Reporte
        System.out.println("Importe: " + venta.getImporte());
        System.out.println("Impuesto: " + venta.getImpuesto());
        System.out.println("Total: " + venta.getTotal());
        
        
    }
    
}
