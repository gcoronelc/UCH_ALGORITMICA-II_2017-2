package pe.uch.precioventaapp.service;

public class PrecioVentaService {

  public static double[] procesarLote(
    int tamLote, double precioLote,
    double porcGastosAdm, double porcGanUnidad
  ) {
    // Variables
    double uniComer, cosLote, cosUnidad, preVenta;
    // Proceso
    uniComer= tamLote*0.9;
    double gastosAdm= precioLote * porcGastosAdm / 100; 
    cosLote = gastosAdm + precioLote;
    cosUnidad = cosLote/uniComer;
    double ganancia=cosUnidad*porcGanUnidad/100;
    preVenta=ganancia+cosUnidad;
    // Reporte
    double[] repo = {uniComer,cosLote,cosUnidad,preVenta};
    return repo;
  }

}
