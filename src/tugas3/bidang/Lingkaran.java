package tugas3.bidang;

public class Lingkaran implements MenghitungBidang{
    private double jariJari;

    public double getR() {
        return jariJari;
    }

    public void setR(double r) {
        this.jariJari = r;
    }

    public Lingkaran(double r) {
        this.jariJari = r;
    }

    @Override
    public double luas() {
        System.out.println("LUAS LINGKARAN          : " + luas(jariJari) );
        return 0;
    }
    public double luas(double r){
        if((r % 7) == 0)   //untuk fungsi jika jari jari bisa di bagi 7
        {
         return (22*r*r)/7;
        }
        else            //untuk fungsi jika jari jari tidak habis di bagi 7
        {
                
         return 3.14*r*r;    
        }
    }
      

    @Override
    public double keliling() {
        System.out.println("KELILING LINGKARAN      : " + keliling(jariJari) );
        return 0;
    }
    
    public double keliling(double r) {
          if((r % 7) == 0)    //untuk fungsi jika jari jari bisa di bagi 7
        {
         return (22*2*r)/7;
        }
          else                //untuk fungsi jika jari jari bisa di bagi 7
         {
         return 3.14*2*r;          
         }
    }
    
}
