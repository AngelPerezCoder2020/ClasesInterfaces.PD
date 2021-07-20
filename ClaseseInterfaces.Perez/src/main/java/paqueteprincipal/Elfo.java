package paqueteprincipal;

public class Elfo extends Personaje implements guerrero{
    @Override
    public void modificarVida() {
        System.out.println("modifica la vida**");
    }
    @Override
    public void atacar() {
        System.out.println("ataca**");
    }
    
}
