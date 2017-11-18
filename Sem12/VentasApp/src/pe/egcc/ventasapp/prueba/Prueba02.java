package pe.egcc.ventasapp.prueba;

import java.util.List;
import pe.egcc.ventasapp.model.Venta;
import pe.egcc.ventasapp.service.VentaService;

public class Prueba02 {

    public static void main(String[] args) {
        // Dato
        Venta venta1 = new Venta("Yo", "TV", 3500.0, 10);
        Venta venta2 = new Venta("Tu", "Radio", 1500.0, 6);
        Venta venta3 = new Venta("El", "Laptop", 6500.0, 8);
        Venta venta4 = new Venta("Ella", "Plancha", 500.0, 4);
        Venta venta5 = new Venta("Aquel", "Celular", 2500.0, 7);
        
        // Proceso
        VentaService ventaService = new VentaService();
        venta1 = ventaService.procesarVenta(venta1);
        venta2 = ventaService.procesarVenta(venta2);
        venta3 = ventaService.procesarVenta(venta3);
        venta4 = ventaService.procesarVenta(venta4);
        venta5 = ventaService.procesarVenta(venta5);
        
        ventaService.registrarVenta(venta1);
        ventaService.registrarVenta(venta2);
        ventaService.registrarVenta(venta3);
        ventaService.registrarVenta(venta4);
        ventaService.registrarVenta(venta5);
        
        // Reporte
        List<Venta> ventas = ventaService.leerVentas();
        for (Venta venta : ventas) {
            System.out.println(
                    venta.getArticulo()
                    + "    " + venta.getImporte() 
                    + "    " + venta.getImpuesto()
                    + "    " + venta.getTotal());
        }
        
    }
    
}
