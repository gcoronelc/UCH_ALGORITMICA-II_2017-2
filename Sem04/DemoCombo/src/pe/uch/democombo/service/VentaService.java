package pe.uch.democombo.service;

import pe.uch.democombo.model.Producto;

public class VentaService {

    public static Producto[] productos;
    
    static {
        productos = new Producto[]{
            new Producto("Producto A", 100.0, 530),
            new Producto("Producto B", 150.0, 260),
            new Producto("Producto C", 180.0, 500),
            new Producto("Producto D", 850.0, 250),
            new Producto("Producto E", 340.0, 150)
        };
    }

    
    public static double[] procesar(Producto bean, int cant){
        // Variables
        double importe, impuesto, total;
        // Proceso
        total = bean.getPrecio() * cant;
        importe = total / 1.18;
        impuesto = total - importe;
        bean.setStock(bean.getStock() - cant);
        // Retorno
        double repo[] = {importe, impuesto, total};
        return repo;
    }
}
