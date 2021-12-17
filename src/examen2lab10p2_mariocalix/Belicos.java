package examen2lab10p2_mariocalix;

import java.util.Random;
import java.util.stream.IntStream;

public class Belicos extends Carro {

    //vida extras aleatorias
    private int vidas_extra = 1;

    Random random = new Random();
    int n = random.nextInt(6);

    public Belicos(int vidas_extra, String nombre, int derrape, int velocidad, int ataque, int vida) {
        super(nombre, derrape, velocidad, ataque, vida);
        this.vidas_extra = vidas_extra;
    }

    public int getVidas_extra() {
        return vidas_extra;
    }

    public void setVidas_extra(int vidas_extra) {
        this.vidas_extra = vidas_extra + n;
    }

}
