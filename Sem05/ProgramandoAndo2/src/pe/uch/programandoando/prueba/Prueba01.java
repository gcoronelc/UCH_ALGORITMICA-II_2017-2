package pe.uch.programandoando.prueba;

import pe.uch.programandoando.model.Tramo;
import pe.uch.programandoando.service.VentaService;

public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        double consumoTotal = 9.5;
        // Proceso
        Tramo[] repo = VentaService.procesarVenta(consumoTotal);
        double total = VentaService.calcTotal(repo);
        // Reporte
        System.out.println("Consumo Total: " + consumoTotal);
        for (Tramo r : repo) {
            System.out.println(r.getId()
            + "\t" + r.getConsumo() 
            + "\t" + r.getPrecio() 
            + "\t" + r.getImporte());
        }
        System.out.println("Total: " + total);
    }
}
