package io.github.santelgg.arquiteturaspring.montadora;

import java.awt.*;

public class HondaCivic extends Carro{
    public HondaCivic(Motor motor) {
        super(motor);
        setModelo("Civic");
        setCor(Color.BLACK);
        setMontadora(Montadora.HONDA);
    }


}
