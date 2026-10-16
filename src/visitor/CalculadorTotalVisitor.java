package visitor;

import model.ComputadoraTorre;
import model.Portatil;
import model.Tablet;
import model.Television;

public class CalculadorTotalVisitor implements Visitante{

    private final CalculadorSubtotalVisitor subtotal = new CalculadorSubtotalVisitor();
    private final CalculadorEnvioVisitor envio = new CalculadorEnvioVisitor();

    @Override
    public void visitar(Tablet tablet) {
        subtotal.visitar(tablet);
        envio.visitar(tablet);
    }

    @Override
    public void visitar(Television television) {
        subtotal.visitar(television);
        envio.visitar(television);
    }

    @Override
    public void visitar(Portatil portatil) {
        subtotal.visitar(portatil);
        envio.visitar(portatil);
    }

    @Override
    public void visitar(ComputadoraTorre computadoraTorre) {
        subtotal.visitar(computadoraTorre);
        envio.visitar(computadoraTorre);
    }

    public double getTotal(){
        return subtotal.getSubtotal() + envio.getTotalEnvio();
    }

    public double getSubtotal(){
        return subtotal.getSubtotal();
    }

    public double getEnvio(){
        return envio.getTotalEnvio();
    }
}
