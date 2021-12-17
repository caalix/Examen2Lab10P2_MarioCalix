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
public class Ataque extends Carro{
    //porcentaje de ataque extra de 50% - 100%
    
    private int porcentaje;
    
    Random random = new Random();
    int n = 1 + random.nextInt(2);

    public int getPorcentaje() {
        return porcentaje;
    }

    public Ataque(String nombre, int derrape, int velocidad, int ataque, int vida) {
        super(nombre, derrape, velocidad, ataque, vida);
    }

    @Override
    public void setAtaque(int ataque) {
        super.setAtaque(ataque+(ataque/n)); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
