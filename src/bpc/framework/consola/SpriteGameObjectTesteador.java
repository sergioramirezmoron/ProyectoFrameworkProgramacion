package bpc.framework.consola;

import bpc.daw.consola.Consola;
import bpc.daw.consola.Sprite;

import java.awt.*;

public class SpriteGameObjectTesteador extends GameObject {
    private Sprite sprite;

    public SpriteGameObjectTesteador(Image image, int x, int y) {
        this.sprite = new Consola().getCapaSprites().crearSprite(image, new Rectangle(new Point(x, y)), x, y);
    }

    @Override
    public void inicializar() {
    }

    @Override
    public void ejecutarFrame() {
        if (consola.getTeclado().teclaPulsada(38)) {
            this.sprite.moverY(10);
        } else if (consola.getTeclado().teclaPulsada(40)) {
            this.sprite.moverY(-10);
        } else if (consola.getTeclado().teclaPulsada(37)) {
            this.sprite.moverX(-10);
        } else if (consola.getTeclado().teclaPulsada(39)) {
            this.sprite.moverY(10);
        }
    }

    @Override
    public void finalizar() {
    }
}
