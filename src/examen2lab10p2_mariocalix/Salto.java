/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab10p2_mariocalix;

import java.util.Random;

/**
 *
 * @author mario
 */
public class Salto extends Carro{
    //cantidad de mnetros que puede saltar aleatorio
    
    private int metros;
    
    Random random = new Random();
    int n = random.nextInt(200);


    public Salto(int metros, String nombre, int derrape, int velocidad, int ataque, int vida) {
        super(nombre, derrape, velocidad, ataque, vida);
        this.metros = metros;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros+n;
    }


    

    
    
    
}
