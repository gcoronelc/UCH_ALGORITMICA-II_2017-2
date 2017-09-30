package pe.uch.programandoando.model;

public class Tramo {

    // Datos conocidos
    private int id;
    private double rango;
    private double precio;

    // Datos a calcular
    private double consumo;
    private double importe;

    public Tramo() {
    }

    public Tramo(int id, double rango, double precio) {
        this.id = id;
        this.rango = rango;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRango() {
        return rango;
    }

    public void setRango(double rango) {
        this.rango = rango;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
