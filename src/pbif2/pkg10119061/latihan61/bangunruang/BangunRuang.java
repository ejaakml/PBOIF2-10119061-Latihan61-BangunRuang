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
public abstract class BangunRuang {
    private int r;

    public BangunRuang(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }
    
    public abstract double hitungVolume();
    
    public abstract void tampilHasil();
}
