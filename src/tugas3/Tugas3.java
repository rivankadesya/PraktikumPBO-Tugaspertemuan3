package tugas3;


import java.util.Scanner;
import tugas3.bidang.Lingkaran;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

public class Tugas3 {

    
    public static void main(String[] args) {
        do {
            int pilih;
            double panjang, lebar, tinggi, jariJari;
            Scanner input = new Scanner(System.in);

            System.out.println("INPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH : ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("PANJANG : ");
                    panjang = input.nextInt();
                    System.out.print("LEBAR   : ");
                    lebar = input.nextInt();
                    System.out.print("TINGGI  : ");
                    tinggi = input.nextInt();
                    System.out.println("_________OUTPUT_________");
                    PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    persegi.luas();
                    persegi.keliling();
                    balok.volume();
                    balok.luasPermukaan();
                    break;


                case 2:
                    System.out.print("JARI-JARI : ");
                    jariJari = input.nextInt();
                    System.out.print("TINGGI    : ");
                    tinggi = input.nextInt();
                    System.out.println("_________OUTPUT_________");
                    Lingkaran lingkaran = new Lingkaran(jariJari);
                    Kerucut kerucut = new Kerucut(jariJari, tinggi);
                    lingkaran.luas();
                    lingkaran.keliling();
                    kerucut.volume();
                    kerucut.luasPermukaan();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("SILAHKAN INPUT ULANG");
                    break;
            }
        } while (true);
        
        
        
        
    }
    
}
