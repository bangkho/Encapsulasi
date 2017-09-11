
package Prakitikum2;

public class Bola {
    private double jariJari;
    
    public Bola(){
        jariJari=0;
    }
    //setter jari-jari
    public void setJarijari(double jari){
        jariJari = jari;
    }
    
    //Aksesor = Mengambil
    public void showDiameter(){
        double diameter;
        diameter = 2*jariJari;
        System.out.println("Diameter Bola = "+diameter);
    }
    
    public void showLuasPermukaan(){
        double lp;
        lp = 4*Math.PI*jariJari*jariJari;
        System.out.println("Luas Permukaan Bola = "+lp);
    }
    
    public void showVolume(){
        double volume;
        volume = (4/3)*Math.PI*jariJari*jariJari*jariJari;
        System.out.println("Diameter Bola = "+volume);
    }
}
