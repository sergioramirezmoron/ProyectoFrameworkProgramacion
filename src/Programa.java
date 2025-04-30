import bpc.framework.consola.EscenaTesteadora;
import bpc.framework.consola.Juego;
import bpc.framework.consola.Resolucion;
import bpc.framework.consola.SpriteGameObjectTesteador;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        try {
            Image image = ImageIO.read(new File("src/bpc/framework/consola/sprite.jpg"));
            SpriteGameObjectTesteador tester = new SpriteGameObjectTesteador(image, 100, 100);
            EscenaTesteadora escena = new EscenaTesteadora();
            Juego juego = new Juego();
            juego.iniciar(escena, Resolucion.VENTANA_QHD);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}