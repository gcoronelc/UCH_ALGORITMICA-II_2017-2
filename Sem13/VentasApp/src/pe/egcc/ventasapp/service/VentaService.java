package pe.egcc.ventasapp.service;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventasapp.model.Producto;
import pe.egcc.ventasapp.model.Resumen;
import pe.egcc.ventasapp.model.Venta;

public class VentaService {
    
    private final String ARCHIVO = "D:\\EGCC\\TodoVentas.DAT";
    private Gson gson;

    public VentaService() {
        gson = new Gson();
    }
    
    private boolean existeArchivo( String archivo){
        File file = new File(archivo);
        boolean existe = file.exists();
        return existe;
    }
    
    public Venta procesarVenta( Venta venta ){
        // Variables
        Double importe, impuesto, total;
        // Proceso
        total = venta.getPrecio() * venta.getCantidad();
        importe = total / 1.18;
        impuesto = total - importe;
        // Respuesta
        venta.setTotal(dosDec(total));
        venta.setImporte(dosDec(importe));
        venta.setImpuesto(dosDec(impuesto));
        // Salida
        return venta;
    }
    
    public void registrarVenta(Venta venta){
        PrintStream printStream = null;
        try{
            String json = gson.toJson(venta);
            FileOutputStream stream= new FileOutputStream(ARCHIVO, true);
            printStream = new PrintStream(stream);
            printStream.println(json);
        } catch( Exception e ){
            throw new RuntimeException("Error en el proceso.");
        } finally{
            try {
                printStream.close();
            } catch (Exception e) {
            }
        }
    }
    
    public List<Venta> leerVentas(){
        return Data.ventas;
    }
            
    public double dosDec(double valor){
        valor *= 100.0;
        valor = Math.round(valor);
        valor /= 100.0;
        return valor;
    }
    
    public List<Producto> leerProductos(){
        return Data.productos;
    }
    
    public List<Resumen> leerResumen(){
        List<Resumen> repo = new ArrayList<>();
        
        for (Producto p : Data.productos) {
            repo.add(new Resumen(p.getNombre(), p.getPrecio()));
        }
        
        for(Venta venta: Data.ventas){
            
            for(Resumen r: repo){
                if(venta.getArticulo().equals(r.getNombre())){
                    r.setCantidad(r.getCantidad() + venta.getCantidad());
                    r.setImporte(r.getImporte()+ venta.getImporte());
                    r.setImpuesto(r.getImpuesto()+ venta.getImpuesto());
                    r.setTotal(r.getTotal()+ venta.getTotal());
                    break;
                }
            }
            
        }
        
        int fila = 0;
        while(fila < repo.size()){
            if(repo.get(fila).getCantidad() == 0){
                repo.remove(fila);
            } else {
                fila++;
            }
        }
        
        return repo;
    }
    
}
