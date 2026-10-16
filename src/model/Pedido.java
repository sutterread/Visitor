package model;

import visitor.CalculadorTotalVisitor;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final List<Producto> productos;

    public Pedido() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(int cantidad,Producto producto){

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        for (int i = 0; i < cantidad; i++) {
            productos.add(producto);
        }
    }

    public CalculadorTotalVisitor calcularCostos(){
        CalculadorTotalVisitor calculadorTotalVisitor = new CalculadorTotalVisitor();
        productos.forEach(producto -> producto.aceptar(calculadorTotalVisitor));
        return calculadorTotalVisitor;
    }
}
