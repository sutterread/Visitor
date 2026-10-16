package visitor;

import model.*;

public class CalculadorSubtotalVisitor implements Visitante{
    private double subtotal =0;

    public double getSubtotal() {
        return subtotal;
    }

    @Override
    public void visitar(Tablet tablet) {
        calcularSubtotal(tablet);
    }

    @Override
    public void visitar(Television television) {
        calcularSubtotal(television);
    }

    @Override
    public void visitar(Portatil portatil) {
        calcularSubtotal(portatil);
    }

    @Override
    public void visitar(ComputadoraTorre computadoraTorre) {
        calcularSubtotal(computadoraTorre);
    }

    private void calcularSubtotal(Producto producto){
        subtotal += producto.getPrecio();
    }
}
