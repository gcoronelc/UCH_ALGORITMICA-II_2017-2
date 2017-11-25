package pe.egcc.app.prueba;

import com.google.gson.Gson;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.app.model.Venta;

public class Prueba05 {

    public static void main(String[] args) {

        List<Venta> lista = new ArrayList<>();

        lista.add(new Venta("Leche", 5.50, 10));
        lista.add(new Venta("Pan de molde", 8.50, 4));
        lista.add(new Venta("Paneton Donofrio", 30.00, 60));
        lista.add(new Venta("Pavo Kilo", 16.0, 15));
        lista.add(new Venta("Chocolate", 4.30, 8));

        String archivo = "D:\\EGCC\\Ventas.DAT";
        PrintStream printStream = null;
        Gson gson = new Gson();
        
        try {
            FileOutputStream stream= new FileOutputStream(archivo, true);
            printStream = new PrintStream(stream);
            for (Venta venta : lista) {
                String json = gson.toJson(venta);
                printStream.println(json);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                printStream.close();
            } catch (Exception e) {
            }
        }




    }

}
