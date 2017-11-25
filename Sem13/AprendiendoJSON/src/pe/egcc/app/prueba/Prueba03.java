package pe.egcc.app.prueba;

import com.google.gson.Gson;
import pe.egcc.app.model.Venta;

public class Prueba03 {

    public static void main(String[] args) {
        
        String json = "{\"nombre\":\"Leche\",\"precio\":5.5,\"cantidad\":10,\"importe\":55.0}";
        
        Gson gson = new Gson();
        Venta venta = gson.fromJson(json, Venta.class);

        System.out.println("Nombre: " + venta.getNombre());
        System.out.println("Precio: " + venta.getPrecio());
        System.out.println("Cantidad: " + venta.getCantidad());
        System.out.println("Importe: " + venta.getImporte());
        
    }
    
    
}
