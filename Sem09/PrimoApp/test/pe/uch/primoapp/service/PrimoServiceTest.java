package pe.uch.primoapp.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimoServiceTest {
  
  public PrimoServiceTest() {
  }
  
  @Test
  public void testEsPrimo() {
    System.out.println("esPrimo");
    int n = 2;
    PrimoService instance = new PrimoService();
    boolean expResult = true;
    boolean result = instance.esPrimo(n);
    assertEquals(expResult, result);
  }
  
}
