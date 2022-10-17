import java.util.Scanner;

class Lingkaran {
    private int jariJari;

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return this.jariJari; 
    }
}

class HitungKelilingLuas extends Lingkaran {
    public double getLuas() {
        return Math.PI * super.getJariJari() * super.getJariJari(); 
    }

    public double getKeliling() {
        return Math.PI * 2 * super.getJariJari(); 
    }
}

public class HitungLuasKelilingLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jariJari;
        HitungKelilingLuas lingkaran = new HitungKelilingLuas();

        System.out.println("------------------------");
        System.out.println("SOAL NOMOR 4");    
        System.out.println("------------------------\n");

        System.out.print("Masukan jari jari lingkaran: ");
        jariJari = input.nextInt(); 

        lingkaran.setJariJari(jariJari);

        System.out.printf("\nLuas lingkaran = %.2f\n", lingkaran.getLuas());
        System.out.printf("Keliling lingkaran = %.2f\n\n", lingkaran.getKeliling());
        input.close();
    }
}

