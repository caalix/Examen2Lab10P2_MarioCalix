
package examen2lab10p2_mariocalix;

import java.io.Serializable;

public class Carro implements Serializable{
    private String nombre;
    private int derrape,velocidad,ataque, vida;
    
    private static final long SerialVersionUID=777L;

    public Carro() {
    }

    public Carro(String nombre, int derrape, int velocidad, int ataque, int vida) {
        this.nombre = nombre;
        this.derrape = derrape;
        this.velocidad = velocidad;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDerrape() {
        return derrape;
    }

    public void setDerrape(int derrape) {
        this.derrape = derrape;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
