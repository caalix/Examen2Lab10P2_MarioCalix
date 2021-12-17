
package examen2lab10p2_mariocalix;

import java.util.Random;

public class Malvado extends Carro{

    public Malvado(String nombre, int derrape, int velocidad, int ataque, int vida) {
        super(nombre, derrape, velocidad, ataque, vida);
    }
    //vida de 1000-5000 y ataque de 300-700, solo ciber errol lo usa

    Random random = new Random();
    int n = 1000 + random.nextInt(5000);
    int q = 300 + random.nextInt(700);
    
    @Override
    public void setVida(int vida) {
        super.setVida(vida+n); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque+q); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
