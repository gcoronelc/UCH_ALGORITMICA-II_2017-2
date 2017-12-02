package pe.egcc.app.prueba;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.model.Venta;

public class Prueba01 {

    public static void main(String[] args) {
        
        List<Venta> lista = new ArrayList<>();
        
        lista.add(new Venta("Leche", 5.50, 10));
        lista.add(new Venta("Pan de molde", 8.50, 4));
        lista.add(new Venta("Paneton Donofrio", 30.00, 60));
        lista.add(new Venta("Pavo Kilo", 16.0, 15));
        lista.add(new Venta("Chocolate", 4.30, 8));
        
        
        Gson gson = new Gson();
        String json = gson.toJson(lista);
        
        System.out.println("JSON: " + json);
        
    }
    
}
