package model;

public class Nozes extends SorveteDecorator {
    public Nozes(Sorvete sorvete) {
        super(sorvete);
    }

    public float getValorAcrescimo() {
        return 4.8f;
    }

    public String getDescricaoAcrescimo() {
        return "Nozes";
    }
}
