package bpc.framework.consola.test;

import bpc.framework.consola.Resolucion;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ResolucionTest {
    @Test
    public void testGetResolucion() {
        Dimension[] esperadas = {
                new Dimension(4096, 2160),
                new Dimension(1920, 1080),
                new Dimension(2560, 1440),
                new Dimension(800, 600)
        };

        Resolucion[] constantes = {
                Resolucion.VENTANA_4K,
                Resolucion.VENTANA_FULLHD,
                Resolucion.VENTANA_QHD,
                Resolucion.VENTANA_VGA
        };

        for (int i = 0; i < constantes.length; i++) {
            Dimension actual = constantes[i].getResolucion();
            Dimension esperada = esperadas[i];

            assertEquals(esperada.width, actual.width);
            assertEquals(esperada.height, actual.height);
        }
    }
}