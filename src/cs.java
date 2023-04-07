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
public class cs extends employee {
    
    String jabat = "Cleaning Service";
    int gaji = 3_500_000;
    
    @Override
    int hitung(int gaji, int jamKerja) {
        int potongan = (int) ((super.jamKerja - jamKerja) * super.pot);
        int hasil = gaji - potongan;
        return hasil;
    }
}