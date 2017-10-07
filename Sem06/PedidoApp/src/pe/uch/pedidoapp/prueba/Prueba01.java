package pe.uch.pedidoapp.prueba;

import pe.uch.pedidoapp.service.PedidoService;

public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        double importe = 456.78;

        // Proceso
        PedidoService service = new PedidoService();
        double impuesto = service.calcImpuesto(importe);
        double total = service.calcTotal(importe);
        
        // Reporte
        System.out.println("Importe: " + importe);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
}
