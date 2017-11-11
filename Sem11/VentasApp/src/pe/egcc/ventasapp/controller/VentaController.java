package pe.egcc.ventasapp.controller;

import java.util.List;
import pe.egcc.ventasapp.model.Venta;
import pe.egcc.ventasapp.service.VentaService;

public class VentaController {

    private VentaService ventaService;

    public VentaController() {
        ventaService = new VentaService();
    }

    public Venta procesarVenta(Venta venta) {
        return ventaService.procesarVenta(venta);
    }

    public void registrarVenta(Venta venta) {
        ventaService.registrarVenta(venta);
    }

    public List<Venta> leerVentas() {
        return ventaService.leerVentas();
    }
}
