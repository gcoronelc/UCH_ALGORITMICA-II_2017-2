package pe.egcc.ventasapp.model;

import java.util.Vector;

public class Resumen {

    private String nombre;
    private double precio;
    private Integer cantidad;
    private Double importe;
    private Double impuesto;
    private Double total;

    public Resumen() {
    }

    public Resumen(String nombre, double precio) {
        this(nombre, precio, 0, 0.0, 0.0, 0.0);
    }

    public Resumen(String nombre, double precio, Integer cantidad, Double importe, Double impuesto, Double total) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
        this.impuesto = impuesto;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Object[] toRowData() {
        Object[] rowData = {
            nombre, precio, cantidad, importe, impuesto, total
        };
        return rowData;
    }

}
