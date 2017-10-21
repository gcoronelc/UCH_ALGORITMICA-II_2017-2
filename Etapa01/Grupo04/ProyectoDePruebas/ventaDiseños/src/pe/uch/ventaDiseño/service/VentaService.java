package pe.uch.ventaDiseño.service;

import pe.uch.ventaDiseño.model.Categoria;

public class VentaService {
    
    public static Categoria[] categorias;
    
    static {
        categorias = new Categoria[]{
            new Categoria(1, "DISEÑO VIDEOJUEGOS ", 150.0, 0.07, 0.03),
            new Categoria(2, "DISEÑO WEB ", 1400.0, 0.09, 0.75),
            new Categoria(3, "DISEÑO GRAFICO  ", 175.0, 0.12, 0.23),
            new Categoria(4, "DISEÑO TIPOGRAFICO ", 200.0, 0.35, 0.54)
        };
    }
    
    
    public static double[] procesarVenta(Categoria cat, int cantPart){
        // Variables
        double precio, importe, impuesto, total, porcGana, ganancia;
        // Proceso
        precio = dosDec(cat.getPrecio());
        total = dosDec(precio * cantPart);
        importe = dosDec(total / 1.18);
        impuesto = dosDec(total - importe);
        porcGana = cat.getGanancia1();
        if( cantPart > 12 ){
            porcGana = cat.getGanancia2();
        }
        ganancia = dosDec(importe * porcGana);
        // Reporte
        double[] repo = {precio,importe,impuesto,total,porcGana,ganancia};
        return repo;
    }
    
    private static double dosDec( double valor){
        valor *= 100;
        valor = Math.round(valor);
        valor /= 100.0;
        return valor;
    }
}
