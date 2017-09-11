package Siswa;

public class EncapSiswa {
    private String nama;
    private int absen;
    private String address;
    
    public int getAbsen(){
        return absen;
    }
    public String getNama(){
        return nama;
    }
    public String getAddress(){
        return address;
    }
    
    public void setAbs(int newAbsen){
        absen = newAbsen;
    }
    public void setNama(String newNama){
        nama = newNama;
    }
    public void setAdd(String newAdd){
        address = newAdd;
    }
}
