package tugas3.ruang;
import tugas3.bidang.Lingkaran;
public class Kerucut extends Lingkaran implements MenghitungRuang {
    private double tinggi;

    public Kerucut(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (luas()*tinggi)/3;
       
    }

    @Override
    public double luasPermukaan() {
      return luas()+Math.PI*getJari()*sisiMiring();
    } 
    
    private double sisiMiring(){
        
        return Math.sqrt(tinggi*tinggi+getJari()*getJari());
    
    }
    
}
