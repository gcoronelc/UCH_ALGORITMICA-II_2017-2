package pe.egcc.ventasapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventasapp.model.Venta;

class Data {

    private Data() {
    }

    static List<Venta> ventas;
    
    static {
        ventas = new ArrayList<>();
    }
    
}
