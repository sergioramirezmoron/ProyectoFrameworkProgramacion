package bpc.framework.consola;

import bpc.daw.consola.Sprite;

import java.awt.*;

public abstract class SpriteGameObject extends GameObject {
    private Sprite sprite;
    private Image imagen;
    private Point puntoInicial;

    public SpriteGameObject(Image img, int x, int y) {
        this.sprite = null;
        this.imagen = img;
    }

    public int getX() {
        return this.puntoInicial.x;
    }

    public int getY() {
        return this.puntoInicial.y;
    }

    public int getAnchura() {
        return (int) this.sprite.getAnchura();
    }

    public int getAltura() {
        return (int) this.sprite.getAltura();
    }

    public void moverX(int cx) {
        this.sprite.moverX(cx);
    }

    public void moverY(int cy) {
        this.sprite.moverY(cy);
    }

    public void setX(int x) {
        this.sprite.moverX(this.sprite.getX() - x);
    }

    public void setY(int y) {
        this.sprite.moverY(this.sprite.getY() - y);
    }

    @Override
    public void inicializar() {
        this.consola.getCapaSprites().crearSprite(this.imagen, new Rectangle(this.getAnchura(), this.getAltura()), this.getX(), this.getY());
    }

    @Override
    public void finalizar() {
        this.consola.getCapaSprites().eliminarSprite(this.sprite);
    }
}
