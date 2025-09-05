package io.github.santelgg.arquiteturaspring.montadora;

public class Chave {
    private Montadora montadora;
    private String tipo;

//    getter and setters
    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
