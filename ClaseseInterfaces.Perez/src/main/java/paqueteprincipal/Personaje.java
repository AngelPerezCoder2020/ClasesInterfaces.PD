package paqueteprincipal;

public abstract class Personaje {
    private String nombre;
    private int vida;
    
    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }
    public abstract void modificarVida();
}
