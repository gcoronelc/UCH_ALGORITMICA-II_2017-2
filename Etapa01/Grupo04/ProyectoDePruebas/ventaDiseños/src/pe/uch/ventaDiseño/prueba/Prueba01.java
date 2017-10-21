package pe.uch.ventaDiseño.prueba;

import pe.uch.ventaDiseño.model.Categoria;
import pe.uch.ventaDiseño.service.VentaService;

public class Prueba01 {

    public static void main(String[] args) {
        // Dato
        Categoria cat = VentaService.categorias[0];
        int cantParc = 15;
        // Proceso
        double[] repo = VentaService.procesarVenta(cat, cantParc);
        // Reporte
        System.out.println("Precio: " + repo[0]);
        System.out.println("Importe: " + repo[1]);
        System.out.println("Impuesto: " + repo[2]);
        System.out.println("Total: " + repo[3]);
        System.out.println("Porc. Gana.: " + repo[4]);
        System.out.println("Ganancia: " + repo[5]);
    }
    
}
