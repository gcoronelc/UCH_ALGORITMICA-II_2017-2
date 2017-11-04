package pe.egcc.ventasapp.service;

import java.util.List;
import pe.egcc.ventasapp.model.Venta;

public class VentaService {
    
    public Venta procesarVenta( Venta venta ){
        // Variables
        Double importe, impuesto, total;
        // Proceso
        total = venta.getPrecio() * venta.getCantidad();
        importe = total / 1.18;
        impuesto = total - importe;
        // Respuesta
        venta.setTotal(dosDec(total));
        venta.setImporte(dosDec(importe));
        venta.setImpuesto(dosDec(impuesto));
        // Salida
        return venta;
    }
    
    public void registrarVenta(Venta venta){
        Data.ventas.add(venta);
    }
    
    public List<Venta> leerVentas(){
        return Data.ventas;
    }
            
    public double dosDec(double valor){
        valor *= 100.0;
        valor = Math.round(valor);
        valor /= 100.0;
        return valor;
    }
    
}
