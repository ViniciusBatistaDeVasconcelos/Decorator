package model;

public class Cereja extends SorveteDecorator {
    public Cereja(Sorvete sorvete) {
        super(sorvete);
    }

    public float getValorAcrescimo() {
        return 4.25f;
    }

    public String getDescricaoAcrescimo() {
        return "Cereja";
    }
}
