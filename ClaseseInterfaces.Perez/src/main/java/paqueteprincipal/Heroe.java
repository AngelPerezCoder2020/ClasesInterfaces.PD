package paqueteprincipal;

public class Heroe extends Personaje implements guerrero{
    @Override
    public void modificarVida(){
        System.out.println("modifica vida**");
    }
    @Override
    public void atacar(){
        System.out.println("ataca**");
    }
}
