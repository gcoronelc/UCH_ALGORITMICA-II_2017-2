package pe.uch.programandoando.service;

import java.util.Arrays;
import java.util.stream.Collectors;
import pe.uch.programandoando.model.Tramo;

public class VentaService {

    public static Tramo[] procesarVenta(double consumoTotal){
        // Variable
        Tramo[] repo;
        // Preparar reporte
        repo = generarArreglo();
        // Procesar
        for (Tramo r : repo) {
            // Control del bucle
            if( consumoTotal <= 0 ){
                break;
            }
            // Calculos
            double consumo = r.getRango();
            if( consumoTotal < consumo ){
                consumo = consumoTotal;
            }
            double importe = consumo * r.getPrecio();
            // Actualizar bean
            r.setConsumo(consumo);
            r.setImporte(importe);
            // Actualizar el consumo total
            consumoTotal -= consumo;
        }
        // Retorno
        repo = filtrar(repo);
        return repo;
    }
    
    public static double calcTotal(Tramo[] repo){
        double total = 0.0;
        for (Tramo r : repo) {
            total += r.getImporte();
        }
        return total;
    }

    private static Tramo[] generarArreglo() {
        Tramo[] repo = {
            new Tramo(1, 4, 10.0),
            new Tramo(2, 4, 8.0),
            new Tramo(3, 4, 6.0),
            new Tramo(4, 100000, 4.0)
        };
        return repo;
    }

    private static Tramo[] filtrar(Tramo[] repo) {
        int filas = 0;
        for (Tramo r : repo) {
            if( r.getImporte() > 0){
                filas++;
            }
        }
        /*
        Tramo[] repo2 = new Tramo[filas];
        for (int i = 0; i < filas; i++) {
            repo2[i] = repo[i];
        }
        */
        Tramo[] repo2 = Arrays.copyOf(repo, filas);
        return repo2;
    }
    
}
