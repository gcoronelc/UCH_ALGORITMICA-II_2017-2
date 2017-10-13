package pe.uch.precioventaapp.prueba;

import pe.uch.precioventaapp.service.PrecioVentaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int tamLote = 1000;
    double preLote = 50000.0;
    double porcGastosAdm = 25.0;
    double porcGanUnidad = 200.0;
    
    // Proceso
    double[] repo = PrecioVentaService.procesarLote
        (tamLote, preLote, porcGastosAdm, porcGanUnidad);
    
    // Reporte
    System.out.println("Unidades a comercializar: " + repo[0]);
    System.out.println("Costo del lote: " + repo[1]);
    System.out.println("Costo por unidad: " + repo[2]);
    System.out.println("Precio de venta por unidad: " + repo[3]);
    
    
  }
  
  
}
