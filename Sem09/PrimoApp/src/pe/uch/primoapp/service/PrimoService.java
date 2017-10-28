package pe.uch.primoapp.service;

public class PrimoService {

  public boolean esPrimo(int n) {
    int contDivisores = 0;
    for (int i = 1; i <= n; i++) {
      contDivisores += ((n % i == 0) ? 1 : 0);
    }
    return (contDivisores == 2);
  }

}
