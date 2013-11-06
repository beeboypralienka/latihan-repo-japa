/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectrepojapa;

/**
 *
 * @author asus
 */
public class Segitiga {

    double alas, tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double luasSegitia(double alas, double tinggi){
        return (alas/2)*tinggi;
    }

}
