package bpc.framework.consola;

public abstract class Escena implements ElementoJuego{
    protected Juego juego;
    protected Consola consola;
    private List<GameObject> objetos;

    public Escena(){
        this.juego = null;
        this.consola = null;
        this.objetos = null;
    }

    protected abstract void añadirObjetosIniciales();
    public void añadir(GameObject obj){
        
    }
}
