
package Praktikum1;

import java.util.Random;

public class Bus{
    private double penumpang;
    private double maxPenumpang;
    private double counter;
    private double penumpangBaru;
    
    public Bus(double maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
     public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        Random R = new Random();
        double berat;
        berat = R.nextInt(26)+50;
        
        if(temp > maxPenumpang){
            System.out.println("Penumpang Melebihi Kuota");
            System.out.println();
        } else {
            this.penumpang = temp;
            penumpangBaru += (berat*penumpang);
        }
    }
     
     public double getPenumpang(int password){
         if(password==25){
             System.out.println("Password Benar");
             System.out.println();
         } else {
             System.out.println("Password Salah");
         }
         return password;
     }
     
     public void getAverage(){
         double rata;
         counter =+ penumpangBaru;
         rata = counter/penumpang;
         counter = rata;
     }
     
     public void cetakPenumpang(){
         System.out.println("Penumpang Bus Sekarang : "+penumpang);
         System.out.println("Maksimum Penumpang Bus : "+maxPenumpang);
         System.out.println("Rata-rata berat penumpang : "+counter);
         System.out.println();
     }
}

