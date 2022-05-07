package model;

public class Caramelo extends SorveteDecorator {
    public Caramelo(Sorvete sorvete) {
        super(sorvete);
    }

    public float getValorAcrescimo() {
        return 3.5f;
    }

    public String getDescricaoAcrescimo() {
        return "Caramelo";
    }
}
