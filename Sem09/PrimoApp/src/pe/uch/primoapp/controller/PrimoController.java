package pe.uch.primoapp.controller;

import pe.uch.primoapp.service.PrimoService;

public class PrimoController {

  public boolean esPrimo(int num) {
    PrimoService primoService = new PrimoService();
    return primoService.esPrimo(num);
  }
  
}
