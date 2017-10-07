package pe.uch.pedidoapp.service;

public class PedidoService {
   
    public double calcImpuesto(double importe){
        // Variables
        double impuesto;
        // Proceso
        impuesto= importe * 0.18;
        // Retorno
        return dosDec(impuesto);
    }
    
    public double calcTotal(double importe){
        // Variables
        double total;
        // Proceso
        total = importe + calcImpuesto(importe);
        // Retorno
        return dosDec(total);
    }

    private double dosDec(double valor) {
        valor *= 100;
        valor = Math.round(valor);
        valor /= 100.0;
        return valor;
    }
    
    
    
}
