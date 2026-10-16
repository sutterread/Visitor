package main;

import model.*;
import visitor.CalculadorTotalVisitor;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.agregarProducto(2, new Tablet());
        pedido.agregarProducto(1, new Portatil());
        pedido.agregarProducto(1,new ComputadoraTorre());
        pedido.agregarProducto(1,new Television());

        CalculadorTotalVisitor resultado= pedido.calcularCostos();
        System.out.println("Subtotal: "+resultado.getSubtotal()+"\nEnvio: "+resultado.getEnvio()+
                "\nTotal: "+resultado.getTotal());
    }
}
