package model;

public class Granulado extends SorveteDecorator {
    public Granulado(Sorvete sorvete) {
        super(sorvete);
    }

    public float getValorAcrescimo() {
        return 2.3f;
    }

    public String getDescricaoAcrescimo() {
        return "Granulado";
    }
}
