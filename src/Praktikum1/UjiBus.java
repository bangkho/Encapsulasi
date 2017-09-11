package Praktikum1;

public class UjiBus {
    public static void main(String[] args){
        Bus Bus = new Bus(5);
        
        Bus.getPenumpang(17);
        Bus.getPenumpang(25);
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(1);
        Bus.getAverage();
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(1);
        Bus.getAverage();
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(1);
        Bus.getAverage();
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(2);
        Bus.getAverage();
        Bus.cetakPenumpang();
        
        Bus.addPenumpang(2);
        Bus.getAverage();
        Bus.cetakPenumpang();
    }
}
