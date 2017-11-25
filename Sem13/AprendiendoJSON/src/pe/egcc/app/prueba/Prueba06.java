package pe.egcc.app.prueba;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import pe.egcc.app.model.Venta;

public class Prueba06 {

    public static void main(String[] args) {

        String archivo = "D:\\EGCC\\Ventas.DAT";
        FileReader fileReader = null;
        Gson gson = new Gson();

        try {
            fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String json = bufferedReader.readLine();

            while (json != null) {
                
                Venta venta = gson.fromJson(json, Venta.class);
                System.out.println(venta.getNombre() + " - " 
                    + venta.getPrecio() + " - " 
                    + venta.getCantidad() + " - " 
                    + venta.getImporte() );
                
                json= bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (Exception e) {
            }
        }

    }

}
