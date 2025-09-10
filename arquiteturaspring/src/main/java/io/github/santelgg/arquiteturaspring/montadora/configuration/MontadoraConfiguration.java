package io.github.santelgg.arquiteturaspring.montadora.configuration;

import io.github.santelgg.arquiteturaspring.montadora.Motor;
import io.github.santelgg.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setHp(120);
        motor.setCilindros(4);
        motor.setLitragem(1.4);
        motor.setModelo("VTEC");
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setHp(90);
        motor.setCilindros(0);
        motor.setLitragem(0.0);
        motor.setModelo("LIQUIDIFICADOR");
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setHp(280);
        motor.setCilindros(4);
        motor.setLitragem(1.6);
        motor.setModelo("VVTI");
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }

}
