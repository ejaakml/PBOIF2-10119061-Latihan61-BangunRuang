/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbif2.pkg10119061.latihan61.bangunruang;

/**
 *
 * @author Rheiza
 */
public class Bola extends BangunRuang{

    public Bola(int r) {
        super(r);
    }
    
    @Override
    public double hitungVolume(){
        return (4 * 3.14 * (getR() * getR() * getR()))/3;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Volume Bola : " + hitungVolume() + " cm3");
    }
    
}
