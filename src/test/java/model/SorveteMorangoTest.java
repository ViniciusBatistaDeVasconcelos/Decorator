package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorveteMorangoTest {

    /* ------------------- < Caso 1 > ------------------- */

    @Test
    void deveRetornarValor() {
        Sorvete sorvete = new SorveteMorango(17.0f);

        assertEquals(17.0f, sorvete.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoSorvete() {
        Sorvete sorvete = new SorveteMorango();

        assertEquals("Sorvete de Morango", sorvete.getDescricao());
    }

    /* ------------------- < Caso 2 > ------------------- */

    @Test
    void deveRetornarValorMaisOAcrescimoNozes() {
        Sorvete sorvete = new Nozes(new SorveteMorango(17.0f));

        assertEquals(21.8f, sorvete.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoSorveteComNozes() {
        Sorvete sorvete = new Nozes(new SorveteMorango(17.0f));

        assertEquals("Sorvete de Morango/Nozes", sorvete.getDescricao());
    }

    /* ------------------- < Caso 3 > ------------------- */

    @Test
    void deveRetornarValorMaisOAcrescimoNozesGranulado() {
        Sorvete sorvete = new Granulado(new Nozes(new SorveteMorango(17.0f)));

        assertEquals(24.1f, sorvete.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoSorveteComNozesGranulado() {
        Sorvete sorvete = new Granulado(new Nozes(new SorveteMorango(17.0f)));

        assertEquals("Sorvete de Morango/Nozes/Granulado", sorvete.getDescricao());
    }

    /* ------------------- < Caso 4 > ------------------- */

    @Test
    void deveRetornarValorMaisOAcrescimoNozesGranuladoCereja() {
        Sorvete sorvete = new Cereja(new Granulado(new Nozes(new SorveteMorango(17.0f))));

        assertEquals(28.35f, sorvete.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoSorveteComNozesGranuladoCereja() {
        Sorvete sorvete = new Cereja(new Granulado(new Nozes(new SorveteMorango(17.0f))));

        assertEquals("Sorvete de Morango/Nozes/Granulado/Cereja", sorvete.getDescricao());
    }

    /* ------------------- < Caso 5 > ------------------- */

    @Test
    void deveRetornarValorMaisOAcrescimoNozesGranuladoCerejaCaramelo() {
        Sorvete sorvete = new Caramelo(new Cereja(new Granulado(new Nozes(new SorveteMorango(17.0f)))));

        assertEquals(31.85f, sorvete.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoSorveteComNozesGranuladoCerejaCaramelo() {
        Sorvete sorvete = new Caramelo(new Cereja(new Granulado(new Nozes(new SorveteMorango(17.0f)))));

        assertEquals("Sorvete de Morango/Nozes/Granulado/Cereja/Caramelo", sorvete.getDescricao());
    }
}