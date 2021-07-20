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
    
    public static void main (String args[]){
        Personaje a = new Aldeano();
        a = new Elfo();
        a = new Heroe();
    }
}