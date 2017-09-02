package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.service.VentaService;

public class Prueba01 {
    
    public static void main(String[] args) {
        
        // Datos
        double precio = 580.0;
        int cant = 4;
        
        // Proceso
        double total = VentaService.calcTotal(precio, cant);
        double importe = VentaService.calcImporte(total);
        double impuesto = VentaService.calcImpuesto(total);
        
        // Reporte
        System.out.println("IMPUT");
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cant);
        System.out.println("OUTPUT");
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
    
    
}
