package bpc.framework.consola;

import bpc.daw.consola.Consola;

public class Juego {
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public void iniciar(Escena e, Resolucion r) {
        this.consola = new Consola("Consola", this.getAnchuraPantalla(), this.getAlturaPantalla());
        this.resolucion = r;
        this.setEscena(e);
        this.detener = false;
        while (!this.detener || !this.consola.getTeclado().teclaPulsada(27)) {
            this.escena.ejecutarFrame();
            this.consola.esperarSiguienteFrame();
        }
    }

    public Escena getEscena() {
        return this.escena;
    }

    public void setEscena(Escena e) {
        this.escena = e;
        this.escena.juego = this;
        this.escena.consola = this.consola;
        this.escena.inicializar();
    }

    public void detener() {
        this.detener = true;
    }

    public int getAnchuraPantalla() {
        return this.resolucion.getResolucion().width;
    }

    public int getAlturaPantalla() {
        return this.resolucion.getResolucion().height;
    }
}

