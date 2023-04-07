///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author User
// */
public class security extends employee {
    
    String jabat = "Security";
    int gaji = 6_500_000;
    double pot = 0.02;
    
    @Override
    int hitung(int gaji, int jamKerja) {
        int potongan = (int) (jamKerja * pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}