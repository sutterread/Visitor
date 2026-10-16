package visitor;

import model.ComputadoraTorre;
import model.Portatil;
import model.Tablet;
import model.Television;

public interface Visitante {
    void visitar(Tablet tablet);
    void visitar(Television television);
    void visitar(Portatil portatil);
    void visitar(ComputadoraTorre computadoraTorre);
}
