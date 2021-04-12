package tugas3;


import java.util.Scanner;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;

public class Tugas3 {

    
   public static void main(String[] args) {
        
        do{
        
        int pilih;
        double panjang,lebar,tinggiBalok,jari,tinggiKerucut;
        Scanner input = new Scanner(System.in); 
        
        System.out.println("_________INPUT_________");
        System.out.println("1. BALOK");
        System.out.println("2. KERUCUT");
        System.out.println("3. EXIT");
        System.out.print("pilih : "); pilih = input.nextInt();
        
        switch(pilih){
        
            case 1: 
                System.out.print("PANJANG   : "); panjang = input.nextInt();
                System.out.print("LEBAR     : "); lebar = input.nextInt();
                System.out.print("TINGGI    : "); tinggiBalok = input.nextInt();
                
                Balok balok = new Balok(tinggiBalok,panjang,lebar);
                
                System.out.println("________OUTPUT_________");
                System.out.println("LUAS PERSEGI            : " + balok.luas());
                System.out.println("KELILING PERSEGI        : " + balok.keliling());
                System.out.println("VOLUME                  : " + balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK    : " + balok.luasPermukaan());
                
                
                break;
            case 2 :
                System.out.print("JARI-JARI : "); jari = input.nextInt();
                System.out.print("TINGGI    : "); tinggiKerucut = input.nextInt();
                
                Kerucut kerucut = new Kerucut(tinggiKerucut,jari);
                
                System.out.println("________OUTPUT_________");
                System.out.println("LUAS LINGKARAN          : " + kerucut.luas());
                System.out.println("KELILING LINGKARAN      : " + kerucut.keliling());
                System.out.println("VOLUME KERUCUT          : " + kerucut.volume());
                System.out.println("LUAS PERMUKAAN KERUCUT  : " + kerucut.luasPermukaan());
                
                break;
            default:
                
                System.out.println("SILAHKAN INPUT ULANG");
                
                break;
        
        
        } 
       }while(true);
        
    }
    
}
