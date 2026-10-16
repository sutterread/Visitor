package visitor;

import model.*;

public class CalculadorEnvioVisitor implements Visitante{

    private double totalEnvio =0;

    public double getTotalEnvio() {
        return totalEnvio;
    }

    @Override
    public void visitar(Tablet tablet) {
        calcularEnvio(tablet);
    }

    @Override
    public void visitar(Television television) {
        calcularEnvio(television);
    }

    @Override
    public void visitar(Portatil portatil) {
        calcularEnvio(portatil);
    }

    @Override
    public void visitar(ComputadoraTorre computadoraTorre) {
        calcularEnvio(computadoraTorre);
    }

    private void calcularEnvio(Producto producto){
        double porcentajeEnvio = (producto.getPeso()/100.0)*2;
        totalEnvio += porcentajeEnvio* producto.getPrecio()/100.0;
    }
}
