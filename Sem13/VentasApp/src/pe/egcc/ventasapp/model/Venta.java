package pe.egcc.ventasapp.model;

import java.util.Vector;

public class Venta {

    // INPUT
    private String cliente;
    private String articulo;
    private Double precio;
    private Integer cantidad;

    // OUTPUT
    private Double importe;
    private Double impuesto;
    private Double total;

    public Venta() {
    }

    public Venta(String cliente, String articulo, Double precio, Integer cantidad) {
        this.cliente = cliente;
        this.articulo = articulo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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
            cliente, articulo, precio, cantidad, importe, impuesto, total
        };
        return rowData;
    }

}
