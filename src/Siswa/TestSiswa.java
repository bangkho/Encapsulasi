package Siswa;

public class TestSiswa {

    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setNama("Ahmad Khoirudin");
        siswa.setAbs(03);
        siswa.setAdd("Jl. Danau Bratan V G5/G14");
        
        System.out.println("Nama : "+siswa.getNama());
        System.out.println("Absen : "+siswa.getAbsen());
        System.out.println("Alamat : "+siswa.getAddress());
    }
    
}
