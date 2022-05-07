package model;

public class SorveteMorango implements Sorvete {

    public float valor;

    public SorveteMorango() {
    }

    public SorveteMorango(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return "Sorvete de Morango";
    }
}
