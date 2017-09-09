package pe.egcc.ventaapp.service;

public class VentaService {
    
    public static double calcTotal(double precio, int cant){
        // Variable
        double total;
        // Proceso
        total = precio * cant;
        // Retorno
        return total;
    }
    
    public static double calcImporte( double total){
        // Variable
        double importe;
        // Proceso
        importe = total / 1.18;
        // Retorno
        return importe;
    }
    
    public static double calcImpuesto( double total){
        // Variable
        double impuesto;
        // Proceso
        impuesto = total - calcImporte(total);
        // Retorno
        return impuesto;
    }
        
}
