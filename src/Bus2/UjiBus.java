package Bus2;

public class UjiBus {
    public static void main(String []args){
        Bus busBesar = new Bus(40);
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
