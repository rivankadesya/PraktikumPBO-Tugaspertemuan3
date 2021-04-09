package tugas3.ruang;

public class Kerucut implements MenghitungRuang{
    private double jariJari, tinggi;

    public double getR() {
        return jariJari;
    }

    public void setR(double r) {
        this.jariJari = r;
    }

    public double getT() {
        return tinggi;
    }

    public void setT(double t) {
        this.tinggi = t;
    }

    public Kerucut(double r, double t) {
        this.jariJari = r;
        this.tinggi = t;
    }

    @Override
    public double volume() {
        System.out.println("VOLUME KERUCUT          :" + volume(jariJari, tinggi));
        return 0;
    }
    
    public double volume(double r, double t){
        if((r % 7) == 0)    //untuk fungsi jika jari jari habis di bagi 7
        {    
            return ((22*r*r*t)/7)/3;
        }
        else                //untuk fungsi jika jari jari tidak habis di bagi 7
        {
            return (3.14*r*r*t)/3;
        }
    }

    @Override
    public double luasPermukaan() {
        System.out.println("LUAS PERMUKAAN KERUCUT  :" + luaspermukaan(jariJari, tinggi));
        return 0;
    }
    
    public double luaspermukaan(double r, double t){
        float s;
        s = (float) Math.sqrt(Math.pow(r,2) + Math.pow(t,2)); //untuk menghitung sisi dari kerucut
        
        if((r % 7) == 0)    //untuk fungsi jika jari jari habis di bagi 7
        {
            return (22*r*(r+s))/7;
        }
        else                //untuk fungsi jika jari jari tidak habis di bagi 7
        {
            return (3.14*r*(r+s));
        }
    }
        
    }
