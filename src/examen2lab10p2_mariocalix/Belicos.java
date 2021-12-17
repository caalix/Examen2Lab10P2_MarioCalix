package examen2lab10p2_mariocalix;

import java.util.Random;
import java.util.stream.IntStream;

public class Belicos extends Carro {

    //vida extras aleatorias

    Random random = new Random();
    int n = 200 + random.nextInt(500);

    public Belicos(String nombre, int derrape, int velocidad, int ataque, int vida) {
        super(nombre, derrape, velocidad, ataque, vida);
    }

    @Override
    public void setVida(int vida) {
        super.setVida(vida+n); 
    }

    

}
