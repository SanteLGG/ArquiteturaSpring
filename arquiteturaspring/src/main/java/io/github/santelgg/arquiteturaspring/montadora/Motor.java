package io.github.santelgg.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private Integer hp;
    private Integer cilindros;
    private Double litragem;
    private TipoMotor tipoMotor;

//    getter and setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", hp=" + hp +
                ", cilindros=" + cilindros +
                ", litragem=" + litragem +
                ", tipoMotor=" + tipoMotor +
                '}';
    }
}
