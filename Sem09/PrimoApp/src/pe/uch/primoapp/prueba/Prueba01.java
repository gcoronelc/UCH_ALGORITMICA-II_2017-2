package pe.uch.primoapp.prueba;

import pe.uch.primoapp.service.PrimoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    int n = -5;
    // Proceso
    PrimoService service = new PrimoService();
    boolean primo = service.esPrimo(n);
    // Reporte
    System.out.println("Primo: " + primo);
  }
}
