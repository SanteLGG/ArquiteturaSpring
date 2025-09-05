package io.github.santelgg.arquiteturaspring.montadora.configuration;

import io.github.santelgg.arquiteturaspring.montadora.Motor;
import io.github.santelgg.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setHp(120);
        motor.setCilindros(4);
        motor.setLitragem(1.4);
        motor.setModelo("VTEC");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

}
