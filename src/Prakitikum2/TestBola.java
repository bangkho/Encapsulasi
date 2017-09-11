
package Prakitikum2;

public class TestBola {
    public static void main(String[] args){
        double jariJari=7;
        Bola Bola = new Bola(); //objek baru
        //sebelum di ubah
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        
        System.out.println();
        //setelah diubah
        Bola.setJarijari(jariJari);
        Bola.showDiameter();
        Bola.showLuasPermukaan();
        Bola.showVolume();
        
    }
}
