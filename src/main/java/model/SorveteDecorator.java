package model;

public abstract class SorveteDecorator implements Sorvete {

    private Sorvete sorvete;
    public String descricao;

    public SorveteDecorator(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public Sorvete getSorvete() {
        return sorvete;
    }

    public void setSorvete(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public abstract float getValorAcrescimo();

    public float getValor() {
        return this.sorvete.getValor() + this.getValorAcrescimo();
    }

    public abstract String getDescricaoAcrescimo();

    public String getDescricao() {
        return this.sorvete.getDescricao() + "/" + this.getDescricaoAcrescimo();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
