//
//import java.util.Scanner;
//
//
//
////    public String nama;
////    public int nip;
////    public String jabatan;
////    public int gaji;
////    public int jamker = 160;
////    public int potongan = 15_000;
////    
////    int hitung (int gaji, int jamker){
////        return 0; 
////    }
//    class User{
//        String nama;
//        String jabatan;
//        String status;
//        int bonus;
//        int gaji;
//        int potongan;
//        
//        User(String nama, String jabatan, int gaji, int bonus, int potongan){
//            this.nama = nama;
//            this.jabatan = jabatan;
//            this.gaji = gaji;
//            this.bonus = bonus;
//            this.potongan = potongan; 
//        }
//    }
//    
//    class Boss extends User {
//    int emp_id;
//    int emp_bonus;
//    
//        Boss (int id, String nama, String jabatan, int gaji, int bonus, int potongan){
//            super(nama, jabatan, gaji, bonus, potongan);
//            emp_id = id;
//        }
//        
//        class employee extends User {
//    int emp_id;
//    int emp_bonus;
//    
//        employee (int id, String nama, String jabatan, int gaji, int bonus, int potongan){
//            super(nama, jabatan, gaji, bonus, potongan);
//            emp_id = id;
//        }
//        
//       
//    
//    void printDetailsBoss (){
//        
//        Scanner scan = new Scanner (System.in);
//        
//        System.out.println("Masukkan NIP: ");
//        int noNIP = scan.nextInt();
//        //String status = scan.nextLine();
//        
//        
//        int jumlahGaji = gaji + bonus - potongan;
//        
//        if (noNIP == 2113){
//            System.out.println("NIP: "+noNIP);
//            System.out.println("Nama: "+nama);
//            
//            System.out.println("Status: ");
//            System.out.println("Status anda (sudah menikah/belum): ");
//                status = scan.nextLine();
//        
//        if (status == "sudah menikah"){
//            int valBonus = bonus +5_000;
//        }else {
//            int valBonus = bonus +4_000;
//        }
//        
//            System.out.println("Jabatan: "+jabatan);
//            System.out.println("Gaji: "+gaji);
//            System.out.println("Bonus: "+bonus);
//            System.out.println("Total Gaji: "+jumlahGaji);
//        }else{
//            System.out.println("Data tidak ditemukan");
//        }
//    }
//    
//    void printDetailsEmployee (){
//        
//        Scanner scan = new Scanner (System.in);
//        
//        System.out.println("Masukkan NIP: ");
//        int noNIP = scan.nextInt();
//        //String status = scan.nextLine();
//        
//        
//        int jumlahGaji = gaji + bonus - potongan;
//        
//        if (noNIP == 2223){
//            System.out.println("NIP: "+noNIP);
//            System.out.println("Nama: "+nama);
//            
//            System.out.println("Status: ");
//            System.out.println("Status anda (sudah menikah/belum): ");
//                status = scan.nextLine();
//        
//        if (status == "sudah menikah"){
//            int valBonus = bonus +5_000;
//        }else {
//            int valBonus = bonus +4_000;
//        }
//        
//            System.out.println("Jabatan: "+jabatan);
//            System.out.println("Gaji: "+gaji);
//            System.out.println("Bonus: "+bonus);
//            System.out.println("Total Gaji: "+jumlahGaji);
//        }else{
//            System.out.println("Data tidak ditemukan");
//        }
//    }
//    }}

public class employee {
    
    public int nip;
    public String nama;
    public String jabatan;
    public double gaji;
    public double pot = 20_000;
    public double jamKerja = 8;
    
    int hitung (int gaji, int jamKerja) {
        return 0;
    }
}
//
