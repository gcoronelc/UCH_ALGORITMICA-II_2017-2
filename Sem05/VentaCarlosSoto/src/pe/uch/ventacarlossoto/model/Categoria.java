package pe.uch.ventacarlossoto.model;

public class Categoria {

    private int item;
    private String descripcion;
    private double precio;
    private double ganancia1;
    private double ganancia2;

    public Categoria() {
    }

    public Categoria(int item, String descripcion, double precio, double ganancia1, double ganancia2) {
        this.item = item;
        this.descripcion = descripcion;
        this.precio = precio;
        this.ganancia1 = ganancia1;
        this.ganancia2 = ganancia2;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getGanancia1() {
        return ganancia1;
    }

    public void setGanancia1(double ganancia1) {
        this.ganancia1 = ganancia1;
    }

    public double getGanancia2() {
        return ganancia2;
    }

    public void setGanancia2(double ganancia2) {
        this.ganancia2 = ganancia2;
    }

    @Override
    public String toString() {
        return item + " - " + descripcion;
    }

    
}
