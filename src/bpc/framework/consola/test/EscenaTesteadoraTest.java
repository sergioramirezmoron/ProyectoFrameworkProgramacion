package bpc.framework.consola.test;

import bpc.framework.consola.EscenaTesteadora;
import org.junit.Test;

import static org.junit.Assert.*;

public class EscenaTesteadoraTest {
    @Test
    public void test1() {
        EscenaTesteadora escenaTesteadora = new EscenaTesteadora();
        assertFalse(escenaTesteadora.getTester().inicializado());
        escenaTesteadora.inicializar();
        for (int i = 0; i < 1253; i++) {
            escenaTesteadora.ejecutarFrame();
        }
        assertEquals(1253, escenaTesteadora.getTester().frameCounter());
        escenaTesteadora.finalizar();
        assertEquals(false, escenaTesteadora.getTester().inicializado());
    }


}