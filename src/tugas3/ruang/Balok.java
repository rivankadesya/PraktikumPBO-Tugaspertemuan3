package tugas3.ruang;

public class Balok implements MenghitungRuang{
    private double panjang, lebar, tinggi;

    public double getP() {
        return panjang;
    }

    public void setP(double p) {
        this.panjang = p;
    }

    public double getL() {
        return lebar;
    }

    public void setL(double l) {
        this.lebar = l;
    }

    public double getT() {
        return tinggi;
    }

    public void setT(double t) {
        this.tinggi = t;
    }

    public Balok(double p, double l, double t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    @Override
    public double volume() {
        System.out.println("VOLUME BALOK            : " + volume(panjang, lebar, tinggi));
        return 0;
    }
    
    public double volume(double p, double l, double t){
        return p*l*t;
    }

    @Override
    public double luasPermukaan() {
        System.out.println("LUAS PERMUKAAN BALOK    : " + luaspermukaan(panjang, lebar, tinggi));
        return 0;
    }
    
    public double luaspermukaan(double p, double l, double t){
        return 2*(p*l + p*t + l*t);
    }
    
    
}
