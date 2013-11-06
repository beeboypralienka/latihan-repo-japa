/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package projectrepojapa;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Ini adalah project repo japa!");
        JOptionPane.showMessageDialog(null, "Hanya untu latihan pemahaman Git :)");

//        KelasAnak ka = new KelasAnak();
//        ka.setNama("Joko");
//        ka.setUmur(17);
//        JOptionPane.showMessageDialog(null, ka.getNama()+" "+ka.getUmur());

        Segitiga sg = new Segitiga();
        sg.setAlas(Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai alas: ")));
        //double a = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai alas: "));
        sg.setTinggi(Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai tinggi: ")));
        //double t = Double.parseDouble(JOptionPane.showInputDialog("Masukkan nilai tinggi: "));
        JOptionPane.showMessageDialog(null, sg.luasSegitia(sg.getAlas(), sg.getTinggi()));
    }

}
