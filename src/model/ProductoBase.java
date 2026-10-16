package model;

public abstract class ProductoBase implements Producto{
    private final String nombre;
    private final double precio;
    private final double peso;

    protected ProductoBase(String nombre, double precio, double peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public double getPrecio() {
        return precio;
    }
    @Override
    public double getPeso() {
        return peso;
    }
}
