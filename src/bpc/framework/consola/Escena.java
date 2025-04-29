package bpc.framework.consola;

import bpc.daw.consola.Consola;

import java.util.List;

public abstract class Escena implements ElementoJuego {
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;

    public Escena() {
        this.juego = null;
        this.consola = null;
        this.objetos = null;
        this.añadirObjetosIniciales();
    }

    protected abstract void añadirObjetosIniciales();

    public void añadir(GameObject obj) {
        obj.juego = this.juego;
        obj.consola = this.consola;
        obj.escena = this;
        obj.inicializar();
    }

    public void retirar(GameObject obj) {
        obj.finalizar();
        this.objetos.remove(obj);
        obj.consola = null;
        obj.escena = null;
    }

    @Override
    public void ejecutarFrame() {
        for (int i = 0; i < this.objetos.size(); i++) {
            this.objetos.get(i).ejecutarFrame();
        }
    }

    @Override
    public void finalizar() {
        for (int i = 0; i < this.objetos.size(); i++) {
            this.objetos.remove(i);
        }
    }
}
