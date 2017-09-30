package pe.uch.ventacarlossoto.service;

import pe.uch.ventacarlossoto.model.Categoria;

public class VentaService {
    
    public static Categoria[] categorias;
    
    static {
        categorias = new Categoria[]{
            new Categoria(1, "PROGRAMACION", 800.0, 0.05, 0.07),
            new Categoria(2, "OFIMATICA", 500.0, 0.03, 0.05),
            new Categoria(3, "ADMINISTRACION", 1800.0, 0.08, 0.10),
            new Categoria(4, "OTROS", 1000.0, 0.04, 0.06)
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
